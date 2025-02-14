import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class TaskTracker {
    private static final String FILE_NAME = "tasks.json";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java TaskTracker <command> [options]");
            return;
        }

        String command = args[0];
        switch (command) {
            case "add":
                addTask(Arrays.copyOfRange(args, 1, args.length));
                break;
            case "update":
                updateTask(Arrays.copyOfRange(args, 1, args.length));
                break;
            case "delete":
                deleteTask(Arrays.copyOfRange(args, 1, args.length));
                break;
            case "list":
                listTasks(Arrays.copyOfRange(args, 1, args.length));
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }

    private static void addTask(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java TaskTracker add <description>");
            return;
        }

        String description = String.join(" ", args);
        JSONObject task = new JSONObject();
        task.put("id", UUID.randomUUID().toString());
        task.put("description", description);
        task.put("status", "todo");
        task.put("createdAt", new Date().toString());
        task.put("updatedAt", new Date().toString());

        JSONArray tasks = readTasks();
        tasks.add(task);
        writeTasks(tasks);
        System.out.println("Task added successfully!");
    }

    private static void updateTask(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java TaskTracker update <id> <description/status>");
            return;
        }

        String id = args[0];
        String updateField = args[1];
        String newValue = args.length > 2 ? args[2] : "";

        JSONArray tasks = readTasks();
        for (Object obj : tasks) {
            JSONObject task = (JSONObject) obj;
            if (task.get("id").equals(id)) {
                if ("description".equals(updateField)) {
                    task.put("description", newValue);
                } else if ("status".equals(updateField)) {
                    task.put("status", newValue);
                }
                task.put("updatedAt", new Date().toString());
                writeTasks(tasks);
                System.out.println("Task updated successfully!");
                return;
            }
        }
        System.out.println("Task not found!");
    }

    private static void deleteTask(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java TaskTracker delete <id>");
            return;
        }

        String id = args[0];
        JSONArray tasks = readTasks();
        tasks.removeIf(obj -> ((JSONObject) obj).get("id").equals(id));
        writeTasks(tasks);
        System.out.println("Task deleted successfully!");
    }

    private static void listTasks(String[] args) {
        String filter = args.length > 0 ? args[0] : "all";

        JSONArray tasks = readTasks();
        for (Object obj : tasks) {
            JSONObject task = (JSONObject) obj;
            String status = (String) task.get("status");
            if ("all".equals(filter) || status.equals(filter)) {
                System.out.println(task);
            }
        }
    }

    private static JSONArray readTasks() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                return new JSONArray();
            }

            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(FILE_NAME);
            return (JSONArray) parser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray();
        }
    }

    private static void writeTasks(JSONArray tasks) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(tasks.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.util.Scanner;

class Course {
    private String courseName;
    private String courseCode;

    public void setCourseName(String courseName) {
    	 this.courseName = courseName.trim();
//        if (courseName.length() <= 100) {
//            this.courseName = courseName.trim();
//        } else {
//            this.courseName = "Invalid course name length";
//        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseCode(String courseCode) {
    	this.courseCode = courseCode.trim();
//        if (courseCode.length() <= 10) {
//            this.courseCode = courseCode.trim();
//        } else {
//            this.courseCode = "Invalid course code length";
//        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getDetails() {
        return "Course Name: " + courseName + ", Course Code: " + courseCode;
    }
}

class OnlineCourse extends Course {
    private String platform;

    public void setPlatform(String platform) {
        this.platform = platform.trim();
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Platform: " + platform;
    }
}

class OfflineCourse extends Course {
    private String location;

    public void setLocation(String location) {
        this.location = location.trim();
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Location: " + location;
    }
}

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the type of course
        String courseType = scanner.nextLine().trim();

        // Read the attributes
        String[] attributes = scanner.nextLine().split(",");

        // Ensure correct number of attributes
//        if (attributes.length != 3) {
//            System.out.println("Invalid number of attributes.");
//            return;
//        }-

        Course course;

        // Create and initialize the appropriate course object
        if (courseType.equals("OnlineCourse")) {
            OnlineCourse onlineCourse = new OnlineCourse();
            onlineCourse.setCourseName(attributes[0].trim());
            onlineCourse.setCourseCode(attributes[1].trim());
            onlineCourse.setPlatform(attributes[2].trim());
            course = onlineCourse;
        } else if (courseType.equals("OfflineCourse")) {
            OfflineCourse offlineCourse = new OfflineCourse();
            offlineCourse.setCourseName(attributes[0].trim());
            offlineCourse.setCourseCode(attributes[1].trim());
            offlineCourse.setLocation(attributes[2].trim());
            course = offlineCourse;
        } else {
            System.out.println("Invalid course type.");
            return;
        }

        // Output the course details
        System.out.println("Course Deatils: " + course.getDetails());
    }
}

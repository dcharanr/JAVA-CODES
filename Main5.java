import java.util.Scanner;

class Appliance {
    private String brand;
    private String power;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public String getDescription() {
        return "Brand: " + brand + ", Power: " + power;
    }
}

class WashingMachine extends Appliance {
    private String capacity;

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Capacity: " + capacity;
    }
}

class Refrigerator extends Appliance {
    private String volume;

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Volume: " + volume;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the type of appliance
        String applianceType = scanner.nextLine();
        
        // Read the attributes
        String[] attributes = scanner.nextLine().split(",");

        Appliance appliance;

        // Create and initialize the appropriate appliance object
        if (applianceType.equals("WashingMachine")) {
            WashingMachine wm = new WashingMachine();
            wm.setBrand(attributes[0].trim());
            wm.setPower(attributes[1].trim());
            wm.setCapacity(attributes[2].trim());
            appliance = wm;
        } else if (applianceType.equals("Refrigerator")) {
            Refrigerator fridge = new Refrigerator();
            fridge.setBrand(attributes[0].trim());
            fridge.setPower(attributes[1].trim());
            fridge.setVolume(attributes[2].trim());
            appliance = fridge;
        } else {
            System.out.println("Invalid appliance type.");
            return;
        }
        
        // Output the description
        System.out.println("Appliance Description: " + appliance.getDescription());
    }
}

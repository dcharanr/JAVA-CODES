import java.util.Scanner;

// Base class
class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInfo() {
        return "Brand: " + brand + ", Model: " + model;
    }
}

// Car class inheriting from Vehicle
class Car extends Vehicle {
    private int seats;

    public Car(String brand, String model, int seats) {
        super(brand, model);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Seats: " + seats;
    }
}

// Bike class inheriting from Vehicle
class Bike extends Vehicle {
    private String type;

    public Bike(String brand, String model, String type) {
        super(brand, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Type: " + type;
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Car/Bike");/
        String vehicleType = scanner.nextLine().trim();

//        System.out.println("Enter details (Format: Brand,Model,Seats/Type):");
        String details = scanner.nextLine().trim();
        String[] detailParts = details.split(",");

        String brand = detailParts[0].trim();
        String model = detailParts[1].trim();

        if (vehicleType.equalsIgnoreCase("Car")) {
            int seats = Integer.parseInt(detailParts[2].trim());
            Car car = new Car(brand, model, seats);
            System.out.println("Vehicle Info: " + car.getInfo());
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            String type = detailParts[2].trim();
            Bike bike = new Bike(brand, model, type);
            System.out.println("Vehicle Info: " + bike.getInfo());
        } else {
            System.out.println("Invalid vehicle type");
        }

        scanner.close();
    }
}

import java.util.Scanner;

// Base class
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return "";
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}

// Derived class Dog
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String getSound() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', age=" + getAge() + ", breed='" + breed + "'}";
    }
}

// Derived class Cat
class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getSound() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat{name='" + getName() + "', age=" + getAge() + ", color='" + color + "'}";
    }
}

// Main class
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter animal type (Dog/Cat):");
        String animalType = scanner.nextLine().trim();

        System.out.println("Enter details (Format: Name,Age,Breed/Color):");
        String details = scanner.nextLine().trim();
        String[] detailParts = details.split(",");

        String name = detailParts[0].trim();
        int age = Integer.parseInt(detailParts[1].trim());

        if (animalType.equalsIgnoreCase("Dog")) {
            String breed = detailParts[2].trim();
            Dog dog = new Dog(name, age, breed);
            System.out.println("Sound of Dog: " + dog.getSound());
        } else if (animalType.equalsIgnoreCase("Cat")) {
            String color = detailParts[2].trim();
            Cat cat = new Cat(name, age, color);
            System.out.println("Sound of Cat: " + cat.getSound());
        } else {
            System.out.println("Invalid animal type");
        }

        scanner.close();
    }
}

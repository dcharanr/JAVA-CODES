import java.util.Scanner;
abstract class Shape {
    float area;
    abstract void acceptInput();
    abstract void calcArea();
    float getArea() {
        return area;
    }
}
class Square extends Shape {
    float side;
    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextFloat();
        scanner.close();
    }
    public void calcArea() {
        area = side * side;
    }
}
class Rectangle extends Shape {
    float length, breadth;
    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextFloat();
        breadth = scanner.nextFloat();
        scanner.close();
    }
    public void calcArea() {
        area = length * breadth;
    }
}
class Circle1 extends Shape {
    float radius;
    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextFloat();
        scanner.close();
    }
    public void calcArea() {
        area = (float) (Math.PI * radius * radius);
    }
}
public class Abstaction1 {
//    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapeType = scanner.nextLine();
        Shape shape = null;
        switch (shapeType) {
            case "Square":
                shape = new Square();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Circle1":
                shape = new Circle1();
                break;
            default:
                System.out.println("Invalid shape type.");
//                return;
        }
        shape.acceptInput();
        shape.calcArea();
        System.out.println("Area of " + shapeType + ": " + shape.getArea());
        scanner.close();
    }
}
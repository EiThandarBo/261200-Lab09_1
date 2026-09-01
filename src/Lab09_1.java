import oop.ocp.*;

public class Lab09_1 {
    public static void main(String[] args) {

        // 1. Area calculation with default values
        System.out.println("---- Area Calculation with default value ----");
        System.out.println("Area of Rectangle: " + AreaCalculator.calculateArea(new Rectangle()));
        System.out.println("Area of Circle: " + AreaCalculator.calculateArea(new Circle()));
        System.out.println("Area of Ellipse: " + AreaCalculator.calculateArea(new Ellipse()));

        // 2. Area calculation with custom values
        System.out.println("\n---- Area Calculation with value ----");
        System.out.println("Area of Rectangle: " + AreaCalculator.calculateArea(new Rectangle(5, 6)));
        System.out.println("Area of Circle: " + AreaCalculator.calculateArea(new Circle(4)));
        System.out.println("Area of Ellipse: " + AreaCalculator.calculateArea(new Ellipse(4, 5)));
    }
}
package oop.ocp;

public class AreaCalculator {
    /*
     * Open-Closed Principle (OCP);
     * Follows OCP: Open for extension (can take any new Shape subclass)
     * but closed for modification (no need to change this code when adding shapes).
     */
    public static double calculateArea(Shape shape){
        return shape.getArea();
    }
}

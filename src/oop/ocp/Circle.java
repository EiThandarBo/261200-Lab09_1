package oop.ocp;

//concrete subclass representing a Circle Shape
public class Circle extends Shape {
    private double radius;
    private static final double DEFAULT_RADIUS = 1.0;//Default value of radius

    public double getRadius(){//Getter for radius
        return radius;
    }

    //Setter for radius
    public void setRadius(double radius){
        if(radius > 0.0)//Check validation
            this.radius = radius;
        else
            this.radius = DEFAULT_RADIUS;
    }

    //Default constructor using constructor chaining to set default values
    public Circle(){
        this(DEFAULT_RADIUS);
    }

    // Constructor to initialize the circle with a specific radius
    public Circle(double radius){
        this.setRadius(radius);
    }

    @Override//Calculate and return the area of Circle
    public double getArea() {
        return Math.PI * radius * radius ;
    }
}

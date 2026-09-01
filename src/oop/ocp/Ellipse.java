package oop.ocp;

//concrete subclass representing an Ellipse Shape
public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    //Default values for axis length
    private static final double DEFAULT_majorAxis = 1.0;
    private static final double DEFAULT_minorAxis = 1.0;

    //Getter and Setter with basic validation
    public double getMajorAxis(){//Getter for Major Axis
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis){//Setter for Major Axis
        if(majorAxis > 0.0)//Check validation
            this.majorAxis = majorAxis;
        else
            this.majorAxis = DEFAULT_majorAxis;
    }

    public double getMinorAxis(){//Getter for Minor Axis;
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis){//Setter for minor Axis
        if(minorAxis > 0.0 && minorAxis <= majorAxis)//Check validation
            this.minorAxis = minorAxis;
        else
            this.minorAxis = DEFAULT_minorAxis;
    }

//Default constructor using constructor chaining
    public Ellipse(){
        this(DEFAULT_majorAxis, DEFAULT_minorAxis);
    }

//Parameterize constructor
    public Ellipse(double majorAxis, double minorAxis){
        this.setMajorAxis(majorAxis);
        this.setMinorAxis(minorAxis);
    }

    @Override// Calculates and returns the area of the ellipse
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}

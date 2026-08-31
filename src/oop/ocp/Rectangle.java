package oop.ocp;
//Construct Subclass representing a Rectangle Shape
public class Rectangle extends Shape{
    private double width;
    private double height;

    //Default value for width and lenght
    private static final double DEFAULT_WIDTH = 1.0;
    private static final double DEFAULT_HEIGHT = 1.0;

    public double getWidth(){//Getter for Width
        return width;
    }

    public void setWidth(double width){//Setter for width
        if(width>0.0)//check validation
            this.width = width;
        else
            this.width = DEFAULT_WIDTH;
    }

    public double getHeight(){//Getter for height
        return height;
    }

//Setter for height
    public void setHeight(double height){
        if(height>0.0)//check validation
            this.height = height;
        else
            this.height = DEFAULT_HEIGHT;
    }

    public Rectangle(){//default constructor using constructor chaining
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

//Parameterize constructor
    public Rectangle(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }

// Calculates and returns the area of the Rectangle
    @Override
    public double getArea() {
        return this.width * this.height;
    }
}

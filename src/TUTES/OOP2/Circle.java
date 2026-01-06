package TUTES.OOP2;

public class Circle {
    private double radius ;
    private String color ;
    private double area;
    public Circle (double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius (){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea (){
        return(Math.PI * Math.pow(radius,2));
    }
}

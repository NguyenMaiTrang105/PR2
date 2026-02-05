package src.TUT3;
public class Circle {
    private double radius;
    private String color;
    public Circle(){};
    public Circle(double r){
        this.radius=r;
    }
    public Circle (double r, String c){
        this.radius=r;
        this.color=c;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return (radius*radius)*Math.PI;
    }
}

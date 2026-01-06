package src.TUTES.OOP2;

public class test_circle {
    public static void main(String[] args) {
        Circle C1 = new Circle(2.0,"blue");
        Circle C2 = new Circle(2.0, "red");
        Circle C3 = new Circle(1.0,"red");
        System.out.println("Circle 1: Radius = " + C1.getRadius() + ", Color = " + C1.getColor() + ", Area = " + C1.getArea());
        System.out.println("Circle 2: Radius = " + C2.getRadius() + ", Color = " + C2.getColor() + ", Area = " + C2.getArea());
        System.out.println("Circle 3: Radius = " + C3.getRadius() + ", Color = " + C3.getColor() + ", Area = " + C3.getArea());

    }
}

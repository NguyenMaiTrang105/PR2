package src.TUT3;
public class Circle_test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0,"blue");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.getArea());

        Circle c2 = new Circle(2.0,"red");
    }
}

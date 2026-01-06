package TUT5_ex3;

public class test {
    public static void main(String[] args) {
        Shape s1 = new Shape("red" , true);
        System.out.println(s1);

        Circle c1 = new Circle(1.3 ,"blue", false);
        System.out.println(c1);

        Rectangle r1 = new Rectangle(3, 4, "orange" , true);
        System.out.println(r1);

        Square sq1= new Square(5, "black", true);
        System.out.println(sq1);
    }
}

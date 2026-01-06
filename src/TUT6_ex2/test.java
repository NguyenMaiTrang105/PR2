package src.TUT6_ex2;

public class test {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("A");
        Monster m2 = new WaterMonster("B");
        Monster m3 = new StoneMonster("C");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());


    }
}

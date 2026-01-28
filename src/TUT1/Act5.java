package src.TUT1;

import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many eggs do you have");
        int n = sc.nextInt();
        System.out.println(STR."The extra eggs are left over is\{n%12}");
        int g = n/144;
        int l = n%12;
        System.out.println(STR."Your number of eggs is \{g} gross, \{} dozen, and \{l}");

    }
}

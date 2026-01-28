package src.TUT1;

import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        String name = sc.nextLine();
        String upperCaseName = name.toUpperCase();
        System.out.println("Hello, "+upperCaseName +", nice to meet you!");
    }
}

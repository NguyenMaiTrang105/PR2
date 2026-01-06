package TUT3;

import java.util.Scanner;

public class Product {
    private  String name;
    private  double price;
    private  double discount;

    public Product (String name, double price, double discount){
        this.name=name;
        this.price =price;
        this.discount=discount;
    }
    public Product (String name, double price){
        this.name=name;
        this.price =price;
    }
    public void setName( String name){
     this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setDiscount (double discount){
        this.discount=discount;
    }

    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getDiscount(){
        return discount;
    }

    private double getImportTax(){
        return price* 0.10 ;
    }
    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Unit Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Import Tax: " + getImportTax());
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
            name = sc.next();
	    System.out.println("Enter product price: ");
            price = sc.nextDouble();
	    System.out.println("Enter product discount: ");
            discount = sc.nextDouble();
    }
}

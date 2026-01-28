package src.TUT2;

import java.util.Scanner;

public class Product {
    public  String name;
    public double price;
    public  double discount;
    private  int quantity;
    private  static int productCount =0;
    private static double totalRevenue =0;
    private static double totalDiscount=0;


    public Product(String name, double price, double discount , int quantity){
        this.name=name;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;

        productCount++;
        double revenue = price * quantity;
        double discountAmount = revenue * (discount/100);
        totalRevenue += (revenue-discountAmount);
        totalDiscount +=discount;
    }

    /*private double getImportTax(){
    return price * 0.10;
    }

    * */
    public double getImportTax(){
        return price* 0.10;
    }
    public void displayInfo(){
        System.out.println("Product: "+this.name);
        System.out.println("Price: $"+this.price +"%");
        System.out.println("Discount: "+this.discount);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Tax: $"+getImportTax());
    }
    public void updateQuantity(int newQuantity) {
        // Remove old values
        double oldRevenue = price * quantity;
        double oldDiscount = oldRevenue * discount;

        totalRevenue -= (oldRevenue - oldDiscount);
        totalDiscount -= oldDiscount;

        // Update quantity
        this.quantity = newQuantity;

        // Add new values
        double newRevenue = price * quantity;
        double newDiscount = newRevenue * discount;

        totalRevenue += (newRevenue - newDiscount);
        totalDiscount += newDiscount;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the product");
        name = sc.nextLine();
        System.out.print("Enter price of the product");
        price=sc.nextDouble();
        System.out.print("Enter the discount of the product");
        discount= sc.nextDouble();
    }
    public static int getProductCount(){
        return productCount;
    }
    public static double getTotalRevenue(){
        return totalRevenue;
    }
    public static  double getAverageDiscount(){
        if(productCount==0)
            return 0;
        return (totalDiscount/productCount);
    }
    public static void displayStatistics(){
        System.out.println("Total Products Created: "+  productCount);
        System.out.println("Total Potential Revenue: $"+ totalRevenue);
        System.out.println("Average Discount: "+getAverageDiscount() +"%");
    }

}

package src.TUT2;

public class ProductStatisticsDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop",1000.00,10,50);
        Product product2 = new Product("Mouse",25.00,5,200);
        Product product3 = new Product("Keyboard",75.00,0,100);
        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
        Product.displayStatistics();

    }

}

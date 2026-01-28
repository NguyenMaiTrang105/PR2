package src.TUT1;

public class Calculator {
    private int result;
    public Calculator (){
        this.result = 0;
    }
   public int add(int a, int b ){
        this.result = a+b;
       return this.result;
   }
   public  int subtract (int a , int b ){
       this.result = a-b;
       return this.result;
   }
   public  int multiply (int a , int b){
        this.result = a*b;
       return this.result;
   }
    public double divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}

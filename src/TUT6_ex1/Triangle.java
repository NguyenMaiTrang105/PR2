package TUT6_ex1;

public class Triangle extends Shape {
    private int base;
    private int height;
    public Triangle (int base, int height, String color){
        super(color);
        this.base=base;
        this.height=height;
    }
    public double getArea(){
        return 0.5*base*height;
    }
    @Override
    public String toString(){
        return "Triangle Shape: "+ super.toString()+"base="+base +"height="+height;
    }
}

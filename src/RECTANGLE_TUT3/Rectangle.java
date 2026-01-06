package src.RECTANGLE_TUT3;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle (float length, float width){
        this.width=width;
        this.length=length;
    }
    public Rectangle(){
        this.width=1.0f;
        this.length=1.0f;
    }
    public float getLength(){
        return length;
    }
    public void setLength (float length){
        this.length=length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth (float width){
        this.width=width;
    }
    public double getArea (){
        return (double) width*length;
    }
    public double getPerimeter(){
        return (double) (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[length ="+ length +",width= "+ width + "]";
    }
}

package src.TUT3;

public class Point2D {
    private double x;
    private double y;
    public Point2D (double x, double y){
        this.x = x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance (double x, double y){
        return (Math.pow(x,2)-Math.pow(y,2));
    }
}

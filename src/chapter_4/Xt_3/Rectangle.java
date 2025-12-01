package chapter_4.Xt_3;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        this.length = 4;
        this.width = 3;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
package chapter_4.Xt_3;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid() {
         super(4, 3); 
         this.height = 6;
     }
    public Cuboid(double length, double width, double height) {
         super(length, width); 
         this.height = height;
     }
    public double getVolume() {
         return getArea() * height;
     }

    public double getSurfaceArea() {
         return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }
}

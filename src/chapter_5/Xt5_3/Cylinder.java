package chapter_5.Xt5_3;

public class Cylinder implements Z {
	 private double radius;
     private double height;
     private String color;
     public Cylinder(double radius, double height) {
             this.radius = radius;
             this.height = height;
     }
     public double area() {
             return (2 * PI * radius * height);
     }
     public void setColor(String c) {
             this.color = c;
             System.out.println("颜色为: " + color);
     }
     public double volume() {
             return (PI * radius * radius * height);
     }
}

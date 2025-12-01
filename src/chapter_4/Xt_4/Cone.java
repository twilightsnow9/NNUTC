package chapter_4.Xt_4;

public class Cone extends Circle {
    private double height;   // 圆锥高度
    private double slant;    // 圆锥母线长度

    // 构造函数：初始化半径和高度
    public Cone(double radius, double height) {
        super.setRadius(radius); // 调用父类设置半径
        this.height = height;
    }


    // 计算圆锥体积
    public double getVolume() {
        return (1.0/3) * super.getArea() * height;
    }

    // 计算圆锥表面积
    public double getSurfaceArea() {
        double baseArea = super.getArea();      // 底面积
        double lateralArea = Math.PI * super.getRadius() * slant; // 侧面积
        return baseArea + lateralArea;
    }
}
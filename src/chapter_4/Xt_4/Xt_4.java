package chapter_4.Xt_4;

public class Xt_4 {
    public static void main(String[] args) {
        Cone cone = new Cone(10.0, 6.0);
        if(cone != null&&cone.getRadius()>0) {
            System.out.println("底面积: " + cone.getArea());
            System.out.println("表面积: " + cone.getSurfaceArea());
            System.out.println("体积: " + cone.getVolume());
        }else {
            System.out.println("圆锥参数错误！");
        }
    }
}

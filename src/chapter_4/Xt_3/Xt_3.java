package chapter_4.Xt_3;

public class Xt_3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(4, 3, 6);
        
        System.out.println("长方体的底面积为：" + cuboid.getArea() + "cm²");
        System.out.println("长方体的体积为：" + cuboid.getVolume() + "cm³");
        System.out.println("长方体的表面积为：" + cuboid.getSurfaceArea() + "cm²");
   }
}

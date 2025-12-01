package chapter_5.Xt5_3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cylinder cylinder = new Cylinder(3.0, 4.0);
        cylinder.setColor("红色");
        System.out.println("表面积为：" + cylinder.area());
        System.out.println("体积为：" + cylinder.volume());
	}

}

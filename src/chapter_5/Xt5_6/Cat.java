package chapter_5.Xt5_6;

public class Cat {
    private double weight;
//    内部类
    public Cat(double weight) {
            this.weight = weight;
    }
    class CatA {
            private String color;
            public CatA(String color) {
                    this.color = color;
            }
            public void show() {
                    System.out.println("颜色:" + color + ",体重:" + weight + "kg");
            }
    }
}

package chapter_4.Xt_1;

public class Dog extends Animal {
    String name = "哈巴狗";
    @Override
    public void printInfo() {
            System.out.println("它叫" + name+",今年2岁了！！");
    }
}
package chapter_4.Xt_2;

public class Staff {
    private String name;
    private int age;
    private String sex;

    public Staff(String name, int age, String sex) { // 构造方法
            this.setName(name);
            this.setAge(age);
            this.setSex(sex);
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public int getAge() {
            return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public String getSex() {
            return sex;
    }

    public void setSex(String sex) {
            this.sex = sex;
    }
}

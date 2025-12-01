package chapter_3;

public class Programmer {
    private String name;
    private String sex;
    private int age;
    private String phoneNumber;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//    public Xt3_1() {
//        this.age
//    }
    public void eat() {
        System.out.println("绋嬪簭鍛�"+this.name +"姝ｅ湪鍚�");
    }
    public void play() {
        System.out.println("绋嬪簭鍛�"+this.name +"姝ｅ湪鐜�");
    }


    public void sleep() {
        System.out.println("绋嬪簭鍛�"+this.name +"鐫¤");
    }
    public Programmer(String name, String sex, int age, String phoneNumber, String email, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

}

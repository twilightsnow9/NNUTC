package chapter_7.xt7_2;

class Employee {
    String name;
    String idCard;
    int age;
    // 可以直接在关键字throws写Exception
    public Employee(String name, String idCard, int age)
            throws NameNullExcep, IdCardExcep, HeightAgeExcep, LittleAgeExcep {
        super();
        this.name = name;
        this.idCard = idCard;
        this.age = age;

        if ((name == null) || name == "") {
            throw new NameNullExcep("名字不能为空！");
        } else if (idCard.length() != 18) {
            throw new IdCardExcep("身份证不合法！");
        } else if (age < 18) {
            throw new LittleAgeExcep("年龄太小了！");
        } else if (age > 60) {
            throw new HeightAgeExcep("年龄太高了！");
        } else {
            System.out.println("符合我们的要求:" + "姓名:" + name + ",身份证:" + idCard + ",年龄:" + age);
        }
    }
}
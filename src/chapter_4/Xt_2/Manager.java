package chapter_4.Xt_2;

public class Manager extends Staff {
    private String position;
    private int annual_salary;

    public Manager(String name, int age, String sex, String position, int annual_salary) {
            super(name, age, sex);
            this.position = position;
            this.annual_salary = annual_salary;
    }

    public String getPosition() {
            return position;
    }

    public void setPosition(String position) {
            this.position = position;
    }

    public int getAnnual_salary() {
            return annual_salary;
    }
    public void setAnnual_salary(int annual_salary) {
            this.annual_salary = annual_salary;
    }

    public String Info() {
            return (this.getName() + this.getAge() + this.getSex() + this.position + this.annual_salary);
    }
}

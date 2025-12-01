package chapter_3;

public class Student1 {
	private String name;
	private int age;
	private String sex;
	private double scoreC;
	private double scoreJAVA;
	private double scoreEng;
	
	public void scoreSum() {
		System.out.println("总分为:"+ this.scoreC + this.scoreJAVA + this.scoreEng);
		
	}
	public void scoreAvg() {
		System.out.println("总分为:"+ (this.scoreC + this.scoreJAVA + this.scoreEng)/3.00);
	}
	public Student1(String name,int age,String sex,double scoreC,double scoreJAVA,double scoreEng) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.scoreC = scoreC;
		this.scoreJAVA = scoreJAVA;
		this.scoreEng = scoreEng;
	}
	public void info() {
		System.out.println(
				this.name +" "+
				this.age +" "+
				this.sex +" "+
				this.scoreC +" "+
				this.scoreJAVA +" "+
				this.scoreEng
				);
	}
}
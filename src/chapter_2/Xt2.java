package chapter_2;

public class Xt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int cock; 
        int hen; 
        int chicken;
        for (cock = 0; cock <= 20; cock++) {
                for (hen = 0; hen <= 33; hen++) {
                        for (chicken = 0; chicken <= 99; chicken = chicken + 3) {
                                if (cock + hen + chicken == 100 && cock * 5 + hen * 3 + chicken / 3 == 100) {
                                        System.out.println("公鸡：" + cock);
                                        System.out.println("母鸡：" + hen);
                                        System.out.println("小鸡：" + chicken);
                                        System.out.println();
                                }
                        }
                }
        }
	}

}

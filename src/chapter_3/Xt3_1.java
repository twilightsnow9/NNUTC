package chapter_3;

import java.util.Scanner;

public class Xt3_1 {
    public static void main(String[] args) {
        System.out.print("杈撳叆闇�瑕佹煡鎵剧殑鍚嶅瓧:");
        Scanner in = new Scanner(System.in);
        Programmer[] programmerinfo = new Programmer[2];
        programmerinfo[0] = new Programmer("寮犱笁", "鐢�", 33, "123456789", "123456@qq.com", "骞夸笢");
        programmerinfo[1] = new Programmer("鏉庡洓", "濂�", 22, "987654321", "654321@qq.com", "骞垮窞");
        String name = in.nextLine();
        int j = 0;
        for (int i = 0; i < programmerinfo.length; i++) {
            if (programmerinfo[i].getName().equals(name)) {
                System.out.println(programmerinfo[i].getName());
                System.out.println(programmerinfo[i].getSex());
                System.out.println(programmerinfo[i].getAge());
                System.out.println(programmerinfo[i].getPhoneNumber());
                System.out.println(programmerinfo[i].getEmail());
                System.out.println(programmerinfo[i].getAddress());
                j++;
            }
        }
        if (j == 0) {
            System.out.println("娌掓湁璇ヤ俊鎭�");
        }
    }
}

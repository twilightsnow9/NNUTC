package chapter_5.Xt5_4;
import chapter_5.Xt5_4.Callback;

public class StudentClass {
    Callback callBack;
    public StudentClass(Callback callBack) {
            super();
            this.callBack = callBack;
    }
    public void doStudy() {
            System.out.println("做做做做做....做完了");
            callBack.doCall();
    }
}

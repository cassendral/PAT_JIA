import java.util.ArrayList;
import java.util.Scanner;

public class Ex_1002 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        float[] a1 = new float[1000];
        for (int i = 0; i < n1; i++) { //i是项数
            int zhishu = (int)in.nextFloat();
            a1[zhishu] = in.nextFloat();
        }
        int n2 = in.nextInt();
        float[] a2 = new float[1000];
        for (int i = 0; i < n2; i++) {
            int zhishu = Integer.parseInt(in.nextFloat() + "");
            a2[zhishu] = in.nextFloat();
        }

    }
}

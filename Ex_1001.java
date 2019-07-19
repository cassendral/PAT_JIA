import java.util.Scanner;

public class Ex_1001 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a + b;
        String ss = s + "";
        if (s < 0) {
            System.out.print("-");
            for (int i = 1; i < ss.length(); i++) {
                System.out.print(ss.charAt(i));
                if (((ss.length() - i - 1) % 3 == 0) && (i != ss.length() - 1)) {
                    System.out.print(",");
                }
            }
        } else {
            for (int i = 0; i < ss.length(); i++) {
                System.out.print(ss.charAt(i));
                if (((ss.length() - i - 1) % 3 == 0) && (i != ss.length() - 1)) {
                    System.out.print(",");
                }
            }
        }

    }
}

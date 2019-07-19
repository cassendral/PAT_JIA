import java.util.Scanner;

public class Ex_1005 {

    public static String EnglishNum(char num) {
        switch (num) {
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            default:
                return "false";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] digits = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Integer.parseInt(digits[i] + "");
        }
        String strSum = sum + "";
        char[] charSum = strSum.toCharArray();
        for (int i = 0; i < charSum.length; i++) {
            if (i == charSum.length - 1) {
                System.out.print(EnglishNum(charSum[i]));
            } else {
                System.out.print(EnglishNum(charSum[i]) + " ");
            }
        }
    }
}
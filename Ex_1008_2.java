import java.util.Scanner;

public class Ex_1008_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a[] = new int[in.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int floorNow = 0, sTime = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < floorNow) {
                sTime += 4 * (floorNow - a[i]) + 5;
            } else if (a[i] > floorNow) {
                sTime += 6 * (a[i] - floorNow) + 5;
            } else {
                sTime += 5;
            }
            floorNow = a[i];
        }
        System.out.println(sTime);
    }
}

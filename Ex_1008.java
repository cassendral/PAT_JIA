import java.util.Scanner;

public class Ex_1008 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String floors[] = str.split(" ");
        int floorNow = 0, sTime = 0;
        for (int i = 1; i < floors.length; i++) {
            int floorNext = Integer.parseInt(floors[i]);
            if (floorNext < floorNow) {
                sTime += 4 * (floorNow - floorNext) + 5;
            } else if (floorNext > floorNow) {
                sTime += 6 * (floorNext - floorNow) + 5;
            } else {
                sTime += 5;
            }
            floorNow = floorNext;
        }
        System.out.println(sTime);
    }
}

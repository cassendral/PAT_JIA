import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex_1006 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] signInfo = new String[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                signInfo[i][j] = in.next();
            }
        }
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        int earliest = 0, latest = 0;
        Date come = df.parse(signInfo[0][1]);
        Date go = df.parse(signInfo[0][2]);
        for (int i = 1; i < n; i++) {
            Date dt1 = df.parse(signInfo[i][1]);
            if (dt1.getTime() < come.getTime()) {
                earliest = i;
                come = dt1;
            }
            Date dt2 = df.parse(signInfo[i][2]);
            if (dt2.getTime() > go.getTime()) {
                latest = i;
                go = dt2;
            }
        }
        System.out.println(signInfo[earliest][0] + " " + signInfo[latest][0]);
    }
}

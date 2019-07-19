import java.util.Scanner;

public class Ex_1009_2 {
    public static void main(String[] args) {

        //读入数据
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int aZhiShu[] = new int[n1];
        float aXiShu[] = new float[n1];
        for (int i = 0; i < n1; i++) {
            aZhiShu[i] = in.nextInt();
            aXiShu[i] = in.nextFloat();
        }
        int n2 = in.nextInt();
        int bZhiShu[] = new int[n2];
        float bXiShu[] = new float[n2];
        for (int i = 0; i < n2; i++) {
            bZhiShu[i] = in.nextInt();
            bXiShu[i] = in.nextFloat();
        }

        //计算
        int cZhiShu[] = new int[aZhiShu[0] + bZhiShu[0]];
        float cXiShu[] = new float[aZhiShu[0] + bZhiShu[0]];
        for (int i = 0; i < aZhiShu.length; i++) {
            for (int j = 0; j < bZhiShu.length; j++) {
                cZhiShu[i + j] = aZhiShu[i] + bZhiShu[j];
                cXiShu[i + j] += aXiShu[i] * bXiShu[j];
            }
        }

        //计算c的项数
        int cXiangShu = 0;
        for (int i = 0; i < cZhiShu.length; i++) {
            if (cXiShu[i] != 0) {
                cXiangShu++;
            }
        }
        System.out.print(cXiangShu + " ");

        //将c中为0的项去掉
        int spaceNum = 0;
        for (int i = 0; i < cZhiShu.length; i++) {
            if (cXiShu[i] != 0) {
                System.out.print(cZhiShu[i] + " " + String.format("%.1f", cXiShu[i]));
            }
            if (spaceNum != cXiangShu - 1) {
                System.out.print(" ");
                spaceNum++;
            }
        }

    }
}

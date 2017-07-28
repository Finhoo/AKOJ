import java.util.Random;

/**
 * Created by fan on 2017/7/23.
 */
public class Demo {
    public static void main(String[] args) {
        int time[] = new int[101];
        for (int i = 0; i < 101; i++) {
            time[i] = 0;
        }
        Random r = new Random();
        for (int i=0; i<10000000; i++) {
            int d = r.nextInt(100) + 1;
            time[d]++;
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " 出现了 " + time[i] + " 次");
        }
    }
}

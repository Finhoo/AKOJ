import java.util.Scanner;

/**
 * Created by fan on 2017/7/23.
 */
public class P1116 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int cnt = 0;
            for (int i=1; i<=n; i++) {
                if (i % 7 == 0 || Integer.toString(i).contains("7"))
                    cnt++;
            }
            System.out.println(cnt);
        }
        cin.close();
    }
}

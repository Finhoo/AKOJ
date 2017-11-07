package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1591 {
    static int []lens, data;
    static int n;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt();
            data = new int[n];
            lens = new int[n];
            for (int i = 0; i < n; i++) {
                lens[i] = 1;
                data[i] = cin.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (data[j] >= data[i] && lens[i] <= lens[j])
                        lens[i] = lens[j] +1;
                }
            }

            int max = lens[0];
            for (int i = 1; i < n; i++) {
                if (lens[i] > max)
                    max = lens[i];
            }
            System.out.println(max);
        }
        cin.close();
    }
}

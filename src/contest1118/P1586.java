package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1586 {
    static boolean []used;
    static int []rcd, num;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            num = new int[n];
            rcd = new int[n];
            used = new boolean[n];
            for (int i = 0; i < n; i++) {
                num[i] = i + 1;
                used[i] = false;
            }
            full_permutation(0, n);
        }
        cin.close();
    }

    private static void full_permutation(int l, int n) {
        if (l == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(rcd[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                rcd[l] = num[i];
                full_permutation(l+1, n);
                used[i] = false;
            }
        }
    }
}

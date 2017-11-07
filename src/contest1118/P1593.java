package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1593 {
    static int cnt;
    static int []a;
    static int n, k;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt(); k = cin.nextInt();
            a = new int[n];
            for (int i=0; i<n; i++)
                a[i] = cin.nextInt();
            cnt = 0;
            dfs(0, 0, 0);
            System.out.println(cnt);
        }
        cin.close();
    }

    private static void dfs(int step, int value, int c) {
        if (step == k) {
            if (isPrime(value)) cnt++;
        }else {
            for (int i = c; i < n; i++) {
                    dfs(step+1, value+a[i], i+1);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n % 2 == 0 && n != 2 || n < 2)
            return false;
        for (int i = 3; i*i <= n; i+=2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

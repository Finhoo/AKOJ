import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by fan on 2017/7/28.
 */
public class P1378 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=0; i<n; i++) {
            set.add(cin.nextInt());
        }
        int []a = new int[n];
        int sum = 0;
        for (int i = 1; i <= n-1; i++) {
            a[i] = cin.nextInt();
            sum += i > 1 ? a[i] * i : 0;
        }
        System.out.println(set.first());
        if (sum >= n-1) {
            int k = 0;
            for (int i = 2; i <= n - 1; i++) {
                int t = a[i] * i;
                while (t-- > 1) {
                    if (set.size()>1) {
                        set.add(set.pollFirst()+set.pollFirst());
                    }
                }
            }
            System.out.println(set.first());
        }else
            System.out.println("No solution!");
        cin.close();
    }
}

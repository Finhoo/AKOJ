package contest1118;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by fan on 2017/10/9.
 */
public class P1581 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(cin.nextInt());
        }
        System.out.println(set.size());
        System.out.print(set.pollFirst());
        while (!set.isEmpty()) {
            System.out.print(" " + set.pollFirst());
        }
        System.out.println();

        cin.close();
    }
}

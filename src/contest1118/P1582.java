package contest1118;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1582 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(cin.nextInt());
        }
        while (!list.isEmpty()) {
            System.out.print(list.removeFirst()+" ");
            if (!list.isEmpty()) {
                list.add(list.removeFirst());
            }
        }
        System.out.println();
        cin.close();
    }
}

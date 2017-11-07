package contest1118;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by fan on 2017/10/9.
 */
public class P1583 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            char []a = cin.nextLine().toCharArray();
            if (check(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        cin.close();
    }

    private static boolean check(char[] a) {
        boolean res = true;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<a.length; i++) {
            if (a[i] == '{' || a[i] == '[' || a[i] == '(') {
                stack.push(a[i]);
            }else {
                if (!stack.isEmpty() && op(a[i]) == stack.peek()) {
                    stack.pop();
                }else {
                    res = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) res = false;
        return res;
    }

    private static char op(char c) {
        if (c == '}') return  '{';
        if (c == ']') return  '[';
        if (c == ')') return  '(';
        return 0;
    }
}

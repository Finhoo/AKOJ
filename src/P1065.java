import java.util.Scanner;
import java.util.Stack;

public class P1065 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			Stack<Character> stack = new Stack<>();
			char a[] = cin.nextLine().toCharArray();
			boolean judge = true;
			for (int i=0; i<a.length; i++) {
				if (isLeft(a[i])) {
					stack.push(a[i]);
				}else if (isRight(a[i])) {
					if (stack.isEmpty()) {
						judge = false; break;
					}
					else {
						if (stack.peek().equals(op(a[i])))
							stack.pop();
						else
						{
							judge = false;
							break;
						}
					}
				}
			}
			if (!stack.isEmpty()) judge = false;
			if (judge)
				System.out.println("YES");
			else System.out.println("NO");
			
		}
		cin.close();
	}

	private static Character op(char c) {
		if (c == ')')
			return '(';
		if (c == '}')
			return '{';
		if (c == ']')
			return '[';
		return null;
	}

	private static boolean isLeft(char c) {
		return c == '(' || c == '[' || c == '{';
	}

	private static boolean isRight(char c) {
		return c == ')' || c == ']' || c == '}';
	}
}

import java.util.Scanner;

public class P1531 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			char[] a = cin.next().toCharArray();
			int len = 1, max = 1;
			for (int i=0; i<a.length; i++) {
				if (f(a[i])) {
					len = 1;
				}else
					len++;
				if (len > max)
					max = len;
			}
			System.out.println(max);
		}
		cin.close();
	}

	private static boolean f(char c) {
		char a[] = {'A', 'E', 'I', 'O', 'U', 'Y'};
		for (int i=0; i<a.length; i++)
			if (a[i] == c)
				return true;
		return false;
	}
}

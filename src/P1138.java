import java.util.Scanner;

public class P1138 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.next().replaceAll("[a-c]", "2").replaceAll("[d-f]", "3").replaceAll("[g-i]", "4")
					.replaceAll("[j-l]", "5").replaceAll("[m-o]", "6").replaceAll("[p-s]", "7").replaceAll("t-v", "8")
					.replaceAll("[w-z]", "9").replaceAll("[Z]", "a");
			char[] a = s.toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (a[i] >= 'A' && a[i] < 'Z')
					a[i] = (char) (a[i] + 'a' - 'A' + 1);
			}
			System.out.println(new String(a));
		}
		cin.close();
	}
}

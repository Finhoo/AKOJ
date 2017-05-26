import java.util.Scanner;

public class P1138new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String password = cin.nextLine().trim().replaceAll("1", "1").replaceAll("[a-c]", "2")
					.replaceAll("[d-f]", "3").replaceAll("[g-i]", "4").replaceAll("[j-l]", "5").replaceAll("[m-o]", "6")
					.replaceAll("[p-s]", "7").replaceAll("[t-v]", "8").replaceAll("[w-z]", "9").replaceAll("0", "0");
			char a[] = password.toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (a[i] >= 'A' && a[i] < 'Z') {
					a[i] = (char) (a[i] + 'a' - 'A' + 1);
				}
				if (a[i] == 'Z')
					a[i] = 'a';
			}
			System.out.println(new String(a));
		}
		cin.close();
	}
}

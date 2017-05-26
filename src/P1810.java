import java.util.Scanner;

public class P1810 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s[] = cin.nextLine().trim().split("\\s+");
			char a[] = s[0].toCharArray();
			char b[] = s[1].toCharArray();
			boolean judge = false;
			int i = 0, j = 0;
			if (s[0].equals(s[1]))
				System.out.println(0);
			else {
				for (i=0, j=0; i<a.length && j <b.length; i++, j++) {
					if (a[i] != b[j]) {
						System.out.println(a[i]-b[j]);
						judge = true;
						break;
					}
				}
				if (!judge) {
					if (i == a.length)
						System.out.println(0-b[i]);
					else System.out.println((int)a[i]);
				}
			}
		}
		cin.close();
	}
}

import java.util.Scanner;

public class P1517 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String[] a = cin.nextLine().trim().split("\\s");
			if (a.length == 0) continue;
			else System.out.print(1);
			int cnt = 1;
			for (int i=1; i<a.length; i++) {
				if (a[i].equals(a[i-1])) cnt++;
				else cnt=1;
				System.out.print(" "+cnt);
			}
			System.out.println();
		}
		cin.close();
	}
}

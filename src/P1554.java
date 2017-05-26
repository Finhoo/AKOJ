import java.util.Scanner;

public class P1554 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt(), b = cin.nextInt();
			if (a == b) System.out.println(a +" " +b);
			else
				System.out.println(a>b?a:b);
		}
		cin.close();
	}
}

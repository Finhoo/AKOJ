import java.util.Scanner;

public class P1557 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			char []a = cin.next().toCharArray();
			System.out.println(a[0]);
		}
		cin.close();
	}
}

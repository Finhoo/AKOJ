import java.util.Scanner;

public class P1801 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x1 = cin.nextInt(), y1 = cin.nextInt();
			int x2 = cin.nextInt(), y2 = cin.nextInt();
			if (x1 == x2)
				System.out.println("INF");
			else {
				System.out.println((y2-y1)/(x2-x1));
			}
		}
		cin.close();
	}
}

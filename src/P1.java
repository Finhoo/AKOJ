import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a  = cin.nextInt(), b = cin.nextInt();
			System.out.println(a + b);
		}
		cin.close();
	}
}

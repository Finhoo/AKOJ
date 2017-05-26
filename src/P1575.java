import java.util.Scanner;

public class P1575 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt(16), b = cin.nextInt(16);
			System.out.println(Integer.toString(a+b, 16).toUpperCase());
		}
		cin.close();
	}
}

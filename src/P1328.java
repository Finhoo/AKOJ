import java.util.Scanner;

public class P1328 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.nextLine().trim();
			String string = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
			System.out.println(string);
		}
		cin.close();
	}
}

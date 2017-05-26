import java.util.Scanner;

public class P1765 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt(), M = cin.nextInt();
			N = (N+1) / M;
			System.out.println((1<<N)-1);
		}
		cin.close();
	}
}

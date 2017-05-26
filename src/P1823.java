import java.util.Scanner;

public class P1823 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int time = cin.nextInt();
		double money = cin.nextDouble();
		double sum = 0;
		if (time <= 40)
			sum = time * money;
		if (time > 40 && time <= 50) {
			sum = 40 * money + (time - 40 ) * 1.5 * money;
		}
		if (time > 50) {
			sum = 40 * money + 10 * 1.5 * money + 2*(time-50) * money;
		}
		System.out.println(String.format("%.2f", sum));
		cin.close();
	}
}

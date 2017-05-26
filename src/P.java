import java.util.Calendar;

import java.util.Scanner;

public class P {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int year = cin.nextInt(), month = cin.nextInt(), day = cin.nextInt();
			date.set(year, month, day);
			System.out.printf("%d %d %d", date.YEAR, date.MONTH, date.DAY_OF_MONTH);
		}
		cin.close();
	}
}

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class P1134 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int year = cin.nextInt(), month = cin.nextInt(), day = cin.nextInt();
			Calendar date = Calendar.getInstance();
			date.set(year, month -1 , day);
			date.add(Calendar.DAY_OF_YEAR, 10000);
			System.out.println(new SimpleDateFormat("yyyy-M-d").format(date.getTime()));
		}
		cin.close();
	}
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1260 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.nextLine();
			String p = cin.nextLine();
			Pattern pattern = Pattern.compile(p);
			Matcher matcher = pattern.matcher(s);
			int cnt = 0;
			while (matcher.find())
				cnt++;
			System.out.println(cnt);
		}
		cin.close();
	}
}

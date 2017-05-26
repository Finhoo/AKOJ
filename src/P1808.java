import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1808 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s[] = cin.nextLine().trim().split("\\s+");
			Arrays.sort(s, new Comparator<String>() {
				@Override
				public int compare(String a, String b) {
					return b.length()-a.length();
				}
			});
			System.out.println(s[0]);
		}
		cin.close();
	}
}

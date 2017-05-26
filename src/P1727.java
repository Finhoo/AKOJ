
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P1727 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a[] = cin.nextLine().trim().replaceAll("[.,]", "").toUpperCase().split("\\s+");
			LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
			for (String s: a)
				if (map.containsKey(s))
					map.put(s, map.get(s)+1);
				else {
					map.put(s, 1);
				}
			for (String s: map.keySet()) {
				System.out.println(s+":"+count(map.get(s))+map.get(s));
			}
		}
		cin.close();
	}

	private static String count(int n) {
		String s = "";
		for (int i=0; i<n; i++)
			s += "*";
		return s;
	}
}

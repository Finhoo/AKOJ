import java.util.HashMap;
import java.util.Scanner;

public class P1155 {
	static HashMap<String, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		map.put("A", 1);map.put("J", 11);
		map.put("Q", 12);map.put("K", 13);
		for (int i=2; i<=10; i++)
			map.put(Integer.toString(i), i);
		while (cin.hasNext()) {
			String[] a = cin.nextLine().trim().split("\\s+");
			if (solve(a))
				System.out.println("Y");
			else
				System.out.println("N");
		}
		cin.close();
	}

	private static boolean solve(String[] a) {
		if (a.length == 4)
		{
			
		}
		return false;
	}
}

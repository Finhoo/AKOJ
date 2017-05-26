import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class P1063 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			TreeSet<Integer> set = new TreeSet<>();
			int n = cin.nextInt();
			for (int i=0; i<n; i++) {
				set.add(cin.nextInt());
			}
			System.out.println(set.size());
			Iterator<Integer> iter = set.iterator();
			System.out.print(iter.next());
			while (iter.hasNext()) {
				System.out.print(" "+iter.next());
			}
			System.out.println();
		}
		cin.close();
	}
}

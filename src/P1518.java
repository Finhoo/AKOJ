import java.util.HashMap;
import java.util.Scanner;

public class P1518 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while (cin.hasNext()) {
			String first = cin.next();
			int n = cin.nextInt(), m = cin.nextInt();
			HashMap<String, String> list = new HashMap<>();
			HashMap<String, Integer> node = new HashMap<>();
			for (int i=0; i<n; i++) {
				String address = cin.next();
				int data = cin.nextInt();
				String next = cin.next();
				list.put(address, next);
				node.put(address, data);
			}
			String a[] = new String[n];
			for (int i=0; i<n; i++) {
				System.out.println(first+" "+node.get(first)+" "+list.get(first));
				a[i] = first;
				first = list.get(first);
			}
			String tmp = a[(m-1)%n];
			first = tmp;
			for (int i=(m-1)%n; i>0; i--) {
				list.put(list.get(a[i]), list.get(a[i-1]));
			}
			a[0] = tmp;
			for (int i=0; i<n; i++) {
				System.out.println(first+" "+node.get(first)+" "+list.get(first));
				a[i] = first;
				first = list.get(first);
			}
		}
		cin.close();
	}
}

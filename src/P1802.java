import java.util.HashMap;
import java.util.Scanner;

public class P1802 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = Integer.parseInt(cin.nextLine().trim());
			HashMap<String, String> name = new HashMap<>();
			HashMap<String , String> number = new HashMap<>();
			while (n-- > 0) {
				String a[] = cin.nextLine().trim().split("\\s+");
				if (a.length == 3) {
					name.put(a[0], a[2]);
					number.put(a[1], a[2]);
				}
			}
			int m = Integer.parseInt(cin.nextLine().trim());
			while (m-- > 0) {
				String b[] = cin.nextLine().trim().split("\\s+");
				if (b.length == 2) {
					boolean judge = true;
					if (name.containsKey(b[0]) || number.containsKey(b[0]) ||
						name.containsKey(b[1]) || number.containsKey(b[1])) {
							
						if (name.containsKey(b[0]) && name.containsKey(b[1])){
							if (name.get(b[0]).equals(name.get(b[1])))
								judge = false;
						}else if (name.containsKey(b[0]) && number.containsKey(b[1])) {
							if (name.get(b[0]).equals(number.get(b[1])))
								judge = false;
						}
						else if (number.containsKey(b[0]) && name.containsKey(b[1])) {
							if (number.get(b[0]).equals(name.get(b[1])))
								judge = false;
						}
						else if (number.containsKey(b[0]) && number.containsKey(b[1])) {
							if (number.get(b[0]).equals(number.get(b[1])))
								judge = false;
						}
					}
					else judge = false;
					if (judge)
						System.out.println("Y");
					else System.out.println("N");
				}
			}
		}
		cin.close();
	}
}

import java.util.Scanner;

public class P1217 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a[] = cin.nextLine().split("\\s+");
			if (a.length == 3) {
				if (a[1].equals("+")){
					System.out.println(Integer.toBinaryString(Integer.parseUnsignedInt(a[0], 2)+Integer.parseInt(a[2], 2)));
				}
				else 
					System.out.println(Integer.toBinaryString(Integer.parseUnsignedInt(a[0], 2)-Integer.parseInt(a[2], 2)));
					
			}else continue;
		}
		cin.close();
	}
}

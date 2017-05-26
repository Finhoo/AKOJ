import java.util.Scanner;

public class P1435 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) 
		{
			int t = cin.nextInt();
			while (t-->0)
			{
				String a[] = cin.next().split("[.]"), b[] = cin.next().split("[.]");
	
				Add(a,b);
			}
		}
		cin.close();
	}

	private static void Add(String[] a, String[] b) {
		if (a.length == 1 && b.length == 1) {
			a[0] = change(a[0]);
			b[0] = change(b[0]);
			int c = Integer.parseInt(a[0], 26)+Integer.parseInt(b[0], 26);
			System.out.println(reChange(c));
		}else {
			if (a.length > b.length) {
				int c= Integer.parseInt(a[0], 26)+Integer.parseInt(b[0], 26);
				System.out.println(reChange(c)+"."+a[1]);
			}else if (a.length < b.length){
				int c= Integer.parseInt(a[0], 26)+Integer.parseInt(b[0], 26);
				System.out.println(reChange(c)+"."+b[1]);
			}else {
				int k1 = a[1].length();
				int k2 = b[1].length();
				int i = k1, j = k2;
				while (i++ < k2)
					a[1] = a[1]+'a';
				while (j++ < k1)
					b[1] = b[1]+'a';
				int k = a[1].length();
				int c2 = Integer.parseInt(a[1], 26)+Integer.parseInt(b[1], 26);
				String s2 = reChange(c2);
				int next = 0;
				if (s2.length() > k) {
					next = 1;
				}
				int c1 = Integer.parseInt(a[0], 26)+Integer.parseInt(b[0], 26)+next;
				System.out.println(reChange(c1)+"."+s2);
			}
		}
	}

	private static String reChange(int c) {
		char a[] = Integer.toString(c, 26).toCharArray();
		for (int i=0; i<a.length; i++) {
			if (a[i] >= '0' && a[i] <= '9')
				a[i] = (char) (a[i] - '0' + 'a');
			else 
				a[i] = (char) (a[i]+10);
		}
		return new String(a);
	}

	private static String change(String s) {
		char a[] = s.toCharArray();
		for (int i=0; i<a.length; i++) {
			if (a[i] >= 'a' && a[i] <= 'j'){
				a[i] = (char) (a[i]-'a'+'0');
			}else {
				a[i] = (char) (a[i] - 10);
			}
		}
		return new String(a);
	}
}

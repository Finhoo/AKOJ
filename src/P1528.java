import java.util.Arrays;
import java.util.Scanner;

public class P1528 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int L = cin.nextInt(), n = cin.nextInt();
			int x[] = new int[n];
			
			for (int i=0; i<n; i++)
				x[i] = cin.nextInt();
			
			int min[] = new int[n];
			int max[] = new int[n];
			for (int i=0; i<n; i++) {
				if (x[i] >= L - x[i]) {
					min[i] = L-x[i];
					max[i] = x[i];
				}else {
					min[i] = x[i];
					max[i] = L-x[i];
				}
			}
			Arrays.sort(min);
			Arrays.sort(max);
			System.out.println(min[min.length-1]+" "+max[max.length-1]);
		}
		cin.close();
	}
}

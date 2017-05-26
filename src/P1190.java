import java.util.Scanner;

public class P1190 {
	static int pre[] = new int[201];
	static int rank[] = new int[201];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n =cin.nextInt(), m = cin.nextInt();
			if (n == 0 && m == 0) break;
			init(n);
			while (m-- > 0) {
				int p = cin.nextInt(), q = cin.nextInt();
				union(p, q);
			}
			int s = 0;
			for (int i=1; i<=n; i++) {
				if (i ==find(i))
					s++;
			}
			System.out.println(s - 1);
		}
		cin.close();
	}
	private static int find(int i) {
		if (i == pre[i])
			return i;
		while (i != pre[i]) {
			i = pre[i];
		}
		return i;
	}
	private static void union(int p, int q) {
		p = find(p);
		q = find(q);
		if (p == q)
			return;
		if (rank[p] < rank[q])
			pre[p] = q;
		else if (rank[p] > rank[q])
			pre[q] = p;
		else {
			pre[p] = q;
			rank[p]++;
		}
			
	}
	private static void init(int n) {
		for (int i=1; i<=n; i++) {
			pre[i] = i;
			rank[i] = 0;
		}
	}
}

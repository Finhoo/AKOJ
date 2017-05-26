import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1064 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int n = cin.nextInt();
			Queue<Integer> queue = new LinkedList<>();
			for (int i=0; i<n; i++) {
				queue.add(cin.nextInt());
			}
			Queue<Integer> ans = new LinkedList<>();

			while (!queue.isEmpty()) {
				ans.add(queue.remove());
			if (!queue.isEmpty())
					queue.add(queue.remove());
			}
			System.out.print(ans.remove());
			while (!ans.isEmpty()) {
				System.out.print(" "+ans.remove());
			}
			System.out.println(" ");
		}
		cin.close();
	}
}

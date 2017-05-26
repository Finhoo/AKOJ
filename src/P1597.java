import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1597 {
	static class Time{
		int start;
		int end;
		public Time(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			Time[] time = new Time[n];
			for (int i=0; i<n; i++) {
				time[i] = new Time(cin.nextInt(), cin.nextInt());
			}
			Arrays.sort(time, new Comparator<Time>() {

				@Override
				public int compare(Time a, Time b) {
					return a.end - b.end;
				}
			});
			int s = 1;
			for (int i=1; i<n; i++) {
				boolean need = true;
				for (int j=0; j<i; j++) {
					if (time[i].start > time[j].end)
						need = false;
				}
				if (need)
					s++;
			}
			System.out.println(s);
		}
		cin.close();
	}
}

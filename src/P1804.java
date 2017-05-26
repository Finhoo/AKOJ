import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1804 {
	public static class Point{
		double Distance;
		double Price;
		public Point(double Distance, double Price) {
			this.Distance = Distance;
			this.Price = Price;
		}
	}
	static Point[] point;
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (cin.hasNext()) {
			double D1 = cin.nextDouble();
			double C  = cin.nextDouble();
			double D2 = cin.nextDouble();
			double P = cin.nextDouble();
			int N = cin.nextInt();
			init(P, N);
			int k = 0;
			double cost = 0;
			while (true){
				double reach = C*D2;
				for (int i=k+1; i<=N; i++) {
					if (point[i].Distance < reach) {
						if (point[i].Price <  P) {
							
						}
					}
				}
			}
		}
		cin.close();
	}

	private static void init(double p, int n) {
		point = new Point[n+1];
		point[0] = new Point(p, 0);
		for (int i=1; i<=n; i++)
			point[i] = new Point(cin.nextDouble(), cin.nextDouble());
		Arrays.sort(point, new Comparator<Point>() {
			@Override
			public int compare(Point a, Point b) {
				if (a.Distance < b.Distance)
					return -1;
				return 1;
			}
		});
	}
}
import java.io.PrintWriter;
import java.util.Scanner;

public class P1833 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static int getPower(int p, int n) {
        int ret = 0, t = p;
        while (t < n) {
            ret += n / t;
            t *= p;
        }
        return ret;
    }

    static int remove25(int n) {
        while (n % 2 == 0) n /= 2;
        while (n % 5 == 0) n /= 5;
        return n;
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int ret = 1;
            for (int i = 2; i <= n; i++) {
                ret = (ret * remove25(i)) % 10;           
            }
            int p2 = getPower(2, n) - getPower(5, n);
            while (p2-- > 0) {
                ret = (ret * 2) % 10;
            }
            cout.println(ret);
        }
        cin.close();
        cout.close();
    }
}


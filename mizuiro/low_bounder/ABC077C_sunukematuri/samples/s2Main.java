import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        long ans = 0;
        for (int i = 0; i < n; i++) {
            long oka = -1;
            long nga = n;
            while (nga - oka > 1) {
                int tmp = (int) (oka + nga) / 2;
                if (a[tmp] < b[i]) {
                    oka = tmp;
                } else {
                    nga = tmp;
                }
            }

            long okc = n;
            long ngc = -1;
            while (okc -ngc > 1) {
                int tmp = (int) (okc + ngc) / 2;
                if (c[tmp] > b[i]) {
                    okc = tmp;
                } else {
                    ngc = tmp;
                }
            }
            ans += (oka + 1) * (n - okc);
        }
        System.out.println(ans);
    }
}

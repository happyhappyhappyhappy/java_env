import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
class Main{
    public static int ExtGCD(int M,int N,AtomicInteger x,AtomicInteger y){
        if(N==0){
            x.set(1);
            y.set(0);
            return M;
        }
        AtomicInteger x1=new AtomicInteger();
        AtomicInteger y1=new AtomicInteger();
        int gcd=ExtGCD(N,M%N,x1,y1);
        x.set(y1.get());
        y.set(x1.get()-y1.get()*(M/N));
        return gcd;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();
        AtomicInteger x=new AtomicInteger();
        AtomicInteger y=new AtomicInteger();
        int gcd=ExtGCD(M,N,x,y);
        int x1=x.get();
        int y1=y.get();
        System.out.printf("最大公約数 %d,x = %d,y = %d\n",gcd,x1,y1);
        if(x1<0){
            System.out.printf("%d の逆数を %d で割ったときの整数値->%d\n",M,N,(x1+N));
        }
    }
}

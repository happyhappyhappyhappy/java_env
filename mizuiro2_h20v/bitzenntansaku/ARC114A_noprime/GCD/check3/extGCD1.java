import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public class extGCD1{
    private static int extGCD(int M,int N,AtomicInteger x,AtomicInteger y){
        System.err.printf("ただ今 M=%d N=%d x=%d y=%d\n",
         M,N,x.get(),y.get());
        if(N==0){
            x.set(1);
            y.set(0);
            return M;
        }
        AtomicInteger x1=new AtomicInteger();
        AtomicInteger y1=new AtomicInteger();
        int d=extGCD(N,M%N,y1,x1);
        int x2=x1.get();
        int y2=y1.get();
        x.set(x2);
        int y_d=y2-(M/N)*(x2);
        y.set(y_d);
        System.err.printf("再帰から出るときの x = %d, y = %d\n",
        x.get(),y.get());
        return d;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        sc.close();
        int x=-1;
        int y=-1;
        AtomicInteger x1=new AtomicInteger(x);
        AtomicInteger y1=new AtomicInteger(y);
        int d=extGCD(M,N,x1,y1);
        System.out.printf("M=%d と N=%d の最大公約数は %d\n",M,N,d);
        if(d==1){
            x = x1.get();
            if(x < 0){
                x=x+N;
            }
            System.out.printf("1/%d の%dで割った時の余り=>%d\n",
            M,N,x);
        }
    }
}

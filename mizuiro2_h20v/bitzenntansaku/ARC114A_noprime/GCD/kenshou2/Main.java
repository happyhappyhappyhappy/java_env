import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class Main{
    public static int ExtGDC(int M,int N,AtomicInteger x,AtomicInteger y){
        if(N==0){
            x.set(1);
            y.set(0);
            return M;
        }
        else{
            AtomicInteger _x=new AtomicInteger();
            AtomicInteger _y=new AtomicInteger();
            int res=ExtGDC(N,M%N,_y,_x);
            x.set(_x.get());
            y.set((_y.get())-(M/N)*(_x.get()));
            return res;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        sc.close();
        AtomicInteger x=new AtomicInteger(-1);
        AtomicInteger y=new AtomicInteger(-1);
        int res=ExtGDC(first, second, x, y);
        System.out.printf("%3dと%3dの最大公約数->%d\n",first,second,res);
        if(res==1){
            int x2=x.get();
            if(x2<0){
                x2=x2+second;
            }
            System.out.printf("1/%d mod %d = %d\n",first,second,x2);
        }
    }
}

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
class Main{
    public static int GCD2
    (int a,int b,AtomicInteger x,AtomicInteger y)
    {
        if(a==0){
            x.set(0);
            y.set(1);
            return b;
        }
        AtomicInteger _x=new AtomicInteger();
        AtomicInteger _y=new AtomicInteger();
        int gcd = GCD2(b%a,a,_x,_y);
        int inx=((_y.get())-(b/a)*(_x.get()));
        x.set(inx);
        int iny=_x.get();
        y.set(iny);
        return gcd;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        AtomicInteger x=new AtomicInteger();
        AtomicInteger y=new AtomicInteger();
        int gcd=GCD2(a,b,x,y);
        System.out.printf("最大公約数 %d, x = %d , y = %d\n",
        gcd,x.get(),y.get());
    }
}

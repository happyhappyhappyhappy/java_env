import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class Main{
    public static long GCD(long x,long y){
        if(y == 0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static long GDC2(long x,long y,long a,long b){
        if(y==0){
            a = 1;
            b= 0;
            return x;
        }else{
            long z=x%y;
            long d=GDC2(y,z,b,a);
            return d;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long first=sc.nextLong();
        long second=sc.nextLong();
        sc.close();
        AtomicLong a=new AtomicLong();
        AtomicLong b=new AtomicLong();
        a.set(-1);
        b.set(-1);
        long func2=GDC2(first,second,a,b);
        System.out.println("pattern1:"+func2);
        System.out.printf("pattern2: a->%lld b->%dll",a.longValue(),b.longValue());
    }
}

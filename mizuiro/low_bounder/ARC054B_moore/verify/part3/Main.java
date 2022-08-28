import java.util.*;

public class Main{
    private static double GOLDEN=(1.0+Math.sqrt(5.0))*Math.pow(2.0,-1.0);
    private static double f(double x){
        return x*x-6.0*x+9.0;
    }
    private static double[] gdevide(double x,double y){
        double[] a = new double[2];
        a[0] = (GOLDEN*x+1.0*y)*Math.pow(GOLDEN+1.0,-1); // 左側
        a[1] = (1.0*x+GOLDEN*y)*Math.pow(GOLDEN+1.0,-1); // 右側
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double left = sc.nextDouble();
        double right = sc.nextDouble();
        sc.close();    
        for(int j=0;j<1000;j=j+1){
            double between[] = new double[2];
            between = gdevide(left,right);
            double left_plus = between[0];
            double right_minus=between[1];
            if(f(left_plus)<=f(right_minus)){
                right = right_minus;
            }
            else{
                left = left_plus;
            }
            if(Math.abs(right-left)<0.000000001){
                System.out.println("誤差許容範囲");
                break;
            }
            System.out.println("試行 "+j+" 左: "+left
            +" 右:"+right);
        }
        System.out.println(right);
    }

}
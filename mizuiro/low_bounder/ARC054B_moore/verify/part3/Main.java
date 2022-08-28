import java.util.*;

public class Main{
    private static double function(double x){
        double ans = x*x-6.0*x+9.0;
        return ans;
    }
    private static double[] divide3(double left,double right){
        double ans[] = new double[2];
        ans[0] = (left*2.0+right)/3.0;
        ans[1] = (left+right*2.0)/3.0;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double left = sc.nextDouble();
        double right = sc.nextDouble();
        sc.close();
        for(int j=0;j<1000;j=j+1){
            double x[];
            x = divide3(left,right);
            double left_plus=x[0];
            double right_minus=x[1];
            System.out.println(left+" "+left_plus+" "+
            right_minus+" "+right);
            double subleft_v=function(left_plus);
            double subright_v=function(right_minus);
            System.out.println("左: "+subleft_v+" 右:"+subright_v);
            if(function(left_plus)<=function(right_minus)){
                
                right = right_minus;
            }
            else{
                left = left_plus;
            }
            if(Math.abs(right-left)<0.000000001){
                System.out.println("誤差許容範囲");;
                break;
            }
            System.out.println("次回左: "+left+" 右: "+right);
        }
        System.out.println(right);
    }
}

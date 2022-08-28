import java.util.*;


public class Main{
    private static double GOLDEN=(1.0+Math.sqrt(5.0))*Math.pow(2.0,-1.0);
    private static double f(double P,double x){
        return x+P/Math.pow(2.0,x/1.5);
    }
    private static double[] golden_devide(double l,double r){
        double[] between = new double[2];
        between[0]=(l*GOLDEN+r)*Math.pow(1+GOLDEN,-1);
        between[1]=(l+r*GOLDEN)*Math.pow(1+GOLDEN,-1);
        return between;
    }
    private static double solver(double P){
        double right=10000000000.0;
        double left=0.0;
        for(int j=0;j<1000;j=j+1){
            double[] between = new double[2];
            between = golden_devide(left,right);    
            double left_plus = between[0];
            double right_minus = between[1];
            if(f(P,left_plus)<=f(P,right_minus)){
                right = right_minus;
            }
            else{
                left = left_plus;
            }
            if(Math.abs(right-left)<0.000000001){
                break;
            }
        }    
        return f(P,right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        sc.close();
        double answer  = solver(P);
        System.out.println(answer);
    }
}
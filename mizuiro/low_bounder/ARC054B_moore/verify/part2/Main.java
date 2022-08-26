import java.util.*;

public class Main {
    public static double[] devgolden(double left,double right){
        double ans[] = new double[2];
        double GOLDEN = (1.0+Math.sqrt(5.0))*Math.pow(2.0,-1.0);
        ans[0] = (GOLDEN*left+right)*Math.pow(GOLDEN+1.0,-1.0);
        ans[1] = (left+GOLDEN*right)*Math.pow(GOLDEN+1.0,-1.0);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double left = sc.nextDouble();
        double right = sc.nextDouble();
        sc.close();
        double between[];
        between = devgolden(left,right);
        double left_plus = between[0];
        double right_minus = between[1];
        System.out.println(left+" "+left_plus+" "+right_minus+" "+right);
    }
}
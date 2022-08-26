import java.util.*;

public class Main {
    public static double[] devide3(double left,double right){
        double[] dev3 = new double[2];
        dev3[0] = (2.0*left+right)*Math.pow(3.0, -1.0);
        dev3[1] = (left+2.0*right)*Math.pow(3.0, -1.0);
        return dev3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double left=sc.nextDouble();
        double right=sc.nextDouble();
        sc.close();
        double dev3[];
        dev3 = devide3(left,right);
        double right_minus=dev3[1]; // 右端側の分割地点
        double left_plus=dev3[0]; // 左側の分割地点
        System.out.println(left+" "+left_plus+" "+right_minus+" "+right);
    }
}

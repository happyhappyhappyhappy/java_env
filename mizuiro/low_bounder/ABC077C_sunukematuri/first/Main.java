import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int peace = sc.nextInt();
        int[] A=new int[peace];
        int[] B=new int[peace];
        int[] C=new int[peace];
        for(int j=0;j<peace;j=j+1){
            A[j] = sc.nextInt();
        }
        for(int j=0;j<peace;j=j+1){
            B[j] = sc.nextInt();
        }
        for(int j=0;j<peace;j=j+1){
            C[j] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long answer=0L;
        for(int j=0;j<peace;j++){
            long lowbound=0L;
            int right = peace;
            int left = -1;
            while(right-left>1){
                int mid=(right+left)/2;
                if(A[mid]<B[j]){
                    left=mid;
                }
                else{
                    right=mid;
                }
            }
            lowbound=(long)right;
            long upperbound=0L;
            right = peace;
            left = -1;
            while(right-left>1){
                int mid=(right+left)/2;
                if(C[mid]<=B[j]){
                    left=mid;
                }
                else{
                    right=mid;
                }
            }
            upperbound=(long)(peace-right);
            answer = answer + upperbound*lowbound;
        }
        System.out.println(answer);
    }
}
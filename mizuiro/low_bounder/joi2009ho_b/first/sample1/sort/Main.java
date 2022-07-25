import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int S[] = new int[N];
        for(int j=0;j<N;j++){
            S[j]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(S);
        for(int j=0;j<N;j++){
            System.out.print(S[j]+" ");
        }
        System.out.println();
    }
}
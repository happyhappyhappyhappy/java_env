//ここからimport文
import java.util.*;
import java.io.*;

//import mylib.* ;
//ここまでimport文

public class Main{

	static final int inf = Integer.MAX_VALUE / 2 ;
	static final long longInf = Long.MAX_VALUE / 2L ;
	static final String LF = "\n" ;
	static final int mod = 998244353 ;
	
	static ArrayList<ArrayList<Integer>> G ;


public static void main(String[] args) {

	Scanner sc = new Scanner( System.in ) ;
	PrintStream ps = new PrintStream( System.out ) ;
	StringBuilder sb = new StringBuilder() ;
	
	
	int N = sc.nextInt() ;
	int[] A = new int[N] ;
	int[] B = new int[N] ;
	int[] C = new int[N] ;
	Arrays.setAll( A , i -> sc.nextInt() ) ;
	Arrays.setAll( B , i -> sc.nextInt() ) ;
	Arrays.setAll( C , i -> sc.nextInt() ) ;
	
	Arrays.sort( A ) ;
	Arrays.sort( B ) ;
	Arrays.sort( C ) ;
	long result = 0L ;
	for ( int i = 0 ; i < N ; i++ ) {
		long cntA = 0L ;
		int right = N ; 
		int left = -1 ;
		while ( right - left > 1 ) {
			int mid = ( right + left ) / 2 ;
			if ( A[mid] < B[i] ) left = mid ;
			else right = mid ;
		}
		cntA = (long)right ;
		
		long cntC = 0L ;
		right = N ;
		left = -1 ;
		while ( right - left > 1 ) {
			int mid = ( right + left ) / 2 ;
			if ( C[mid] <= B[i] ) left = mid ;
			else right = mid ;
		}
		cntC = (long)( N - right ) ;
		result += cntA * cntC ;
	}
	
	ps.println( result ) ;
	
	
	sc.close() ;
	ps.close() ;
}


}

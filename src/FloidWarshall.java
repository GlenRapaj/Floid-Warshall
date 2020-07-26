
public class FloidWarshall {
	
	public static boolean FloidWarshall( int [][]A, int [][] P, int n ) {
		
		boolean Skazgjidhje = false ;
		int k = 0;
		
		while ( k < n) {
			
			for( int i = 0 ; i < n ;i++){
				
				if ( k != i){
					
					for( int j = 0 ; j  < n ; j++){
						
						if ( k != j  && A[i][j] >= A[i][k] + A[k][j]) {
							A[i][j] = A[i][k] + A[k][j] ;
							P[i][j] = P[k][j] ;
						
						}
					
					}
					
					
					//
					
					if( A[i][i] < 0) {
						
						Skazgjidhje = true ;
						break ;
					}
					
					//
				}
			}
		
			
/*			if( A[i][i] < 0) {
				
				Skazgjidhje = true ;
				break ;
			}*/
		
			k++;
		}
		
		return Skazgjidhje ;
		}

	public static void main(String[] args) {
		
		// = new int[5][5]   Integer.MAX_VALUE
		int [][] A  = { { 0, 3, 3, 4}, { 3, 0, Integer.MAX_VALUE, -2 }, { 2, Integer.MAX_VALUE, 0, 1 }, { 2, Integer.MAX_VALUE, Integer.MAX_VALUE, 0 } } ;
		
		int [][] P = new int[4][4];
		
		
		
		for( int i = 0 ; i < P.length ; i++ ) {
			for( int j = 0 ; j < P.length ; j++ ) {
				P[ i ][ j ] = i ;
			}
			}
	
		
		boolean ans = FloidWarshall( A, P, 4 );
		
		System.out.println( " \n " + " \n " );
		
		for( int j = 0 ; j < A.length ; j++ ) {
			System.out.println( A[ j ][ j ] );
		}
		
		
		System.out.println( " \n ans : " + ans + " \n " );
		System.out.println( " \n  " + " \n " );
		
		
		
		for( int i = 0 ; i < P.length ; i++ ) {
			for( int j = 0 ; j < P.length ; j++ ) {
				  System.out.println( P[ i ][ j ] );
			}
			}
		
		System.out.println( " \n \n " );
		
		for( int i = 0 ; i < A.length ; i++ ) {
			for( int j = 0 ; j < A.length ; j++ ) {
				System.out.println( A[ i ][ j ] );
			}
			}
		
	
	}
}

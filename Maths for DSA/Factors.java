

public class Factors {

    public static void main ( String [] args ) {
         factors2 ( 20);
    }

    // O(n)
    static void factors1(int n ) {
        for ( int i=1 ; i<=n ; i ++ ) {
            if ( n %i ==0 ){
                System.out.println ( i + " ");
            }
        }
    }

    // O(n)  // Remove repeted thing just like we did in Prime no
    static void factors2(int n ) {
        for ( int i=1 ; i<=Math.sqrt(n) ; i ++ ) {
            if ( n %i ==0 ){
                // 6 X 4
                System.out.println ( i + " ");
            }
            else {
                System.out.print( i + " "+ n/i+ " ");
            }
        }
    }
}
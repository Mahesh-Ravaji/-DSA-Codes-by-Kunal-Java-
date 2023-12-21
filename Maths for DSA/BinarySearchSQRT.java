


public class BinarySearchSQRT {
    public static void main (String [ ]args ) {
        int n=26;
        int p = 3 ; // My precision value 

        System.out.println(sqrt(n,p ));
        // Pretty Printing 
        System.out.printf("%.3f",sqrt(n,p ));
        


    }

    static double sqrt (int n, int p ) {
        // taking array of numbers
        int s=0 ;
        int e= n ;

        double root = 0.0;

        while(s<=e ) {
            int m=s+e/2;


            if ( m*m==n ) {
                return m ;
                System.out.println(m); 
            }
            if ( m*m>n) {
                e=m-1;
            }
            else {
                s=m+1;
            }
                
        }

        double incr = 0.1;
        for ( int i =0 ; i<p ; i++ ) {
            while ( root * root <=n) {
                root += incr ; 
            }
            root -=incr ; 
            incr /=10 ;// for seconde digit/ decimal place  increment 
        }

        return root;
    }
}
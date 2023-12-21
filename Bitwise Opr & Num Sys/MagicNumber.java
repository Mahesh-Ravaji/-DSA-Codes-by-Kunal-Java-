public class MagicNumber {
    public static void main (String [] args ){
        int n=6;
        int ans= 0;
        int base = 5;
        // magic no -> 1= 001 ( 0*5^3 + 0*5^2 + 1*5^1 );  )
        while (n>0){
            int last =n &1;
            n= n>> 1;
            ans += last *base;

            base = base * 5;
        }
        System.out.println(ans);
    }
    
}

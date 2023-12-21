public class NumSys {
    public static void main(String[] args) 
    {
        int n=37;
        System.out.println(isodd(n));
    }
    static boolean isodd(int  n){
        if (n & 1 == 1){
            return true;
            // System.out.println("odd");
        }
        else 
            return false;
            // System.out.println("Even");

    }
}

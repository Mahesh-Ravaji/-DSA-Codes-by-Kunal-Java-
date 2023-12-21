// Today we are going to make a code for Factorial of the Number in javcl //
import java.util.*;
class Methods {
    public static void main (String [] args){
        int num ,n;
        System.out.println("Enter the no whichh you want to FActorial");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        int i=0,fact;
        for ( n=num; n>=0; n--){
            
            fact=num*(num-i);
            i++;

        };
        System.out.println("factorial of the no is :"+ int fact);
    }
}
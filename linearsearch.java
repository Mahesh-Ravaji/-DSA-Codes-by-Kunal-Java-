import java.util.*;
public class linearsearch {

    public static void main (String [] args) throws Exception {
        int []nums = {1,2,3,4,5,6,7,8,23,13};
        int target= 232;
        int ans= linearsearch(nums, target);
    }
    
    // static is neccesary in this below 
    static int linearsearch(int arr[], int target){
        if (arr.length==0){
            return -1;
        }

        /
        // run a for loop over 
        for (int i=0; i<arr.length;i++){
            int element=arr[i];
            if (element==target){
                System.out.println("Element found at index: "+(i+1));
            }
            // else return; 
        }
        
        System.out.println("element does not exists");
        return -1;

    }
    /**  
         * charAt use to find the character at perticuler index 
        for (int i=0; i<arr.length; i++){
            if (target == str.charAt(i)){
                return true;
            }
        }

        str.tocharArray() => 'm','a'
        */
        



    // Search in Range 
    /**
     * int start=3, end=9;
     * linearsearch (int[] arr, int target, int start , int end){
     *      
     *      }
     * out of ragne return -1;
     * 
     */

    
}

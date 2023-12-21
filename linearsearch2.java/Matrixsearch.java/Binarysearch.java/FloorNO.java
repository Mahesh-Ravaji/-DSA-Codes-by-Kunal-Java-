package linearsearch2.java.Matrixsearch.java.Binarysearch.java;

public class FloorNO {
    public static void main (String [] args){
        int arr[]={2,3,5,9,14,16,18};
        int target=12;
        int ans=floors ( arr,target);
    }

        // Greatest nO <= target;  Return =End(Uppper);
    static int  floors(int arr[],int target)
    {
        int l=0;
        int u= arr.length-1;
        int mid = (l+u)/2;

        if (target>arr[arr.length-1]){
            return -1;
        }
        while (l<=u){
            if (arr[mid]== target){
                return arr[mid];
            }
            if (arr[mid]<= target)
            {
                l=mid+1;
            }
            if (arr[mid]>= target)
            {
                u=mid-1;
            }
        }
        
        
    } return 0;
}

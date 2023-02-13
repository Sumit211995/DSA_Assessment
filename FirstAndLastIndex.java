import java.util.*;
class FirstAndLastIndex{
    
     int firstIndex(int[]arr,int targetValue, int n){
        int low = 0, high = n - 1, res = -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if (arr[mid] > targetValue){
                high = mid - 1;
            }
            else if (arr[mid] < targetValue){
                low = mid + 1;
            }
            else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    } 
    int lastIndex(int[]arr,int targetValue, int n){
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            
            int mid = (low + high) / 2;
            if (arr[mid] > targetValue){
                high = mid - 1;
            }
            else if (arr[mid] < targetValue){
                low = mid + 1;
        }
            else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of element in the array= ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array= ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value= ");
        int targetValue=sc.nextInt();
        FirstAndLastIndex ob=new FirstAndLastIndex();
        System.out.println("First Index is at = " + ob.firstIndex(arr,targetValue,n) +" position");
        System.out.println("Last Index is at = " + ob.lastIndex(arr,targetValue,n) + " position");

    }
}
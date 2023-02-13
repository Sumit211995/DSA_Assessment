import java.util.*;
public class Pattern {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n = ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
         }
        for(int i=n; i>0; i--){
            System.out.print(" ");
            for(int j=i-1; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<i; j++){
                for(int k=1; k<i; k++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}

import java.util.*;
public class Permutation {
    
    void permute(String str, int startIndex, int endIndex)
    {
        if (startIndex == endIndex)
            System.out.println(str);
        else {
            for (int i = startIndex; i <= endIndex; i++) {
                str = swap(str, startIndex, i);
                permute(str, startIndex + 1, endIndex);
                str = swap(str, startIndex, i);
            }
        }
    }
 
    public String swap(String stringValue, int i, int j)
    {
        char temp;
        char[] charArray = stringValue.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String = ");
        String str = sc.next();
        int n = str.length();
        Permutation permutation = new Permutation();
        System.out.println("All permutation of the given String = ");
        permutation.permute(str, 0, n - 1);
    }
}

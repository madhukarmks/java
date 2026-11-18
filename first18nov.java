import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        int [] arr={1,2,3,8,5,6,7,8,9};
        int add=0;
        for(int a:arr)
        {
            add+=a;
        }
        System.out.println("this is the addition of the given array"+" : "+add);
        
        
       Arrays.sort(arr);
        
        int n=arr.length;
        boolean issorted=true;
        
        for(int i=1; i<n; i++)
        {
            if(arr[i-1]>arr[i])
            {
                System.out.println("array is not sorted ");
                issorted=false;
            }
        }
        if(issorted)
        {
            System.out.println("Arraay is sorted");
        }
    }
}

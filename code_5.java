import java.util.*;
public class Main{
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]>largest)
            {
                second_largest=largest;
                largest=arr[i];
            }
            else if(second_largest<arr[i]&&arr[i]!=largest)
            {
                second_largest=arr[i];
            }
        }
         System.out.println("the largest element is :"+largest );
         if(second_largest!=Integer.MIN_VALUE)
         System.out.println("the second largest element is :"+second_largest);
    }
    
    
    
}

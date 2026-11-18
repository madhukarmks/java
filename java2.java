import java.util.*;

public class Main{
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int []arr=new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++)
           {
               System.out.print(arr[i]+ " ");
           }    
           
        int min=arr[0];
        int max=arr[0];
        
        for(int i=0; i<n; i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        
        System.out.println("the min value in this array is :"+min);
        System.out.println("the max value in this array is : "+max);
        
        int min1=Arrays.stream(arr).min().getAsInt();
        int max1=Arrays.stream(arr).max().getAsInt();
        System.out.println(min1+" "+max1);
        
    }
}

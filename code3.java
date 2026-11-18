import java.util.Scanner;

public class Main{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int val=sc.nextInt();
        
        int a=0;
        int b=1;
        
        for(int i=0; i<val;i++)
        {
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}

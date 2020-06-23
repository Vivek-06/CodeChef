import java.io.IOException;
import java.util.Scanner;

public class Chef_and_Icecream {
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int count5=0,count10=0,count15=0;
		    String s="YES";
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==5)
		        {
		            count5++;
		        }
		        else if(a[i]==10)
		        {
		            if(count5>=1)
		            {
		                count10++;
		                count5--;
		            }
		            else
		            {
		                s="NO";
		                break;
		            }
		        }
		        else if(a[i]==15)
		        {
		            if(count10>=1)
		            {
		                count15++;
		                count10--;
		            }
		            else if(count5>=2)
		            {
		                count5-=2;
		                count15++;
		            }
		            else
		            {
		                s="NO";
		                break;
		            }
		        }
		        
		       
		    }
		     System.out.println(s);
		    
		    
		}
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int n=S.nextInt();
		    int lastdigit=n%10;
		    int firstdigit=n;
		    while(firstdigit>=10)
		    {
		        firstdigit=firstdigit/10;
		    }
		    int sum=firstdigit+lastdigit;
		    System.out.println(sum);
		}

	}
}

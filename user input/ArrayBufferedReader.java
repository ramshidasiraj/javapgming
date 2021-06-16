
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class ArrayBufferedReader
{
	public static void main(String args[])
	throws IOException
	{
		int limit,i;
		
		
			System.out.println("Enter the size of the array : ");
			BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
			limit=Integer.parseInt(r.readLine());
			int[] arr=new int[limit];
			System.out.println("Enter the elements of the array : ");
			for(i=0;i<limit;i++)
			{
				arr[i]=Integer.parseInt(r.readLine());
			}
			System.out.println("The array elements are : ");
			for(i=0;i<limit;i++)
			{
				System.out.println(arr[i]);
			}
		
	}	
}
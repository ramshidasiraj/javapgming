import java.io.*;
class ArrayreverseBuffer
{
	public static void main(String args[])
	throws IOException
	{
		int limit,i;
		System.out.println("Enter the size of the array : ");
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		limit=Integer.parseInt(r.readLine());
		int arr[]=new int[limit];
		System.out.println("Enter the elements : ");
		for(i=0;i<limit;i++)
		{
			arr[i]=Integer.parseInt(r.readLine());
		}
		System.out.println("The array elements in reverse order : ");
		for(i=limit-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
			
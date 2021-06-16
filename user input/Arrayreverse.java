import java.util.Scanner;
class Arrayreverse
{
	public static void main(String args[])
	{
		int limit,i;
		System.out.println("Enter the size of the array : ");
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		int arr[]=new int[limit];
		System.out.println("Enter the elements : ");
		for(i=0;i<limit;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements in reverse order : ");
		for(i=limit-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
			
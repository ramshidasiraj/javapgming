
import java.util.Scanner;
class Arrayelements
{
	public static void main(String args[])
	{
		int limit,i;
		
		
			System.out.println("Enter the size of the array : ");
			Scanner sc=new Scanner(System.in);
			limit=sc.nextInt();
			int[] arr=new int[limit];
			System.out.println("Enter the elements of the array : ");
			for(i=0;i<limit;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("The array elements are : ");
			for(i=0;i<limit;i++)
			{
				System.out.println(arr[i]);
			}
		
	}	
}
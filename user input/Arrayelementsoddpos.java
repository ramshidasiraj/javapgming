
import java.util.Scanner;
class Arrayelementsoddpos
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
			System.out.println("The array elements present in odd position are  : ");
			for(i=1;i<limit;i=i+2)
			{
				System.out.println(arr[i]);
			}
		
	}	
}
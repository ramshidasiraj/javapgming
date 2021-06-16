
import java.util.Scanner;
class Largestelement
{
	public static void main(String args[])
	{
		int limit,i,large=0;
		
		
			System.out.println("Enter the size of the array : ");
			Scanner sc=new Scanner(System.in);
			limit=sc.nextInt();
			int[] arr=new int[limit];
			System.out.println("Enter the elements of the array : ");
			for(i=0;i<limit;i++)
			{
				arr[i]=sc.nextInt();
				large=arr[i]>large? arr[i]:large;
			}
			
			System.out.println("The largest elements present in the array is  : "+large);
			
			
		
	}	
}
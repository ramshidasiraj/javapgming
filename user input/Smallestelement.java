
import java.util.Scanner;
class Smallestelement
{
	public static void main(String args[])
	{
		int limit,i,small=9999;
		
		
			System.out.println("Enter the size of the array : ");
			Scanner sc=new Scanner(System.in);
			limit=sc.nextInt();
			int[] arr=new int[limit];
			System.out.println("Enter the elements of the array : ");
			for(i=0;i<limit;i++)
			{
				arr[i]=sc.nextInt();
				small=arr[i]<small? arr[i]:small;
			}
			
			System.out.println("The smallest elements present in the array is  : "+small);
			
			
		
	}	
}
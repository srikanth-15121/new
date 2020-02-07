import java.util.*;
class Array_1d
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of students: ");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("marks of the students are: ");
		{
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
			
		}

	}
}
}
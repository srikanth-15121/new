import java.util.*;
class Array_2d
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of students: ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("marks of the students are: ");
		{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
			System.out.println(a[i][j]);
			}
		}

	}
}
}
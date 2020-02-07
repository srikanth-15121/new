import java.util.Scanner;
class Array_3d
{
	public static void main(String[] args) 
	{
		int a[][][]=new int[3][3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students in each class: ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
			      {
					System.out.println("Enter the details of school "+i+" class "+j+" students "+k+"");
			        a[i][j][k]=sc.nextInt();
			      }
			}
		}
		System.out.println("Number of the students in each class: ");
		 {
		   for(int i=0;i<=a.length-1;i++)
		      {
			     for(int j=0;j<=a[i].length-1;j++)
			        {
				       for(int k=0;k<=a[i][j].length-1;k++)
				          {
			                System.out.println(a[i][j][k]);
						  }
					}
			  }
	    }
	 }
}
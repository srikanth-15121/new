import java.util.Scanner;
class Array_3dj
{
	public static void main(String[] args) 
	{
		int a[][][]=new int[3][ ][ ];
		    a[0]=new int[2][ ];
			a[1]=new int[1][2];
			a[2]=new int[3][ ];
			a[0][0]=new int[2];
			a[0][1]=new int[3];
			a[2][0]=new int[1];
			a[2][1]=new int[2];
			a[2][2]=new int[2];
		
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
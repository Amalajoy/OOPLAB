import java.util.Scanner;
class Matrix
{
 int a[][]=new int[10][10];
 int r,c;

Matrix(int r,int c)
{
 this.r=r;
 this.c=c;
}

void read()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("the elements are");
 for(int i=0;i<r;i++)
 for(int j=0;j<c;j++)
 a[i][j]=sc.nextInt();
}

Matrix addition(Matrix b)
{
 Matrix M3=new Matrix(r,b.c);
 for(int i=0;i<r;i++)
 for(int j=0;j<b.c;j++)
{
 M3.a[i][j]=0;
 for(int k=0;k<c;k++)
 M3.a[i][j]=a[i][j]+b.a[i][j];
}
 return M3;
}

void display()
{
 System.out.println("Sum of matrices");
 for(int i=0;i<r;i++)
{
 for(int j=0;j<c;j++)
	
 System.out.print(a[i][j]+" ");
 System.out.println();		
}
 System.out.println();
}

public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of rows and coloumns of matrices");
 int r=sc.nextInt();
 int c=sc.nextInt();

 System.out.println("Enter the first matrix");
 Matrix M1=new Matrix(r,c);
 M1.read();
 
 System.out.println("Enter the second matrix");
 Matrix M2=new Matrix(r,c);
 M2.read();
 Matrix M3=M1.addition(M2);
 
 M3.display();
	
}
}




OUTPUT:

C:\Users\amala\Documents>java Matrix
Enter the number of rows and coloumns of matrices
2 3
Enter the first matrix
the elements are
1 2 3
4 5 1
Enter the second matrix
the elements are
5 2 3
0 1 1
Sum of matrices
6 4 6
4 6 2
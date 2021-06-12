import java.util.Scanner;
class Matrix
{
    Scanner in = new Scanner(System.in);
    int i,j,r,c;
    int a[][] = new int[100][100];

    void read() 
    {
        System.out.println("Enter the number of Rows and Columns");
        r = in.nextInt();
        c = in.nextInt();
    
        System.out.println("Enter the matrix:");
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
    }

    void checkSymm()
    {
        int f=0;
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                if (a[i][j] != a[j][i])
                {
                    f=1;
                    break;
                } 
            }
        }
        if(f==0)
            System.out.println("The Matrix Is Symmetric ");
        else
            System.out.println("The Matrix Is Not Symmetric");
    }
}

 class Myclass
{
    public static void main(String args[])
    {
        Matrix M = new Matrix();
        M.read();
        M.checkSymm();
    }
}



OUTPUT:

C:\Users\amala\Documents>java Myclass
Enter the number of Rows and Columns
2 3
Enter the matrix:
3 5
6 9
1 0
The Matrix Is Not Symmetric

C:\Users\amala\Documents>java Myclass
Enter the number of Rows and Columns
3 3
Enter the matrix:
1 1 3
1 2 0
3 0 5
The Matrix Is Symmetric

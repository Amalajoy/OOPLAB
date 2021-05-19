import java.util.Scanner;
class Search
{  
 public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 int i;
 System.out.println("Enter the number of elements:") ;
 int n = sc.nextInt();
 int[] a = new int[n];
 System.out.println("Enter the elements") ;
 for(i=0;i<n;i++)
{
 a[i] = sc.nextInt();
}
 
 System.out.println("Enter the element to be seached");
 int item = sc.nextInt();
 for (i= 0;i<n;i++)
{
 if (a[i]==item) 
{
 System.out.println(item+" is present ");
 break;
}
}
 if (i== n)
 System.out.println(item+ " doesn't exist in array.");
}
}


OUTPUT-

Enter the number of elements:
5
Enter the elements
3
4
6
8
9
Enter the element to be seached
7
7 doesn't exist in array.

C:\Users\amala\Documents>java Search
Enter the number of elements:
5
Enter the elements
8
3
0
2
6
Enter the element to be seached
0
0 is present
import java.util.Scanner;
class Employee
{ int eNo,eSalary;
  String eName;
  
void read()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter employee details-");
 System.out.println("Employee no:");
 System.out.println("Employee name:");
 System.out.println("Employee salary:");
 eNo=sc.nextInt();
 eName=sc.next();
 eSalary=sc.nextInt();
}

public static void main(String[] args) 
{ 
 Scanner sc=new Scanner(System.in);
 Employee emp[]=new Employee[5];
 System.out.println("Enter the limit");
 int n=sc.nextInt();
 for(int i=0;i<n;i++)
{
 emp[i]=new Employee();
 emp[i].read();
 }

 System.out.println("Enter the empno:");
 int N=sc.nextInt();
 for(int i=0;i<N;i++)
{
 if(emp[i].eNo==N)
{
 System.out.println("Employee found");
 break;
}
 if(i==n-1)
{
 System.out.println("Employee not found");
}
}
}
}



OUTPUT-

Enter the limit
3
Enter employee details-
Employee no:
Employee name:
Employee salary:
1
Alan
20000
Enter employee details-
Employee no:
Employee name:
Employee salary:
7
Arun
50000
Enter employee details-
Employee no:
Employee name:
Employee salary:
5
Thejus
8000
Enter the empno:
7
Employee found
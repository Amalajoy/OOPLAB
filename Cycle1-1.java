import java.util.Scanner;
class Complex
{ int r,i;
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  Complex c1=new Complex();
  Complex c2=new Complex();
  System.out.println("Enter real and imaginary values of first complex number");
  c1.r=sc.nextInt();
  c1.i=sc.nextInt();
  System.out.println("Enter real and imaginary values of second complex number");
  c2.r=sc.nextInt();
  c2.i=sc.nextInt();
  int sr=c1.r+c2.r;
  int si=c1.i+c2.i;
  System.out.println("Sum is:"+sr+"+"+si+"i");
}
}


OUTPUT-

Enter real and imaginary values of first complex number
2 5
Enter real and imaginary values of second complex number
4 8
Sum is:6+13i
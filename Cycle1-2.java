import java.util.Scanner;
class Product
{
 int pcode,pprice;
 String pname=""; 

void read()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter product code:");
 System.out.println("Enter product name:");
 System.out.println("Enter product price:");
 pcode=sc.nextInt();
 pname=sc.next(); 
 pprice=sc.nextInt();
}

void display()
{
 System.out.println("PRODUCT DETAILS");
 System.out.println("Product Code:"+pcode);
 System.out.println("Product Name:"+pname);
 System.out.println("Product Price:"+pprice);
}
}

class Details
{
 public static void main(String args[])
{
 Product p1=new Product();
 Product p2=new Product();
 Product p3=new Product();
 System.out.println("Enter the first product details:\n");
 p1.read();
 System.out.println("Enter the second product details:\n");
 p2.read();
 System.out.println("Enter the third product details:\n");
 p3.read();

if(p1.pprice<p2.pprice && p1.pprice<p3.pprice)
{
 System.out.println("\nSmallest price is " +p1.pprice);
 p1.display();
}
else if(p2.pprice<p3.pprice)
{
 System.out.println("\nSmallest price is " +p2.pprice);
 p2.display();
}
else 
{
 System.out.println("\nSmallest price is " +p3.pprice);
 p3.display();
}
}
}



OUTPUT-

Enter the first product details:

Enter product code:
Enter product name:
Enter product price:
4675
Lipstick
500
Enter the second product details:

Enter product code:
Enter product name:
Enter product price:
0782
Conditioner
200
Enter the third product details:

Enter product code:
Enter product name:
Enter product price:
3726
Compact
300

Smallest price is 200
PRODUCT DETAILS
Product Code:782
Product Name:Conditioner
Product Price:200





import java.util.Scanner;
class Overload
{
 Scanner sc=new Scanner(System.in);
 int length,breath;

void para()
{
  System.out.println("Enter length and breath of rectangle:");
  length=sc.nextInt();
  breath=sc.nextInt();
}

void area()
{
 System.out.println("Area of rectangle: "+(length*breath));
}
void area(int side)
{
 System.out.println("Area of square: "+(side*side));
}
void area(double r)
{
 double area = 3.14*r*r;
 System.out.println("Area of the circle: "+(3.14*r*r));
}
}

class Myclass 
{
 public static void main(String ar[])
 {
 Overload Over = new Overload();
 Over.para();
 Over.area();
 Over.area(10);
 Over.area(3.2);
 }
}



OUTPUT:

C:\Users\amala\Documents>java Myclass
Enter length and breath of rectangle:
3 4
Area of rectangle: 12
Area of square: 100
Area of the circle: 32.153600000000004
import java.util.Scanner;
abstract class Shape
{ int l,b;  
abstract void printArea();
}

class Rectangle extends Shape
{
void printArea()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter length and breadth of rectangle");
 super.l=sc.nextInt();
 super.b=sc.nextInt();
 System.out.println("Area of rectangle= " + l*b);
}
}

class Triangle extends Shape
{
void printArea()
{ 
 Scanner sc = new Scanner(System.in);
 System.out.println("\nEnter base and height of triangle"); 
 super.l=sc.nextInt();
 super.b=sc.nextInt();     
 System.out.println("Area of triangle= " + (l*b)/2);
}
}

class Circle extends Shape
{
void printArea()
{
 Scanner sc = new Scanner(System.in);
 System.out.println("\nEnter radius of circle");
 super.l=sc.nextInt();
 System.out.println("Area of circle= " +3.14*l*l);
}
}

class AbstractAreas
{ 
public static void main(String args[])
{ 
Rectangle s= new Rectangle();
s.printArea();
Triangle t= new Triangle();
t.printArea();
Circle c= new Circle();
c.printArea();
}
}
import java.util.Scanner;
abstract class Shape{
abstract void draw();
abstract void erase(); }

class square extends Shape
{
 void draw()
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the side of square");
   int s=sc.nextInt();
   System.out.println("Each side of Square is "+s);
   System.out.println("Area is " +s*s);
  }
 void erase()
  {
   System.out.println("Square removed"); 
  }
}

class triangle extends Shape
{
 void draw()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("\nEnter the base and height of traingle");
  int b=sc.nextInt();
  int h=sc.nextInt();
  System.out.println("This is a Right Angled Triangle");
  System.out.println("It's base length and hypotenues are "+b+" and "+h);
  System.out.println("Area is " +(b*h)/2);
 }
 void erase()
 {
  System.out.println("Triangle removed"); 
  } 
}

class circle extends Shape
{
 void draw() {
 Scanner sc = new Scanner(System.in);
 System.out.println("\nEnter the radius");
 int r=sc.nextInt();
 System.out.println("This is a Circle of radius "+r);
 System.out.println("Area is "+3.14*r*r);
 }
 void erase(){
 System.out.println("Circle removed"); } }


class Hello {
    public static void main(String[] args)
    { 
     Shape s=new square();
        s.draw();
        s.erase();
  
      Shape t= new triangle();
        t.draw();
        t.erase();

        Shape c= new circle();
        c.draw();
        c.erase();
     }
}
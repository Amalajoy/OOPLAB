import java.util.Scanner;
class Strings 
{
 Scanner sc = new Scanner(System.in);
 String s1;
 
void get()
 {
  System.out.println("Enter a string:");
  s1=sc.next(); 
 }
void length()
 {   
  System.out.println("\nLength of "+s1+" is:"+s1.length());
 } 
void compare()
 {
  System.out.println("\nEnter another string to compare:");
  String s2=sc.next();
  if(s1.compareTo(s2)==0)
   { System.out.println("Strings are same");  }
  else
   { System.out.println("Strings are not same");  }
  }
void concat()
 {
  System.out.println("\nEnter another stirng to concat:");
  String s2=sc.next();
  String s3=s1+" "+s2;
  System.out.println("Concatenated string: "+s3);
 }
void upper_lower()
 {
  System.out.println("\nUpper case:"+s1.toUpperCase());
  System.out.println("Lower case:"+s1.toLowerCase());
 }
void reverse()
 {
   StringBuilder sb=new StringBuilder(s1);
   System.out.println("\nReverse of "+s1+" is:"+sb.reverse());
 }
}
 
class Hello {
  public static void main(String... a) {
   int n;
   Strings s=new Strings();
   Scanner sc = new Scanner(System.in);
   s.get();
   s.length();
   s.compare();
   s.concat();
   s.upper_lower();
   s.reverse();
 }
}
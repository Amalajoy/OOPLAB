import java.util.Scanner;
class Order
{ 
  void Sort()
   {
     int n;
     String temp;
     Scanner sc = new Scanner(System.in); 
     System.out.print("Enter number of strings:");
     n = sc.nextInt();
     String a[] = new String[n];
     Scanner s1 = new Scanner(System.in); 
     System.out.println("Enter the strings:");
     for(int i = 0; i < n; i++)
      { a[i] = s1.nextLine(); }
     for (int i = 0; i < n; i++) 
      {
       for (int j = i + 1; j < n; j++) 
        { if (a[i].compareTo(a[j])>0) 
          {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
          }
        }
      }
     System.out.print("Names in Sorted Order:");
      for (int i = 0; i < n - 1; i++) 
       {
        System.out.print(a[i] + ",");
       }
    System.out.print(a[n - 1]);
   } }
class Hello
{
public static void main(String[] args) 
{ Order o = new Order();
  o.Sort();
} }
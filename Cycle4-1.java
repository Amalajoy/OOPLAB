import java.util.*;

class Numbers extends Thread
{
public void run() 
{
System.out.println("\nThread is under Running...");
for(int i= 1; i<=10; i++)
{
System.out.println("i = " + i);
}
}
}

class Even extends Thread
{
public void run() 
{
int n=10;  
System.out.print("\nList of even numbers from 1 to "+n+": ");  
for (int i=1; i<=n; i++)   
{  
if (i%2==0)   
{  
System.out.print(i + " ");  
}  
}  	
}
}


class Odd implements Runnable 
{
public void run() 
{
  int n=10;
  System.out.print("\nOdd Numbers from 1 to "+n+" are: ");
  for (int i = 1; i <= n; i++)
  { if (i % 2 != 0) 
    {
     System.out.print(i + " ");
    }
}
}
}

class hello
 {
  public static void main(String ...a)throws Exception{
  Scanner sc = new Scanner(System.in);
        
Numbers t1 = new Numbers();
Even t2=new Even();
Odd s = new Odd();
Thread t3 = new Thread(s);
 int c;
 do{
 System.out.println("\n1.Print numbers\n2.Even Numbers\n3.Odd Numbers\n4.Exit\nOption:");
 c = sc.nextInt();
 switch (c){
 case 1:t1.start();
 t1.join();
 break;
 case 2:t2.start();
 t2.join();
 break;
 case 3:t3.start();
 t3.join();
 break;
 case 4:System.exit(0);
 break;
 default:System.out.println("Invalid");
 break; }
} while (c!=4);
}
}
import java.util.Scanner;
class Publisher
{
 int pid; 
 String name;

Publisher()
{   
 Scanner sc=new Scanner(System.in);
 System.out.println("PUBLISHER DETAILS:");
 System.out.println("Enter Publisher ID and Publisher name-");
 pid=sc.nextInt();
 name=sc.next();
}
}

class Book extends Publisher
{
 String bname;
 int bid;
 
 Book()
  { Scanner sc=new Scanner(System.in);
    System.out.println("BOOK DETAILS:");
    System.out.println("Enetr Book name and Book ID-");
    bname=sc.next(); 
    bid=sc.nextInt();
  }
}

class Literature extends Book
{
 String chap;
 int chapno;

Literature()
 {  Scanner sc=new Scanner(System.in);
    System.out.println("Enter Chapter No. and Chapter Name-");
    chapno=sc.nextInt();  
    chap=sc.next();
 }
}

class Fiction extends Literature
{
 String fict;
 String author; 
 Fiction()
  {  
    Scanner sc=new Scanner(System.in);
    System.out.println("FICTION DETAILS:");
    System.out.println("Enter Fiction and author-");
    fict=sc.next();
    author=sc.next();
  }
   
 void display()
    {
        System.out.println("DETAILS ARE:-");

        System.out.println("Publisher Name: "+name);
        
        System.out.println("Publisher Id: "+pid);
        
        System.out.println("Book name: "+bname);
        
        System.out.println("Book Id: "+bid);
        
        System.out.println("Chapter: "+chap);
        
        System.out.println("Chapter Number: "+chapno);
        
        System.out.println("Fiction: "+fict);

        System.out.println("Author: "+author);
    }
}

class Myclass
 {
 public static void main(String ar[])
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter the limit:");
    int n=sc.nextInt();
    Fiction F[]=new Fiction[n];
    for (int i=0;i<n;i++)
    {
      F[i]=new Fiction();
      F[i].display();
    }
  }
}



OUTPUT:

C:\Users\amala\Documents>java Myclass
Enter the limit:
1
PUBLISHER DETAILS:
Enter Publisher ID and Publisher name-
5678 DIVIN
BOOK DETAILS:
Enetr Book name and Book ID-
ALCHEMIST 03456
Enter Chapter No. and Chapter Name-
1 LostSpace
FICTION DETAILS:
Enter Fiction and author-
BELOVED SHAKESPEAR
DETAILS ARE:-
Publisher Name: DIVIN
Publisher Id: 5678
Book name: ALCHEMIST
Book Id: 3456
Chapter: LostSpace
Chapter Number: 1
Fiction: BELOVED
Author: SHAKESPEAR
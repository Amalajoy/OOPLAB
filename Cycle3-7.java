import java.util.Scanner;

class SortStringArray
 {
  String[] str = new String[100];
  int size;

 void get() 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit:");
    size = sc.nextInt();
    System.out.println("Enter elements:");
     for (int i=0;i< size;i++){
      str[i] = sc.next();       }
    System.out.println("\norginal string:"); 
     for (int i=0;i<size;i++){
      System.out.println(str[i]);  }
  }

 void sort()
  {
   for (int i = 0; i < size; i++){
    for (int j = i+1; j < size; j++){
     if (str[i].length() < str[j].length()){
       String temp = str[i];
       str[i] = str[j];
       str[j] = temp;  } } }
  }

 void display()
  {  System.out.println("\nSorted strings in descending order:");
    for (int i=0;i< size;i++){
     System.out.println(str[i]);  }
        
	for (int i = 0; i <size; i++){
         for (int j = i+1; j <size; j++){
          if (str[i].length() > str[j].length()){
           String temp = str[i];
           str[i] = str[j];
           str[j] = temp; } } } 
     
   System.out.println("\nSorted strings in ascending order:");
    for (int i=0;i< size;i++){
     System.out.println(str[i]); }    
   
   }
}

class Hello
{
  public static void main(String[] args) 
  {
   SortStringArray s=new SortStringArray();
    s.get();
    s.sort();
    s.display();
  }
}
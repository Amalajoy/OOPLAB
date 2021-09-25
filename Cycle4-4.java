import java.io.*;
import java.util.*;

class File
{
 public static void main(String arg[])throws Exception{
		
	FileInputStream f1=new FileInputStream("C:/Users/amala/Documents/data.txt");
	Scanner sc=new Scanner(f1);
		
	FileOutputStream odd=new FileOutputStream("C:/Users/amala/Documents/odd.txt");
	DataOutputStream o1=new  DataOutputStream(odd);
	FileOutputStream even=new FileOutputStream("C:/Users/amala/Documents/even.txt");
	DataOutputStream e1=new  DataOutputStream(even);
	
	try{
	     while(true){
	     int x=sc.nextInt();           
	     if(x%2==0){
		e1.writeInt(x);            
		}
	     else{
		o1.writeInt(x);
		  }
		 }
		}
	
	catch(Exception e){};
	       
		FileInputStream odd1=new FileInputStream("C:/Users/amala/Documents/odd.txt");
		DataInputStream o2=new  DataInputStream(odd1);
		FileInputStream even1=new FileInputStream("C:/Users/amala/Documents/even.txt");
		DataInputStream e2=new  DataInputStream(even1);
		System.out.println("Odd Numbers:");
		try{
		while(true){
			int x=o2.readInt();
			System.out.println(x);
			}
		}catch(Exception e){};
		System.out.println("Even numbers:");
		try{
		while(true){
			int y=e2.readInt();
			System.out.println(y);
			}
		}catch(Exception e){};
	}
}
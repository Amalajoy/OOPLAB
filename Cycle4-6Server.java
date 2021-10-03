import java.net.*;
import java.io.*;
import java.util.*;
class server
{ 
public static void main(String a[])
{ try
{
System.out.println("SERVER PROGRAM");
System.out.println("");
System.out.println("TYPE A MESSAGE:");
System.out.println("");
ServerSocket ss=new ServerSocket(1426);
Socket s=ss.accept();
System.out.println("connected");
Scanner sc=new Scanner(System.in);
String str=" ";
OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);

while(!str.equals("STOP"))
{
str=sc.nextLine();
ps.println(str);
}
os.close();
s.close();
}catch(Exception e){System.out.println(e);}
}
}
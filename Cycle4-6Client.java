import java.net.*;
import java.io.*;
import java.util.*;

class Client
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("CLIENT PROGRAM");
            System.out.println("");
            System.out.println("MESSAGE FROM THE SEVER:");
            System.out.println("");
            Socket s = new Socket("127.0.0.1", 1426);
            Scanner sc = new Scanner(s.getInputStream());
            String str = "";
            do {
                str = sc.nextLine();
                System.out.println(str);
            }while (!str.equals("STOP"));
            sc.close();
            s.close();
        }catch (Exception e){

        }
    }
}
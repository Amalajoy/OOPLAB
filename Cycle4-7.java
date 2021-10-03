
import java.io.*;
 class Hello
{
    public static void main(String args[])throws Exception
    {
        int lcount=1,wcount=0;
        char ch;
        File a1= new File("C4Q7.txt");
        FileInputStream f1=new FileInputStream(a1);
        int n=f1.available();
        for(int i=0;i<n;i++)
        {
            ch=(char)f1.read();
            if(ch=='\n')
                lcount++;
            else if(ch==' ')
                wcount++;

        }
        System.out.println("\nNumber of lines : "+lcount);
        System.out.println("\nNumber of words : "+(lcount+wcount));
        System.out.println("\nNumber of characters : "+n);
      }
}
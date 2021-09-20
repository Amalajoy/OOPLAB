import java.io.*;
import java.util.*;

class file{
   
    void writefile() throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Users/amala/Documents/india.text");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("INDIA IS MY COUNTRY");
    }
    void readfile() throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/amala/Documents/india.text");
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}

 class Hello {
    public static void main(String ...a) throws Exception {
        file f = new file();
        f.writefile();
        f.readfile();
    }
}

import java.util.Scanner;

class customer
{
  String name,bank;
  int accno,amnt,time;
  customer(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Name:");
    name = sc.next();
    System.out.println("Enter Bank:");
    bank = sc.next();
    System.out.println("Account no:");
    accno = sc.nextInt();
    System.out.println("Enter Principle Amount:");
    amnt = sc.nextInt();
    System.out.println("Enter Time Period:");
    time = sc.nextInt();
   }
}

class Investment 
{
 static void intrest(customer c)
   {
     switch (c.bank){
       case "Federal":System.out.println("Intrest at Federal:"+(c.amnt*8.4*c.time)/100);
                      break;
       case "Karur":System.out.println("Intrest at Karur:"+(c.amnt*7.3*c.time)/100);
                    break;
       case "BOI":System.out.println("Intrest at BOI:"+(c.amnt*9.7*c.time)/100);
                  break;
       default:System.exit(0);
               break;
         }
   }

}

class Hello 
{  public static void main(String ...a){
      customer c = new customer();
      Investment.intrest(c);  }
}





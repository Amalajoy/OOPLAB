import java.util.Scanner;
interface Bill
{
 void displayBill();
}

class PayBill implements Bill
{
	Scanner sc = new Scanner(System.in);
	int pId, quant, unitPrice, totalPrice; 
	static int netAmount = 0,order_no;
	String Name;
	
	PayBill()
	{       System.out.print("Order No   : ");
		order_no = sc.nextInt();
		System.out.print("Product ID   : ");
		pId = sc.nextInt();
		System.out.print("Product Name : ");
		Name = sc.next();
		System.out.print("Quantity     : ");
		quant = sc.nextInt();
		System.out.print("Price   : ");
		unitPrice = sc.nextInt();
		
		totalPrice = unitPrice * quant; 
		netAmount = netAmount + totalPrice; 
	}

	public void displayBill(){
	
		System.out.println(pId + "   \t\t" + Name +"\t\t" + quant + "     \t\t" + unitPrice + "    \t\t" + totalPrice);
		
	}
	
}

class Hello extends PayBill
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter no. of items purchased: ");
		n = sc.nextInt();
		
		Bill bill[] = new PayBill[n];

		for( int i=0; i< n; i++)
		{
			bill[i] = new PayBill();
		}
		System.out.println("\n                                                  BILL");
		System.out.println("\nORDER No.: " + order_no); 
		System.out.println("DATE     : " + java.time.LocalDate.now()); 
		System.out.println("");
		System.out.println("PRODUCT ID\t NAME\t\tQUANTITY\tUNIT PRICE\tTOTAL");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		for( int i=0; i< n; i++)
		{
			bill[i].displayBill();
		}
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
			System.out.println("					   NET AMOUNT           " + netAmount);
			System.out.println("		    					   ===============");
	}
}
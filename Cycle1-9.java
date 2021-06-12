

class CPU {
    static int memory=16 ;
    static String manufact= "INTEL";
    int price;
    CPU(int price)
    {
        this.price=price;
         System.out.println("CPU Price- "+price);
    }
    class  Processor{
        Processor(int core,String manufcturer)
        {
            System.out.println("Processor Core- "+core);
            System.out.println("Manufacturer- "+manufcturer);
        }
    }
    static class RAM{
        RAM()
        {
            System.out.println("RAM Memory- "+memory+"GB");
            System.out.println("Manufacturer- "+manufact);
        }
    }
}
 class Myclass
{
    public static void main(String arg[])
    {
        CPU c = new CPU(30000);
        CPU.Processor pr=c.new Processor(24,"Intel Xeon W");
        new CPU.RAM();

    }
}
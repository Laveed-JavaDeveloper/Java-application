import java.util.Scanner;
class farmer
{
    private float principleAmount;
    private float timeDuration;
    private float totalAmount;
    private static float rateOfinterest;
    static
    {
        rateOfinterest=2.5f;
    } 
    public void acceptInput()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("FARMER ENTER THE LOAN AMOUNT NEEDED              :: ");
        principleAmount=s.nextFloat();
        System.out.print("FARMER ENTER THE TIME PERIOD TO REPAY THE AMOUNT :: ");
        timeDuration=s.nextFloat();
    }
    public void compute()
    {
        float Amount=(principleAmount*timeDuration*rateOfinterest)/100;
        totalAmount=(Amount+principleAmount);
    }
    public void display()
    {
        System.out.print("TOATAL AMOUNT TO REPAY IS :: "+totalAmount);
    }
}
class LaunchFarmer
{
    public static void main(String []args)
    {
        farmer f=new farmer();
        f.acceptInput();
        f.compute();
        f.display();
    }
}
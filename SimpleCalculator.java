import java.util.Scanner;
public class SimpleCalculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static double divide(double a,double b){
        if(b==0){
            System.out.println("Error division by zero is not possible");
            return Double.NaN;
        }
        return a/b;
    }
    public static double mod(double a,double b){
        if (b==0) {
            System.out.println("Error modulo division by zero is not possible");
            return Double.NaN;
        }
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println("===========Simple_Calculator_App===========");
        try (Scanner scan = new Scanner(System.in)) {
            double Calculation_Result=0;
            boolean validOperator=true;
            System.out.print("Enter Value For Number1 :: ");
            double Num1=scan.nextDouble();
            System.out.print("Enter Any One Operator  :: (+,-,/*,%) :");
            char op=scan.next().charAt(0);
            System.out.print("Enter Value For Number2 :: ");
            double Num2=scan.nextDouble();
            switch (op) {
                case '+':
                    Calculation_Result=add(Num1,Num2);
                    break;
                case '-':
                    Calculation_Result=subtract(Num1,Num2);
                    break;
                case '*':
                    Calculation_Result=multiply(Num1,Num2);
                    break;
                case '/':
                    Calculation_Result=divide(Num1,Num2);
                    break;
                case '%':
                    Calculation_Result=mod(Num1,Num2);
                    break;
                default:
                    System.out.println("Error: Enter Valid Operator");
                    validOperator=false;
                    break;
            }
            System.out.println("The Calculation Result :: "+Calculation_Result);
        }
    }
}

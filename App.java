import java.util.Scanner;
import java.text.DecimalFormat;

public class App 
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) throws Exception 
    {   
        Loan loan1 = new Loan();

        loan1.setLoanDate();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        loan1.setAnnualInterestRate(input.nextDouble());

        System.out.println("Enter number of years as an integer: ");
        loan1.setNumberOfYears(input.nextInt());

        System.out.println("Enter loan amount, for example, 120000.95: ");
        loan1.setLoanAmount(input.nextDouble()); 

        input.close();
                
        System.out.println("The loan was created on "+loan1.getLoanDate());

        double monthlyPayment = loan1.getMonthlyPayment(loan1.getAnnualInterestRate(), loan1.getLoanAmount(), loan1.getNumberOfYears());
        System.out.println("The monthly payment is "+df.format(monthlyPayment));

        double totalPayment = loan1.getTotalPayment(monthlyPayment, loan1.getNumberOfYears());
        System.out.println("The total payment is "+df.format(totalPayment));
    }
}

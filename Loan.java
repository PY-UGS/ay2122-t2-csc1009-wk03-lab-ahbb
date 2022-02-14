import java.util.Date;

public class Loan 
{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date currentDate;
    
    public double getAnnualInterestRate() 
    {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() 
    {
        return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) 
    {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() 
    {
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) 
    {
        this.loanAmount = loanAmount;
    }

    public void setLoanDate()
    {
        currentDate = new Date();
    }

    public Date getLoanDate()
    {
        return this.currentDate;
    }

    public double getMonthlyPayment(double annualInterestRate, double loanAmount, int numberOfYears)
    {
        //applying formula
		double monthlyInterestRate = (annualInterestRate/100)/12;
        double monthlyPayment = 1 - (1 / (Math.pow((1+monthlyInterestRate),(numberOfYears*12))));
        monthlyPayment = (loanAmount * monthlyInterestRate)/monthlyPayment;
        return monthlyPayment;
	}

    public double getTotalPayment(double monthlyPayment, int numberOfYears)
    {
        //applying formula
		double totalPayment = monthlyPayment*numberOfYears*12;
        return totalPayment;
	}

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public Loan()
    {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
    }
    
}

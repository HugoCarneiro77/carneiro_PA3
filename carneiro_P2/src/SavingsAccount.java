public class SavingsAccount
{
    public static double annualInterestRate;
    public double savingsBalance;

    public static void modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }

    public SavingsAccount(double accountBalance)
    {
        savingsBalance = accountBalance;
    }

    public void calculateMonthlyInterest()
    {
        double monthlyInterest = ((this.savingsBalance * annualInterestRate) / 12);
        this.savingsBalance += monthlyInterest;
    }
}
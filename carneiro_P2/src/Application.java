public class Application
{
    public static void main(String[] args)
    {
        int i;
        SavingsAccount saver1, saver2;

        saver1 = new SavingsAccount(2000.0);
        saver2 = new SavingsAccount(3000.0);

        SavingsAccount.annualInterestRate = .04;

        System.out.printf("Interest rate is 4 percent\n");
        for(i = 0; i < 12; i++)
        {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("Month Number %d\n", i + 1);
            System.out.printf("Saver 1 balance: %.2f\n", saver1.savingsBalance);
            System.out.printf("Saver 2 balance: %.2f\n", saver2.savingsBalance);
        }

        System.out.printf("Interest rate is 5 percent\n");
        SavingsAccount.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance: %.2f\n", saver1.savingsBalance);
        System.out.printf("Saver 2 balance: %.2f\n", saver2.savingsBalance);
    }
}

public class CheckingAccount extends BankAccount
{
    double interestRate;

 // add @override in future iterations 
    public void processWithdrawal(double amount)
    {
        balance = balance - amount;

        if(balance < 0)
        {
            balance = balance - 30;
            System.out.println("Overdraft fee applied: $30");
        }

        System.out.println("Withdrawal processed");
        System.out.println("Current balance: $" + balance);

    }

    public void displayAccount()
    {
        accountSummary();

        System.out.println("Interest Rate: " + interestRate);

    }

}
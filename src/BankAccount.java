public class BankAccount
{
    String firstName;
    String lastName;
    int accountID;
    double balance;

    public BankAccount()
    {
        balance = 0;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
    public void withdrawal(double amount)
    {
        balance = balance - amount;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setAccountID(int accountID)
    {
        this.accountID = accountID;
    }
    
    public int getAccountID()
    {
        return accountID;
    }

    public double getBalance()
    {
        return balance;
    }

    public void accountSummary()
    {
        System.out.println("Account Summary");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $ " + balance);
    }

}

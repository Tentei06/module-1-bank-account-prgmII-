public class Main
{
    public static void main(String[] args)
    {
        CheckingAccount myAccount = new CheckingAccount();

        myAccount.setFirstName("Cody");
        myAccount.setLastName("Walker");
        myAccount.setAccountID(8675309);

        myAccount.interestRate = 0.02;

        myAccount.deposit(500);

        myAccount.processWithdrawal(200);

        myAccount.displayAccount();
        
    }
}
class SavingAccount
{
    private
    static double annualIntrestRate = 10;
    double m_intrest;
    double savingBalance;

    public void MonthlyIntrest(double savingBalance)
    {
        this.savingBalance=savingBalance;
        m_intrest=((savingBalance * annualIntrestRate)/12);
        System.out.println("Monthly Intrest (10) : "+ m_intrest);
        savingBalance += m_intrest;
        System.out.println("After Monthly Intrest Monthly Salary Is : "+savingBalance);
    }
    public void modifyIntrestRate(double savingBalance)
    {
        SavingAccount.annualIntrestRate=8;
        this.savingBalance=savingBalance;
        m_intrest=((savingBalance * annualIntrestRate)/12);
        System.out.println("Monthly Intrest (8) : "+ m_intrest);
        savingBalance += m_intrest;
        System.out.println("After Monthly Intrest Monthly Salary Is : "+savingBalance);
    }
    
}

class SavingAccountTest
{
    public static void main(String[] args) 
    {
        SavingAccount saver1 = new SavingAccount();
        saver1.MonthlyIntrest(1000);
        saver1.modifyIntrestRate(1000);
    }
}
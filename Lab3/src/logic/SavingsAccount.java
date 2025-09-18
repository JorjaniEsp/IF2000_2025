package logic;

public class SavingsAccount extends Account {
    
    private String initialDate;
    private int months;
    private float interest;
    
    public static Binnacle log = new Binnacle();

    public SavingsAccount() {
    }

    public SavingsAccount(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingsAccount(String initialDate, int months, float interest, String accountNumber, double balance, Client client, String bank) {
        super(accountNumber, balance, client, bank);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    @Override
    public void deposit(double amount) {
        
        super.setBalance(this.getBalance()+amount);
        
         log.record("Deposit", this.getAccountNumber(), this.getClient().getId(), amount, this.getBalance());

    }

    @Override
    public void withdraw(double amount) {
        if(amount<=this.getBalance()){
        super.setBalance(this.getBalance()-amount);
        } else {
            System.out.println("You dont have enough money");
        }
        
        log.record("Withdraw", this.getAccountNumber(), this.getClient().getId(), amount, this.getBalance());
    }
    @Override
    public double interesCalculation() {
        
        double total;
        total = this.getMonths()*super.getBalance()*getInterest();
        return super.getBalance()+total;
    } //endInterestCalculeting

    @Override
    public String toString() {
        double gainedInterest = (getMonths() * getBalance() / 100) * getInterest();
        double finalBalance = getBalance() + gainedInterest;
        
        String result = "\nACCOUNT TYPE: SAVINGS ACCOUNT"
        + "\n---------------------------------------------"
        + "\nInitial Date of Account: " + getInitialDate()
        + "\nMonths of Saving: " + getMonths()
        + "\nInterest Rate: " + getInterest()
        + "\nGained Interest: " + gainedInterest
        + "\nBalance After Interest: " + finalBalance
        + "\n---------------------------------------------";
        return super.toString() + result;
    }

}

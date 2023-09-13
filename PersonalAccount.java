public class PersonalAccount {    private int accountNumber;
    private String accountHolder;    private double balance;
    ArrayList<Amount> transactions = new ArrayList<>();
    public PersonalAccount(int accountNumber, String accountHolder) {this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;        balance = 0;
    }
    public void deposit(double amount) {balance += amount;
        transactions.add(new Amount(amount, "Deposit"));    }
    public void withdraw(double amount) {
        if (balance - amount > 0) {
        balance -= amount;            transactions.add(new Amount(amount, "Withdraw"));
    }        else {
        System.out.println("Not enough money!");
    }
    }
    void printTransactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }    }
    public int getAccountNumber() {
        return accountNumber;    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;    }
    public String getAccountHolder() {
        return accountHolder;    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;    }
    public double getBalance() {
        return balance;    }

    public ArrayList<Amount> getTransactions() {
        return transactions;
    }
    public void setTransactions(ArrayList<Amount> transactions) {
        this.transactions = transactions;
    }
    @Override    public String toString() {
        return  "accountNumber=" + accountNumber + ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance + ", transactions=" + transactions;
    }}

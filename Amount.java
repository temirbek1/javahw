public class Amount {
    private double amount;
    private String transactionType;
    Amount() {
    }
    Amount(double amount, String type) {        this.amount = amount;
        transactionType = type;    }
    public void setAmount(double amount) {        this.amount = amount;
    }
    public void setTransactionType(String transactionType) {        this.transactionType = transactionType;
    }
    public double getAmount() {        return amount;
    }
    public String getTransactionType() {        return transactionType;
    }
    @Override    public String toString() {
        return "amount = " + amount +                ", transactionType = '" + transactionType + '\'';
    }}




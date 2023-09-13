// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


            PersonalAccount first = new PersonalAccount(1, "name");
            System.out.println(first);        first.deposit(50);
            first.deposit(25);        first.deposit(666);
            first.withdraw(10);        first.withdraw(1000);
            first.printTransactionHistory();
            System.out.println(first);



    }
}
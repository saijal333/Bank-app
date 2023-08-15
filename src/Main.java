// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      HDFCAccount KrishAcc = new HDFCAccount("Krish","Krish123",5000);
      System.out.println(KrishAcc); //printed the attributes via toString

      //fetch balance
      System.out.println(KrishAcc.fetchBalance("random")); //wrong password
      System.out.println(KrishAcc.fetchBalance("Krish123")); //correct password

      //add money
        System.out.println(KrishAcc.addMoney(100000));

      //withdraw
        System.out.println(KrishAcc.withdrawMoney(200000,"Krish123"));
        System.out.println(KrishAcc.withdrawMoney(5000,"Krish123"));
        System.out.println(KrishAcc.withdrawMoney(5000,"random"));

      //change password
      System.out.println(KrishAcc.changePassword("Krish123","Krishna"));
      System.out.println(KrishAcc.fetchBalance("Krishna"));

      //calculate interest
       System.out.println("Interest for 5 years on the current balance will be: " + KrishAcc.calculateInterest(5));
    }
}
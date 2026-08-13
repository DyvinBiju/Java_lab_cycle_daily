import java.util.Scanner;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}

class ATM{
    private double balance = 2000;
    void withdraw(double amount) throws InsufficientFundsException{
        if (amount>balance){
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance=balance-amount;
        System.out.println("Balance: "+balance);
    }
}

public class ATMWithdrawal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ATM atm = new ATM();
        try{
            System.out.print("Enter the amount: ");
            double amount = sc.nextDouble();
            atm.withdraw(amount);
        }
        catch (InsufficientFundsException e){
            System.out.println("Sorry "+e.getMessage() );

        }
        catch (RuntimeException e){
            System.out.println("Invalid input.Please enter a number");

        }finally{
            sc.close();

        }
    }
}
package JavaProject;
import java.util.Scanner;

public class ATM implements ATmInterface {

    @Override
    public Customer deposit(Customer customer) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your deposit amount");
        float amount= sc.nextFloat();
        // Customer.account.account_balance = customer.account.account_balance + amount;
        customer.account.account_balance = customer.account.account_balance + amount;
        System.out.println(customer.account.account_balance);
        Transaction transaction =  new Transaction();
        // transaction.addTransaction(transaction); 
        
        return customer;

    }

    @Override
    public void withdraw() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void checkBalance(Customer customer) {
        // TODO Auto-generated method stub
        System.out.println("Your current balance: " + customer.account.account_balance);
        
    }
    
}

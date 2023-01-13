package JavaProject;
import java.util.Scanner;

public class Account extends Bank implements accountInterface {
    long account_no=0;
    float account_balance=0;
    String account_type=""; 


    @Override
    public Account addAccount() {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account no");
        this.account_no=sc.nextLong();
        System.out.println("Enter account balanced");
        this.account_balance=sc.nextFloat();
        System.out.println("Enter account type");
        this.account_type=sc.next();
        return this;

        
    }

    @Override
    public void deleteAccount() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void edit_Account() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void search_Account() {
        // TODO Auto-generated method stub
        
    }
    
}

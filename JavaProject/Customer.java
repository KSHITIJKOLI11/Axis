package JavaProject;
import java.util.Scanner;

public class Customer implements customerInterface {
    public Account account;
    String name="";
    int id=0;
    String email="";
    String password="";
    long phno=0;
    long cardno=0;
    String address="";


    @Override
    public void addCustomer() {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customerID");
        this.id=sc.nextInt();
        System.out.println("customer name");
        this.name=sc.next();
        System.out.println("customer email");
        this.email=sc.next();
        System.out.println("customer cardNo");
        this.cardno = sc.nextLong();
        System.out.println("customer phno");
        this.phno = sc.nextLong();
        System.out.println("customer Address");
        this.address=sc.next();
        this.account = new Account().addAccount();
    }

    @Override
    public void deleteCustomer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editCustomer() {
        // TODO Auto-generated method stub
        
    }
    
}

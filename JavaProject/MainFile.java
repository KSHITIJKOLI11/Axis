package JavaProject;
import java.util.Scanner;

public class MainFile {
    Bank BankObj=new Bank();

    /**
     * @param args
     */
    public static void main(String args[]){
        MainFile mainfile=new MainFile();
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("1.ADD customer\n 2: deposit \n 3: checkbalance \n 4:    \n 5:  ");
            int choice = sc.nextInt();

        switch(choice){
            case 1:
            Customer customer = new Customer();
            customer.addCustomer();
            mainfile.BankObj.map.put(customer.account.account_no,customer);
            break;
            
            case 2:
            System.out.println("enter account no");
            long account_no=sc.nextLong();
            if(mainfile.BankObj.map.containsKey(account_no)){
                ATM atmobj = new ATM();
             mainfile.BankObj.map.put(account_no,atmobj.deposit(mainfile.BankObj.map.get(account_no)));
            }
            else {
                System.out.println("account no not valid");
            }
            break;
            case 3:
            System.out.println("enter account no");
            long account_no1=sc.nextLong();
            if(mainfile.BankObj.map.containsKey(account_no1)){
                ATM atmobj = new ATM();
                mainfile.BankObj.map.put(account_no1, atmobj.deposit(mainfile.BankObj.map.get(account_no1)));
            }
            


        }
        
    }
    }
}    


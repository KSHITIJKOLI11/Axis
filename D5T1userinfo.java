import java.util.Scanner;

public class D5T1userinfo extends bankbranch {
    String name;
    byte loanAmount;
    D5T1userinfo storage[];
    int count= 0;
    Scanner sc = new Scanner(System.in);



    public D5T1userinfo(String brname, int brid, long brphn, float bankinterest, String bkname,
            int i, long bkphno, int bktotalfund, float branchinterest, String name, int j) {
        super(brname, brid, brphn, bankinterest, branchinterest, bkname, i, bkphno, bktotalfund, branchinterest);
        //TODO Auto-generated constructor stub
        this.name=name;
        this.loanAmount=loanAmount;
    }

      
    public void store(){
        if (count<storage.length){
            D5T1userinfo u = new D5T1userinfo( brname, brid, brphno, branchinterest, bkname, bkid, bkphno, bkid, branchinterest, name, loanAmount);
        System.out.println("Enter user name: ");
        u.name=sc.next();
        System.out.println("Enter user loan amount: ");
        u.loanAmount=(byte) sc.nextInt();
        storage[count]=u;
        count++;
        }
        else{
            System.out.println("Array size is full");
        }

    }
    
    /**
     * 
     */
    public void displayUserDetails(){
        for (D5T1userinfo u: storage){
            if(u!=null){
                System.out.println("Enter user name: " + u.name);
                System.out.println("Enter loan amount: " + u.loanAmount);
            } else {
                System.out.println("storage full");
            }
        }
        }
    



    public static void main(String args[]){
        D5T1userinfo u=new D5T1userinfo("axis", 873, 1234567890, 05f, "mumbai" , 48247, 1234890, 1000000, 5f, "Kshitij", 1000);
        System.out.println("Enter number of user: ");
        int n=u.sc.nextInt();
        u.storage= new D5T1userinfo[n];

        bankbranch Axis = new bankbranch("axis", 3143, 10543, 100000, 5f, "mumbai", (byte) 12, 12334556, 10000, 5f);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of user: ");
        String name = sc.next();
        System.out.println("Enter the loan amount");
        int loan = sc.nextInt();
        Axis.checkloan(loan,Axis.branchinterest);
        u.storage= new D5T1userinfo[n];
        u.store();
        u.displayUserDetails();

        while(true){
            System.out.println("Enter Case\n 1.addUser\n 2.Display user loan\n 3.Exit");
            int choice = u.sc.nextInt();
            switch(choice){
                case 1: u.store();
                break;
                case 2: u.displayUserDetails();
                break;
                case 3: System.exit(1);
                break;

            }
        }


    }


}

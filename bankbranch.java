import java.util.Scanner;

public class bankbranch extends bank {
    String brname;
    int brid;
    long brphno;
    private double branchtotalfund;
    private float branchinterest;

    public bankbranch (String brname, int brid, long brphno, double banktotalfund,float bankinterest,String bkname, byte bkid, long bkphno,int bktotalfund,  float branchinterest){
        super(bkname, bkid, bkphno, bktotalfund,bankinterest);
        super.bkname=bkname;
        super.bkid=bkid;
        super.bkphno=bkphno;
        this.brname=brname;
        this.brid=brid;
        this.brphno=brphno;
        this.branchtotalfund=branchtotalfund;
        this.branchinterest=branchinterest;

    }
    public static void main(String args[]){
        bankbranch axis=new bankbranch("axis", 3148060, 1234567890, 100000000, 05f, "axis", (byte) 1264187, 834704184, 0100000, 4f);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter loan amount: ");
        int loan=sc.nextInt();
        axis.checkloan(loan, axis.branchinterest);


    }
    


}

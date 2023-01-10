
public class bank {
    String bkname;
    byte bkid;
    long bkphno;
    private int bktotalfund;
    private float bankinterest; 

    public bank(String bkname, int i, long bkphno, int bktotalfund, float bankinterest){
        this.bkname=bkname;
        this.bkid=bkid;
        this.bkphno=bkphno;
        this.bktotalfund=bktotalfund;
        this.bankinterest=bankinterest;
    } 

    public void checkloan(int loanAmount, float branchIntr){
        if(loanAmount < bktotalfund){
            System.out.println("loan Approved"); 
        } else {
            System.out.println("loan Disapproved");
        }

    }

    public void totalinterest(float branchinterest ){
        System.out.println(bankinterest + branchinterest);
    }

}

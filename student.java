import java.util.Scanner;

public class student extends branch {
    static String sname = "Shubham s";
    static String splace= "Mumbai s";
    static String ssubject= "Maths";


        public student(String cname, String cbranch, String cstudents, String sname, String splace, String ssubject, String bname, float bid, int btotalstaff ) {
        super(cname, cbranch, cstudents, bname, bid, btotalstaff);
        this.sname = sname;
        this.splace = splace;
        this.ssubject = ssubject;

    }
    
    public void showstudentdetails(String cname , String bname ){
        System.out.println(sname + splace + ssubject + cname + bname);
    }

    public void showcollege(String cname, String cid, String cplace){
        System.out.println(cname + cid + cplace);
    }

    public void branchdetails(String bname, float bid , int btotalstaff){
        System.out.println(bname + bid + btotalstaff );
    }

    public static void main(String args[]){
        System.out.println(sname + splace + ssubject + cname + bname);
        System.out.println(cname +   bid   +     splace  );
        System.out.println(bname +   bid    +    btotalstaff   );

    }

}

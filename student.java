import java.util.Scanner;

public class student extends branch {
    String sname = "Shubham s";
    String splace= "Mumbai s";
    String ssubject= "Maths";


        public student(String sname, String splace, String ssubject) {
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

}

import java.util.Scanner;
public class college {
    static String cname = "Xavier's College";
    String cbranch = "Mumbai c";
    String cstudents = "Shubham c";

    public college(String cname, String cbranch, String cstudents) {
        this.cname = cname;
        this.cbranch = cbranch;
        this.cstudents = cstudents;
    }


    void Display(){
        System.out.println("College Details" + cname + cbranch + cstudents);
    }




    
}

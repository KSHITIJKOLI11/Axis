import java.util.Scanner;

public class D1T2{   
    public String name;
    public String company;
    private int userid;
    private String Position;
    protected  int age;

    public D1T2(String name, String company, int userid, String position, int age) {
        this.name = name;
        this.company = company;
        this.userid = userid;
        this.Position = Position;
        this.age = age;
    }



    void Display()
    {
        System.out.println("Name: " +name);
        System.out.println("company name : " + company);
        System.out.println("User Id : "+userid);
        System.out.println("Position :"+Position);
        System.out.println("Age : " +age);
    }
   public static void main (String[]args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name");
        String name = sc.next();
     System.out.println("Enter Company_name");
       String company = sc.next();
     System.out.println("Enter userid");
       int userid = sc.nextInt();
     System.out.println("Enter Position");
       String Position=sc.next();
     System.out.println("Enter age");
       int age=sc.nextInt();
     
    D1T2 User= new D1T2( name, company, userid, Position,  age);
      User.Display();

   }
}
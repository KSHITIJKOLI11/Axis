import java.util.Scanner;

public class D1T3{   
    public String name,company;
    private int UserID;
    private String Position;
    protected  int age;
 
    public D1T3(String name, String company, int UserID){
        this.name = name;
        this.company = company;
        this.UserID = UserID;
    }
    public D1T3(String Position,int age){
        this.Position = Position;
        this.age = age;
    }
    public D1T3(){

    }

    void Display(){
        System.out.println("Name: " + name);
        System.out.println("company name : " + company);
        System.out.println("User Id : "+ UserID);
        System.out.println("Position :"+ Position);
        System.out.println("Age : " + age);
    }
   public static void main (String[]args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name");
        String name = sc.next();
     System.out.println("Enter Company_name");
       String company = sc.next();
     System.out.println("Enter UserID");
       int UserID = sc.nextInt();
     System.out.println("Enter Position");
       String Position=sc.next();
     System.out.println("Enter age");
       int age=sc.nextInt();
     
    D1T3 User1= new D1T3( name, company, UserID);
    D1T3 User2= new D1T3( Position, age);
    D1T3 User3= new D1T3( );
      User1.Display();    
      User2.Display();   
      User3.Display();    

   }
}



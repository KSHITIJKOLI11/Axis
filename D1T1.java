import java.util.Scanner;

public class D1T1{
    static String eName;
    private static int eId;
    static String companyName;
    static String place;
    protected static int age;
    private static String designation;

   public static void CreateUser(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name: ");
    eName=sc.nextLine();
    System.out.println("Enter user Id : ");
    eId=sc.nextInt();
    System.out.println("Enter company name: ");
    companyName=sc.next();
    System.out.println("Enter place: ");
    place=sc.next();
    System.out.println("Enter age: ");
    age=sc.nextInt();
    System.out.println("Enter out destination : ");
    designation=sc.next();


   }

   void displayInfo(){
    System.out.println("User info as given\n");

    System.out.println("USer name: "+ eName);
    System.out.println("User Id: "+ eId);
    System.out.println("Company Name: "+ companyName);
    System.out.println("Place: "+ place);
    System.out.println("Age of user: "+ age);
    System.out.println("designation is : "+ designation);
    System.out.println();
   } 
   
   public static void main(String args[]){
    D1T1 u1= new D1T1();
    u1.CreateUser();
    u1.displayInfo();
   }

}
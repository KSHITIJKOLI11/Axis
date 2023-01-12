import java.util.HashMap;
import java.util.Scanner;

public class hashMain extends helperClass {
    HashMap<Integer, mapStudent> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        hashMain accessObj = new hashMain();
        System.out.println("Student portal");
        while(true){
            System.out.println("1. AddStudent\n 2. Search \n 3.delete \n 4.exit \n");
            System.out.println("choice any one of case Above \n ");
            int choice = accessObj.sc.nextInt(); 
            switch(choice){
                case 1:
                accessObj.addStudent();
                break;

                case 2:
                accessObj.searchStudent();
                break;

                case 3:
                accessObj.deleteStudent();
                break;

                case 4:
                System.exit(1);
                break;

                default:
                System.out.println("Wrong choice \n");
            }
        }
    }

        
}

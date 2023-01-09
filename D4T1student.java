import java.util.Scanner;

public class D4T1student {
    String name;
    int age;
    String place;
    String college;
    int count=0;
    D4T1student arrayD4T1student[];
    Scanner sc = new Scanner(System.in);


    public void addstudent(){
        if(count < arrayD4T1student.length){
            D4T1student s= new D4T1student();
        System.out.println("Enter student name : ");
        s.name = sc.next();
        System.out.println("Enter student's age : ");
        s.age = sc.nextInt();
        System.out.println("Enter place of student : ");
        s.place = sc.next();
        System.out.println("Enter college name : ");
        s.college = sc.next();

        arrayD4T1student[count]=s;
        count++;
        }
        else{
            System.out.println("Array size is full");
        }
    }

    public void displaystudent(){
        for (D4T1student s : arrayD4T1student){
            if(s!=null){
                System.out.println("Enter student's name: " + s.name);
                System.out.println("Enter student's age: " + s.age);
                System.out.println("Enter student's place : " + s.place);
                System.out.println("Enter student's college: " + s.college);
            }
        }
    }
    
    public static void  main (String args[]){
        D4T1student s = new D4T1student();
        System.out.println("Enter number of students: ");
        int n=s.sc.nextInt();
        s.arrayD4T1student= new D4T1student[n];
        while(true){
            System.out.println("Enter case\n 1.Addstudent\n 2.Display\n 3.Exit ");
            int choice = s.sc.nextInt();
            switch(choice){
                case 1 : s.addstudent();
                break;
                case 2 : s.displaystudent();
                break;
                case 3 : System.exit(1);
                break;
            

            }
        }
        
        

    }


    
}

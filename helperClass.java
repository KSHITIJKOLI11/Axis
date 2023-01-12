import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

// import javax.sound.sampled.SourceDataLine;

public class helperClass extends mapStudent {
   
    Scanner sc = new Scanner(System.in);
    HashMap <Integer, mapStudent> studentMap = new HashMap<Integer, mapStudent>(); 
    

    public void addStudent(){
        mapStudent s = new mapStudent();
        System.out.println("Enter Name: ");
        s.name = sc.next();
        System.out.println("Enter Roll no: ");
        s.rollno= sc.nextInt();
        System.out.println("Enter college name: ");
        s.college=sc.next();
        System.out.println("enter place name: ");
        s.place=sc.next();
        studentMap.put(rollno, s);

    }


    public void searchStudent(){
        System.out.println("Enter roll number to search: ");
        int s = sc.nextInt();
        for(Entry<Integer, mapStudent> m : studentMap.entrySet()){
           if(s == m.getKey()){
              System.out.println("Student is here in the dataset and his name is: " + m.getValue());
           }
        }
    }

    public void deleteStudent(){
        System.out.println("Enter Student's roll no to delete details");
        int s = sc.nextInt();
        studentMap.remove(s);

    } 

}

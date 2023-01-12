public class mapStudent {
    String name;
    int rollno;
    String college;
    String place;
    String branch;
    String semister;

    public mapStudent(String name, int rollno, String college, String place, String branch, String semister) {
        this.name = name;
        this.rollno = rollno;
        this.college = college;
        this.place = place;
        this.branch = branch;
        this.semister = semister;
    }

    public mapStudent() {
    }

    public void display(){
        System.out.println("Enter Student Name: " + this.name);
        System.out.println("Enter Student rollno: " + this.rollno);
        System.out.println("Enter Student college: " + this.college);
        System.out.println("Enter Student place: " + this.place);
        System.out.println("Enter Student branch: " + this.branch);
        System.out.println("Enter Student semister: " + this.semister);
    }

    
    
}

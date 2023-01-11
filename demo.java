import java.util.ArrayList;
import java.util.Iterator;

public class demo {
//     [12:37 PM] Faculty 67[F]
// Create class called demo
// Store object of that class inside arraylist

// [12:38 PM] Faculty 67[F]
// Perform arraylist operations on that 

public static void main(String args[]){
    ArrayList<Integer> demo = new ArrayList<Integer>();
    demo.add(2);
    demo.add(8);
    demo.add(6);
    demo.add(7);
    System.out.println(demo.remove(0));
    System.out.println(demo.isEmpty());
    System.out.println(demo.clone());
    System.out.println(demo.get(2));
    System.out.println(demo.set(1, 3));

    Iterator it = demo.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }

    


}

    
}

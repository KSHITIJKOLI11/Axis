
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();
			q.add(5);
            q.add(6);
            q.add(7);
            q.add(8);
            q.add(9);

	
		System.out.println("Elements of queue:"+ q);

		System.out.println(q);

		
		int head = q.peek();
		System.out.println("head of queue:"	+ head);

		
		int size = q.size();
		System.out.println("Size of queue:"+ size);
	}
    
}

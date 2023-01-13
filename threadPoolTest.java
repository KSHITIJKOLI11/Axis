import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPoolTest {

    public static void main(String args[]){
        ExecutorService obj = Executors.newFixedThreadPool(03);
        for (int i=0 ; i<10 ; i++){
        Runnable thread_demo = new threadPoolDemo();
        obj.execute(thread_demo);
        }

        Runnable thread_demo = new threadPoolDemo();
        obj.execute(thread_demo);
        
        // obj.execute(thread_demo);
        // obj.shutdown();
    }

}


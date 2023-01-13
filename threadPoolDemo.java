public class threadPoolDemo implements Runnable{
    private String message;

    public void WorkerThread(String name){
        this.message = name;
        
        
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    
}

public class threadG extends Thread{

    // public threadG(threadGroup gp1, String name){
    //     super(gp1, new Runnable(), name);

    // }



public threadG(ThreadGroup gp1, threadG threadsdemo, String string) {
    }

public threadG() {
}

public void run(){
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getThreadGroup());
} 

}

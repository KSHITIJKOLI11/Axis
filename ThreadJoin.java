public class ThreadJoin extends Thread{

    public void run(){
        for (int i=0; i<100; i++){
        System.out.println(Thread.currentThread().getName() + ": " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getState());

        }

    }
}

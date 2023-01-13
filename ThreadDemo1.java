public class ThreadDemo1 extends Thread {

    public void run(){
        // System.out.println("thread demo");
        for (int i=0 ; i<100; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}



class ThreadDemo2 extends Thread{

    public void run(){
    for (int i=0 ; i<100; i++){
        System.out.println(i);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
      
}
}

class ThreadDemo3 extends Thread{

    public void run(){
    for (int i=0 ; i<100; i++){
        System.out.println(i);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
      
}
}

class ThreadDemo4 extends Thread{

    public void run(){
    for (int i=0 ; i<100; i++){
        System.out.println(i);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
      
}
}



public class ThreadDemo{

    public static void main (String args[]){

        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo2 t2 = new ThreadDemo2();
        ThreadDemo3 t3 = new ThreadDemo3();
        ThreadDemo4 t4 = new ThreadDemo4();

        t1.start();
        t2.start();
        t3.start();
        t4.start();



           


    }

    
    

}

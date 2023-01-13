public class threadGroup {

    public static void main(String args[]){
        threadG threadsdemo = new threadG();
        ThreadGroup gp1 = new ThreadGroup("Group1");
        threadG t1 =new threadG(gp1 ,threadsdemo , "1");
        threadG t2 =new threadG(gp1 ,threadsdemo , "1");
        threadG t3 =new threadG(gp1 ,threadsdemo , "1");
        threadG t4 =new threadG(gp1 ,threadsdemo , "1");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(gp1.activeCount());
        gp1.destroy();
    }
    
}

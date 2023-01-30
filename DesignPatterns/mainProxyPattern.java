package DesignPatterns;

public class mainProxyPattern {
    
    public static void main(String args[]){
        ProxyVideo video = new ProxyVideo("demo.hd", new RealVedio("demo.hd"));
        video.Show();
        ProxyVideo video2=new ProxyVideo("Demo.hd", null);
        video.Show();
    }
}

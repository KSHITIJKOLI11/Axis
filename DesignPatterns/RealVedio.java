package DesignPatterns;

public class RealVedio implements Vedio {
    String videoAddress;

    RealVedio(String videoAddress){
        System.out.println(videoAddress);
    }

    @Override
    public void Show() {
        System.out.println("showing the video + " + videoAddress);
     
        
    }
    
}

package DesignPatterns;

public class ProxyVideo implements Video {
    String RealVideoAddress;
    RealVedio realVideo;

    ProxyVideo(String realVideoAddress, RealVedio realVedio){
        this.RealVideoAddress= realVideoAddress;
        this.realVideo=realVideo;
    }

    public void Show(){
        if(realVideo==null){
            realVideo=new RealVedio(RealVideoAddress);
        }

        realVideo.Show();

    }
    
}

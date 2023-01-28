package DesignPatterns;

public class bank {
 private static bank sBank=new bank();

 private bank(){

 }

 public void getStatus(int time){
    if(time > 9 && time < 18){
        System.out.println("Open");
    } else {
        System.out.println("Closed");
    }
 }
    static bank getObject(){
        return sBank;
    }
}
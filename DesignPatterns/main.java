package DesignPatterns;

public class main {

    public static void main(String args[]){
        // demo obj = new demo();
        // Circle circle = new Circle();
        // circle.drawShape();

        DecoratorFunctionality demo= new DecoratorFunctionality( new Circle());
        demo.BorderColor("Red", new Circle()); // If u want to add a additional functionality
        Circle c1=new Circle();  //This is how we usually call a class in main
        c1.drawShape();

        demo.BorderColor("Yellow", new Rectangle());
        Rectangle r1=new Rectangle();
        r1.drawShape();
        
        demo.Radius(4);
    }
    
}

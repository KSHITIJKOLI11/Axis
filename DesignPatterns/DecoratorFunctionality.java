package DesignPatterns;

public class DecoratorFunctionality extends DecoratorShape {

    DecoratorFunctionality(Shape obj) {
        super(obj);
        // BorderColor(colour, obj);
        //TODO Auto-generated constructor stub
    }
    
    public void BorderColor( String colour, Shape decoratorShape ){
        System.out.println(colour + "Border");
        decoratorShape.drawShape();
     
    }

    public void Radius(int radius){
        System.out.println("Drawing the Circle " + radius);
    }
}

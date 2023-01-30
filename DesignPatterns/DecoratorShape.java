package DesignPatterns;

public class DecoratorShape implements Shape {

    Shape decoratorShape;
    
    DecoratorShape(Shape obj){
        decoratorShape=obj;
    }

    @Override
    public void drawShape() {
        // TODO Auto-generated method stub
        
    }
    
}

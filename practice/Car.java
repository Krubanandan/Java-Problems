package practice;

public class Car implements Engine,Brake {

    @Override
    public void brake() {
        
        System.out.println("Brake");
    }

    @Override
    public void start() {
        
        System.out.println("Brake 1");
    }

    @Override
    public void stop() {
        
        System.out.println("Brake 2");
    }
    
}

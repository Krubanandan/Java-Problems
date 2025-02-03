package oops;

public class NewClass {
    public static void main(String[] args) {
        Inheritance H=new SubClass(20, "name", 20);
        H.name="Lruba";
        System.out.println(H.name);
        String s=H.name;
        System.out.println(s);

    }
    
}

package packages;

public class greeting {
    public static void main(String[] args) {
        // greet p = new person();
        // System.out.println(greet.H);
        // p.greetperson();
        // person q=new person();
        // q.greetperson();
        // System.out.println(greet.H);
        
        h();

    }
     static void h(){
        System.out.println("hello");
     }
}

class greet {
    static int H = 5;

    void greetperson() {
        System.out.println("Help");
        H++;
    }
}

class person extends greet {

    void greetperson() {
        System.out.println("Hi");
        H++;
    }
}
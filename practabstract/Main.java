package practabstract;

public class Main {

    class J {
        int add(int a, int b) {
            return (a + b);
        }
    }

    abstract static class H {
        abstract void Start();
    }

    static class I extends H {
        @Override
        void Start() {
            System.out.println("I starts");
        }
    }

    static class p {
        static int j = 0;

    }

    public static void main(String[] args) {
        // Animal A = new Dog();

        // Dog dog = (Dog) A;
        // dog.nameK();

        // // Main main=new Main();
        // I i = new I();
        // J j = new Main().new J();
        // System.out.println(j.add(1, 2));

        // Cars c=new Cars();
        // c.cal();
        // Bike d=(Bike) c;
        // d.H();

        int h = p.j;

    }
}

class Cars {
    void cal() {
        System.out.println(1 + 2);
    }
}

class Bike extends Cars {
    @Override
    void cal() {
        System.out.println(3 + 2);
    }

    void H() {
        System.out.println("hello");
    }
}

abstract class Animal {
    String name;

    public Animal() {
        this.name = "kruba";
    }

    abstract void printName();

}

class Dog extends Animal {
    @Override
    void printName() {
        System.out.println("The animal name is Dog");
    }

    void nameK() {
        System.out.println(super.name);
    }
}

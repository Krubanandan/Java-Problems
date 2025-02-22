package practabstract;

public class CheckAbs {
    public static void main(String[] args) {
        Animal A = new Dog();

        // Dog dog = (Dog) A;
        A.nameK();
    }
}


class Animal {
    String name;

    public Animal() {
        this.name = "kruba";
    }

    void printName(){
        System.out.println("Animal");
    }

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
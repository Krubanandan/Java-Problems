package oops;

class Inheritance {
    int data;
    String name;

    Inheritance(int data,String name){
        this.data=data;
        this.name=name;
    }
    
}

class SubClass extends Inheritance{
    int age;

    SubClass(int data, String name, int age){
        super(data, name);
        this.age=age;
    }
}

package Polimorfism;

public class Child extends Parent {
    private int age;

    public Child(int age) {
        super(1500);
        this.age = age;
    }
    public void countAge(){
        System.out.println("5 y.o");
    }
    public void earnMoney(){
        System.out.println("I'm child");
    }
}

package Polimorfism;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(1500);
        Child child = new Child(5);
        Parent par = new Child(5);


        test(parent);
        test(child);
        test(par); // позднее связывание

//        test();

    }
    public static void test(Parent parent){
        parent.earnMoney();
    }

}
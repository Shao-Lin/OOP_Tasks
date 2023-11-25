package Polimorfism;

public class Parent extends People {
    private double money;

    public Parent(double money) {
        this.money = money;
    }

    public void earnMoney(){
        System.out.println("-1000 my pretty dollars");
    }
}

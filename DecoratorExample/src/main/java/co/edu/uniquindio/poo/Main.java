package co.edu.uniquindio.poo;
public class Main {
    public static void main(String[] args) {
    Burger burger= new BasicBurger();
    System.out.println(burger.descripcion());
    burger= new Cheese(burger);
    System.out.println(burger.descripcion());
    burger= new FrenchFries(burger);
    System.out.println(burger.descripcion());
    }
}
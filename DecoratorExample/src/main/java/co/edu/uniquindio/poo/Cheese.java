package co.edu.uniquindio.poo;

public class Cheese extends BurgerDecorator {
    public Cheese(Burger burger) {
        super(burger);
    }
    @Override
    public String descripcion() {
        return "Burger with cheese";
    }
    @Override
    public double precio() {
        return 15000;
    }
}

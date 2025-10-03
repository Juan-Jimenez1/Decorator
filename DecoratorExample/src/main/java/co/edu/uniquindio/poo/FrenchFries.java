package co.edu.uniquindio.poo;

public class FrenchFries extends BurgerDecorator {

    public FrenchFries(Burger burger) {
        super(burger);
    }

    @Override
    public String descripcion() {
        return "Burger with French Fries";
    }
    @Override
    public double precio() {
        return 17000;
    }
}

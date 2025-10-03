package co.edu.uniquindio.poo;

public class BurgerDecorator implements Burger {
    private Burger burger;
    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String descripcion() {
        return burger.descripcion();
    }
    @Override
    public double precio() {
        return burger.precio();
    }

    @Override
    public String toString() {
        return "BurgerDecorator{" +
                "burger=" + burger.descripcion() +" "+"Price:"+ burger.precio() ;
    }
}

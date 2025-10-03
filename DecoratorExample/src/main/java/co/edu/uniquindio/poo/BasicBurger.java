package co.edu.uniquindio.poo;

public class BasicBurger implements Burger {
    @Override
    public String descripcion() {
        return "Basic Burger";
    }
    @Override
    public double precio() {
        return 12000;
    }

}

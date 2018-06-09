package back;

import java.util.HashMap;
import java.util.Map;

public class RedVelvet extends Producto {

    private final String name = "Red Velvet";
    private int cantidad;
    private final int precio = 4500;
    private final Map< String, Double> receta = new HashMap<>();

    public RedVelvet() {

        receta.put("Harina (g)", 78.125);
        receta.put("Cocoa(g)", 15.625);
        receta.put("Polvo para Hornear (mg)", 0.125);
        receta.put("Sal (mg)", 0.0625);
        receta.put("Mantequilla(g)", 31.25);
        receta.put("Azúcar(g)", 62.5);
        receta.put("Huevo (pieza)", 0.5);
        receta.put("Colorante(pizca)", 0.125);
        receta.put("Queso Crema(g)", 47.5);
        receta.put("Azúcar Glass(g)", 46.875);
        receta.put("Vainilla(mg)", 0.125);
        receta.put("Fresa(pieza)", 0.625);
        receta.put("Confitado Rojo(pizca)", 1);
    }

    @Override
    public int getPrecio() {
        return this.precio; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(); //To change body of generated methods, choose Tools | Templates.
        this.cantidad = cantidad;
    }

}

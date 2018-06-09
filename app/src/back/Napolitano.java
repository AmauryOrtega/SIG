package back;

import java.util.HashMap;
import java.util.Map;

public class Napolitano extends Producto {

    private final String name = "Napolitano";
    private int cantidad;
    private final int utilidad = 1750;
    private final Map< String, Double> receta = new HashMap<>();

    public Napolitano() {

        receta.put("Huevo(pieza)", 0.22);
        receta.put("Mantequilla(g)", 10.0);
        receta.put("Azucar(g)", 27.78);
        receta.put("Harina(g)", 41.67);
        receta.put("Polvo para Hornear(mg)", 0.22);
        receta.put("Leche(dl)", 0.1389);
        receta.put("Vainilla(mg)", 3330.0);
        receta.put("Chocolate amargo(g)", 13.89);
        receta.put("Queso Crema(g)", 42.22);
        receta.put("Mantequilla(g)", 5.0);
        receta.put("Fresa(g)", 1.67);
        receta.put("Azucar Glass(g)", 55.56);
        receta.put("Colorante(pizca)", 0.11);
    }

    @Override
    public int getUtilidad() {
        return this.utilidad; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public Map getReceta() {
        return receta; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(); //To change body of generated methods, choose Tools | Templates.
        this.cantidad = cantidad;
    }

}

package back;

import java.util.HashMap;
import java.util.Map;

public class ChocolateCereza extends Producto {

    private final String name = "Chocolate y Cereza";
    private int cantidad;
    private final int utilidad = 2800;
    private final Map< String, Double> receta = new HashMap<>();

    public ChocolateCereza() {

        receta.put("Harina(g)", 41.625);
        receta.put("Polvo para Hornear(mg)", 0.125);
        receta.put("Bicarbonato de Sodio(mg)", 0.0625);
        receta.put("Sal(pizca)", 0.125);
        receta.put("Cocoa(g)", 23.375);
        receta.put("Mantequilla(g)", 5.625);
        receta.put("Azucar(g)", 23.375);
        receta.put("Huevo(pieza)", 0.25);
        receta.put("Vainilla(mg)", 0.125);
        receta.put("Leche(dl)", 0.3125);
        receta.put("Crema para Batir(dl)", 0.3125);
        receta.put("Chocolate amargo(g)", 31.25);
        receta.put("Cerezas(g)", 31.25);
        receta.put("Cerezas(pieza)", 1.0);
        receta.put("Menta Fresca(pieza)", 1.0);
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

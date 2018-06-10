package back;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private Map< String, Double> listaInventario;
    private Map< String, Double> listaInventarioDefault;

    public Inventario() {

        listaInventario = new HashMap<>();
        listaInventarioDefault = new HashMap<>();

        listaInventario.put("Aceite Vegetal(dl)", 10.0);
        listaInventario.put("Azucar(g)", 5000.0);
        listaInventario.put("Azucar Glass(g)", 3000.0);
        listaInventario.put("Bicarbonato de Sodio(mg)", 10.0);
        listaInventario.put("Canela en Polvo(mg)", 10.0);
        listaInventario.put("Cerezas(g)", 1000.0);
        listaInventario.put("Chocolate amargo(g)", 1500.0);
        listaInventario.put("Cocoa(g)", 1000.0);
        listaInventario.put("Colorante(pizca)", 50.0);
        listaInventario.put("Confitado Rojo(pizca)", 100.0);
        listaInventario.put("Crema Acida(dl)", 10.0);
        listaInventario.put("Crema para Batir(dl)", 10.0);
        listaInventario.put("Fresa(pieza)", 100.0);
        listaInventario.put("Galleta Oreo(pieza)", 200.0);
        listaInventario.put("Harina(g)", 5000.0);
        listaInventario.put("Huevo(pieza)", 48.0);
        listaInventario.put("Leche(dl)", 12.0);
        listaInventario.put("Mantequilla(g)", 1500.0);
        listaInventario.put("Menta Fresca(pieza)", 100.0);
        listaInventario.put("Polvo para Hornear(mg)", 50.0);
        listaInventario.put("Queso Crema(g)", 5000.0);
        listaInventario.put("Sal(pizca)", 100.0);
        listaInventario.put("Vainilla(mg)", 100000.0);
        listaInventario.put("Zanahoria Finamente Rallada(g)", 3000.0);
        listaInventario.keySet().forEach((ingrediente) -> {
            listaInventarioDefault.put(ingrediente, listaInventario.get(ingrediente));
        });
    }

    public Map<String, Double> getListaInventario() {
        return listaInventario;
    }

    public void setListaInventario(Map<String, Double> listaInventario) {
        this.listaInventario = listaInventario;
    }

    public Map<String, Double> getListaInventarioDefault() {
        return listaInventarioDefault;
    }

    public void setListaInventarioDefault(Map<String, Double> listaInventarioDefault) {
        this.listaInventarioDefault = listaInventarioDefault;
    }

}

package modelo;

public class ZanahoriaPasas extends Producto {

    public ZanahoriaPasas() {
        super("Zanahoria con Pasas", 0, 2100);
        this.getReceta().put("Harina(g)", 20.833);
        this.getReceta().put("Azucar(g)", 41.667);
        this.getReceta().put("Zanahoria Finamente Rallada(g)", 62.500);
        this.getReceta().put("Polvo para Hornear(mg)", 0.083);
        this.getReceta().put("Bicarbonato de Sodio(mg)", 0.083);
        this.getReceta().put("Canela en Polvo(mg)", 0.083);
        this.getReceta().put("Aceite Vegetal(dl)", 2.5);
        this.getReceta().put("Huevo(pieza)", 0.333);
    }

}

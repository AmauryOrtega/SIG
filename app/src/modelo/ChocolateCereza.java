package modelo;

public class ChocolateCereza extends Producto {

    public ChocolateCereza() {

        super("Chocolate y Cereza", 0, 2800);
        this.getReceta().put("Harina(g)", 41.625);
        this.getReceta().put("Polvo para Hornear(mg)", 0.125);
        this.getReceta().put("Bicarbonato de Sodio(mg)", 0.0625);
        this.getReceta().put("Sal(pizca)", 0.125);
        this.getReceta().put("Cocoa(g)", 23.375);
        this.getReceta().put("Mantequilla(g)", 5.625);
        this.getReceta().put("Azucar(g)", 23.375);
        this.getReceta().put("Huevo(pieza)", 0.25);
        this.getReceta().put("Vainilla(mg)", 0.125);
        this.getReceta().put("Leche(dl)", 0.3125);
        this.getReceta().put("Crema para Batir(dl)", 0.3125);
        this.getReceta().put("Chocolate amargo(g)", 31.25);
        this.getReceta().put("Cerezas(g)", 31.25);
        this.getReceta().put("Menta Fresca(pieza)", 1.0);
    }

}

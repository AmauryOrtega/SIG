package modelo;

public class RedVelvet extends Producto {

    public RedVelvet() {
        super("Red Velvet", 0, 3150);
        this.getReceta().put("Harina(g)", 78.125);
        this.getReceta().put("Cocoa(g)", 15.625);
        this.getReceta().put("Polvo para Hornear(mg)", 0.125);
        this.getReceta().put("Sal(mg)", 0.0625);
        this.getReceta().put("Mantequilla(g)", 31.25);
        this.getReceta().put("Azucar(g)", 62.5);
        this.getReceta().put("Huevo(pieza)", 0.5);
        this.getReceta().put("Colorante(pizca)", 0.125);
        this.getReceta().put("Queso Crema(g)", 47.5);
        this.getReceta().put("Azucar Glass(g)", 46.875);
        this.getReceta().put("Vainilla(mg)", 0.125);
        this.getReceta().put("Fresa(pieza)", 0.625);
        this.getReceta().put("Confitado Rojo(pizca)", 1.0);
    }

}

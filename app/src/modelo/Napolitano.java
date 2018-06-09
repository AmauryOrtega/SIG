package modelo;

public class Napolitano extends Producto {

    public Napolitano() {
        
        super("Napolitano", 0, 1750);
        this.getReceta().put("Huevo(pieza)", 0.22);
        this.getReceta().put("Mantequilla(g)", 10.0);
        this.getReceta().put("Azucar(g)", 27.78);
        this.getReceta().put("Harina(g)", 41.67);
        this.getReceta().put("Polvo para Hornear(mg)", 0.22);
        this.getReceta().put("Leche(dl)", 0.1389);
        this.getReceta().put("Vainilla(mg)", 3330.0);
        this.getReceta().put("Chocolate amargo(g)", 13.89);
        this.getReceta().put("Queso Crema(g)", 42.22);
        this.getReceta().put("Mantequilla(g)", 5.0);
        this.getReceta().put("Fresa(g)", 1.67);
        this.getReceta().put("Azucar Glass(g)", 55.56);
        this.getReceta().put("Colorante(pizca)", 0.11);
    }

}

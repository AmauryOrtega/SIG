package app;

import com.databox.sdk.Databox;
import com.databox.sdk.KPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class MandarDatos {

    public static void mandar(int diaSimulado, ArrayList<Producto> listaProductos, Inventario inventario) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

        String TOKEN = "7v0mqes1z9c3me7gyzeubs";
        Databox databox = new Databox(TOKEN);
        List<KPI> kpis = new ArrayList<>();
        
        // Utilidad
        Double utilidadDia = 0.0;
        for (Producto producto : listaProductos){
            
        }
        kpis.add(new KPI().setKey("Utilidad").setValue(20000).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("COP"));
        // Cupcakes vendidos
        kpis.add(new KPI().setKey("Chocolate y Cereza").setValue(200).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
        kpis.add(new KPI().setKey("Napolitano").setValue(100).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
        kpis.add(new KPI().setKey("Oreo").setValue(10).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
        kpis.add(new KPI().setKey("Red Velvet").setValue(80).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
        kpis.add(new KPI().setKey("Zanahoria con Pasas").setValue(170).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
        // Ventas del dia
        kpis.add(new KPI().setKey("Ventas").setValue(170 + 80 + 10 + 100 + 200).setDate(sdf.parse("2018-06-01 00:00:00")));
        // Estado de inventario
        String[] ingredientes = {"Aceite Vegetal(dl)", "Azucar(g)", "Azucar Glass(g)", "Bicarbonato de Sodio(mg)", "Canela en Polvo(mg)", "Cerezas(g)", "Chocolate amargo(g)", "Cocoa(g)", "Colorante(pizca)", "Confitado Rojo(pizca)", "Crema Acida(dl)", "Crema para Batir(dl)", "Fresa(pieza)", "Galleta Oreo(pieza)", "Harina(g)", "Huevo(pieza)", "Leche(dl)", "Mantequilla(g)", "Menta Fresca(pieza)", "Polvo para Hornear(mg)", "Queso Crema(g)", "Sal(pizca)", "Vainilla(mg)", "Zanahoria Finamente Rallada(g)"};
        Random r = new Random();
        String ingrediente, unidad = "";
        for (int i = 0; i < 24; i++) {
            ingrediente = ingredientes[i].substring(0, ingredientes[i].indexOf("("));
            unidad = ingredientes[i].substring(ingredientes[i].indexOf("(") + 1, ingredientes[i].length() - 1);
            kpis.add(new KPI().setKey(ingrediente).setValue(r.nextInt(30) + 1).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit(unidad));
        }
        databox.push(kpis);
        StringBuffer lastPushes = databox.lastPushes(1);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(lastPushes.toString());
        System.out.println(gson.toJson(je));
    }

    public static void mandaUtilidad() {

        String TOKEN = "7v0mqes1z9c3me7gyzeubs";

        // Conexion databox
        Databox databox = new Databox(TOKEN);
        try {
            List<KPI> kpis = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            // DIA 1
            // Utilidad
            kpis.add(new KPI().setKey("Utilidad").setValue(20000).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("COP"));
            // Cupcakes vendidos
            kpis.add(new KPI().setKey("Chocolate y Cereza").setValue(200).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
            kpis.add(new KPI().setKey("Napolitano").setValue(100).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
            kpis.add(new KPI().setKey("Oreo").setValue(10).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
            kpis.add(new KPI().setKey("Red Velvet").setValue(80).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
            kpis.add(new KPI().setKey("Zanahoria con Pasas").setValue(170).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
            // Ventas del dia
            kpis.add(new KPI().setKey("Ventas").setValue(170 + 80 + 10 + 100 + 200).setDate(sdf.parse("2018-06-01 00:00:00")));
            // Estado de inventario
            String[] ingredientes = {"Aceite Vegetal(dl)", "Azucar(g)", "Azucar Glass(g)", "Bicarbonato de Sodio(mg)", "Canela en Polvo(mg)", "Cerezas(g)", "Chocolate amargo(g)", "Cocoa(g)", "Colorante(pizca)", "Confitado Rojo(pizca)", "Crema Acida(dl)", "Crema para Batir(dl)", "Fresa(pieza)", "Galleta Oreo(pieza)", "Harina(g)", "Huevo(pieza)", "Leche(dl)", "Mantequilla(g)", "Menta Fresca(pieza)", "Polvo para Hornear(mg)", "Queso Crema(g)", "Sal(pizca)", "Vainilla(mg)", "Zanahoria Finamente Rallada(g)"};
            Random r = new Random();
            String ingrediente, unidad = "";
            for (int i = 0; i < 24; i++) {
                ingrediente = ingredientes[i].substring(0, ingredientes[i].indexOf("("));
                unidad = ingredientes[i].substring(ingredientes[i].indexOf("(") + 1, ingredientes[i].length() - 1);
                kpis.add(new KPI().setKey(ingrediente).setValue(r.nextInt(30) + 1).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit(unidad));
            }
            databox.push(kpis);
            StringBuffer lastPushes = databox.lastPushes(1);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonParser jp = new JsonParser();
            JsonElement je = jp.parse(lastPushes.toString());
            System.out.println(gson.toJson(je));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}

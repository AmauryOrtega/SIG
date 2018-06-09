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

import back.Inventario;
import modelo.Producto;

public class MandarDatos {

    public static void mandar(int diaSimulado, ArrayList<Producto> listaProductos, Inventario inventario) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

        String TOKEN = "7v0mqes1z9c3me7gyzeubs";
        Databox databox = new Databox(TOKEN);
        List<KPI> kpis = new ArrayList<>();

        // Calculos
        Double utilidadDia = 0.0;
        for (Producto producto : listaProductos) {
            // Cantidad de ventas de producto
            kpis.add(new KPI()
                    .setKey(producto.getName())
                    .setValue(producto.getCantidad())
                    .setDate(sdf.parse("2018-06-" + diaSimulado + " 00:00:00")).
                    setUnit("Cupcake")
            );
            // Utilidad de producto
            kpis.add(new KPI()
                    .setKey(producto.getName() + "_Utilidad")
                    .setValue(producto.getUtilidad() * producto.getCantidad())
                    .setDate(sdf.parse("2018-06-" + diaSimulado + " 00:00:00")).
                    setUnit("COP")
            );
            // Sumando para utilidadDia
            utilidadDia += producto.getCantidad() * producto.getUtilidad();
        }
        // Utilidad del dia
        kpis.add(new KPI()
                .setKey("Utilidad")
                .setValue(utilidadDia)
                .setDate(sdf.parse("2018-06-01 00:00:00"))
                .setUnit("COP")
        );

        // Estado de inventario
        String nombreIngrediente, unidad = "";
        for (String ingrediente : inventario.getListaInventario().keySet()) {
            nombreIngrediente = ingrediente.substring(0, ingrediente.indexOf("("));
            unidad = ingrediente.substring(ingrediente.indexOf("(") + 1, ingrediente.length() - 1);
            // Estado de cada inventario con su unidad
            kpis.add(new KPI()
                    .setKey(nombreIngrediente)
                    .setValue(inventario.getListaInventario().get(ingrediente))
                    .setDate(sdf.parse("2018-06-" + diaSimulado + " 00:00:00"))
                    .setUnit(unidad)
            );
        }
        databox.push(kpis);
        StringBuffer lastPushes = databox.lastPushes(1);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(lastPushes.toString());
        System.out.println(gson.toJson(je));
    }

}

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

public class MandarDatos {

    public static void mandaUtilidad() {

        String TOKEN = "7v0mqes1z9c3me7gyzeubs";

        // Conexion databox
        Databox databox = new Databox(TOKEN);
        try {
            List<KPI> kpis = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            // DIA 1
            kpis.add(new KPI().setKey("utilidad").setValue(20000).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("COP"));
            kpis.add(new KPI().setKey("oreo").setValue(200).setDate(sdf.parse("2018-06-01 00:00:00")).setUnit("Cupcakes"));
            
            // DIA 2
            kpis.add(new KPI().setKey("utilidad").setValue(50000).setDate(sdf.parse("2018-06-02 00:00:00")).setUnit("COP"));
            kpis.add(new KPI().setKey("utilidad").setValue(0).setDate(sdf.parse("2018-06-03 00:00:00")).setUnit("COP"));
            kpis.add(new KPI().setKey("utilidad").setValue(10000).setDate(sdf.parse("2018-06-04 00:00:00")).setUnit("COP"));
            kpis.add(new KPI().setKey("utilidad").setValue(1000).setDate(sdf.parse("2018-06-05 00:00:00")).setUnit("COP"));
//            databox.push(kpis);

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

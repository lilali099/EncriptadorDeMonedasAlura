
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;



public class GeneradorDeArchivo {
    public void guardarJson (Moneda moneda) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter teclado = new FileWriter(moneda.result()+ ".json");
        teclado.write(gson.toJson(moneda));
        teclado.close();
        }
    }


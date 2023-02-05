package tabla;

import conversor.Conversor;
import conversor.Fahrenheit;
import conversor.Reaumur;

import java.util.ArrayList;
import java.util.List;

public class TablaConversion {
    private List<Conversor> conversores = new ArrayList<>();

    public void addConversor(Conversor nuevoConversor) {
        conversores.add(nuevoConversor);
    }

    public String escribeTabla() {
        StringBuilder sb = new StringBuilder();
        sb.append("Celsius" + " ");
        sb.append("Reaumur" + " ");
        sb.append("Fahrenheit" + " ");
        sb.append("\n");
        for (int celsius = 0; celsius <= 100; celsius += 5) {
            sb.append(celsius + ", ");
            for(Conversor conversor: conversores) {
                sb.append(conversor.convierte(celsius) + ", ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

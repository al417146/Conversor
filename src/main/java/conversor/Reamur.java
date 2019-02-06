package conversor;

public class Reamur implements Conversor {
    @Override
    public double convierte(double celsius) {
        return 4.0/5.0 * celsius;
    }
}

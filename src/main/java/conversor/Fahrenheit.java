package conversor;

public class Fahrenheit implements Conversor {
    @Override
    public double convierte(double celsius) {
        return 9.0/5.0 * celsius + 32.0;
    }
}

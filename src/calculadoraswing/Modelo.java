package calculadoraswing;

public class Modelo {

    private double resultado = 0;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double sumar(double operador) {
        return resultado += operador;

    }

    public double restar(double operador) {
        return resultado -= operador;
    }

    public double multiplicar(double operador) {
        return resultado *= operador;
    }

    public double dividir(double operador) {
        return resultado /= operador;
    }
}

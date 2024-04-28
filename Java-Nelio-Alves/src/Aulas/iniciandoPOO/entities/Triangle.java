package Aulas.iniciandoPOO.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double areaDoTriangulo() {
        double calcularArea = (a + b + c) / 2;
        double resultado = Math.sqrt(calcularArea * (calcularArea - a) * (calcularArea - b) * (calcularArea - c));
        return resultado;
    }
}

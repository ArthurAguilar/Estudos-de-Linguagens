package Exercícios.Escola.entities;

public class Notas {
    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;

    public String calcularNotas() {
        double notaFinal = primeiraNota + segundaNota + terceiraNota;
        if (notaFinal >= 60 ) {
            return String.format("Nota final: %.2f\nPASS", notaFinal);
        } else {
            double pontosFaltantes = 60 - notaFinal;
            return String.format("Nota final: %.2f\nFAILED\nMissing %.2f pontos.", notaFinal, pontosFaltantes);
        }
    }
}

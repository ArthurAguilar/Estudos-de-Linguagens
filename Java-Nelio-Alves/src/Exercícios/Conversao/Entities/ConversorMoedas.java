package Conversao.Entities;

public class ConversorMoedas {

    public static double IOF = 1.06;

    public static double conversor(double precoDolar, double quantidade) {
        return (precoDolar * quantidade) * IOF;
    };

}

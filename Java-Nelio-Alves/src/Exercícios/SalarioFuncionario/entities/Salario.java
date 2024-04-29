package Exercícios.SalarioFuncionario.entities;

public class Salario {

    public String nome;
    public double salarioBruto;
    public double taxa;

    public String salarioLiquido() {
        double resultado = salarioBruto - taxa;
        return String.format("Empregado: %s -- R$%.2f", nome, resultado);
    };

    public String salarioAcrescido(double porcentagem) {
        double aumento = salarioBruto * (porcentagem / 100);
        salarioBruto = (salarioBruto - taxa) + aumento;
        return String.format("Dados atualizados: %s, R$%.2f", nome, salarioBruto);
    };
}

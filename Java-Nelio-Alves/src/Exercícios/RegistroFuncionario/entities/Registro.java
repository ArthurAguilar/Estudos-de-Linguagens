package RegistroFuncionario.entities;

import java.util.List;

public class Registro {
    Integer id;
    String nome;
    float salario;

    public Registro (Integer id, String nome, float salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float novoSalario) {
        this.salario = novoSalario;
    }

    public void setAumentoSalarial(float porcentagemDoAumento) {
        salario += (salario * porcentagemDoAumento) / 100;
    }

    public static boolean temId (List<Registro> lista, int id) {
        Registro funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }

    public String toString() {
        return String.format("Id: %d, Nome: %s, Salário: %.2f", id, nome, salario);
    }   
}

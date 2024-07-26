package RegistroFuncionarios.entities;

import java.util.List;

public class Registro {
    private Integer id;
    private String nome;
    private float salario;

    public Registro(Integer id, String nome, float salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return this.id;
    }

    public void setId(Integer newId) {
        this.id = newId;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float newSalario) {
        this.salario = newSalario;
    }

    public void aumentarSalario(float porcentagem) {
        salario += (salario * porcentagem) / 100;
    }

    public String toString() {
        return String.format("ID: %d, Nome: %s, Salário: %.2f", id, nome, salario);
    }  
    
    public static boolean hasId(List<Registro> lista, int id ) {
    Registro funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    return funcionario != null;
    }
}

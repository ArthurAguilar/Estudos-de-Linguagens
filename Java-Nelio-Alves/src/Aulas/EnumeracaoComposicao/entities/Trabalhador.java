package Aulas.EnumeracaoComposicao.entities;

import java.util.ArrayList;
import java.util.List;

import Aulas.EnumeracaoComposicao.entities.enums.NivelTrabalhador;

public class Trabalhador {

    private String nome;
    private NivelTrabalhador nivel;
    private double salarioBase;

    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void adicionarContrato(HoraContrato contrato) {
        contratos.add(contrato);
    }
    
    public void removerContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }

    public double getRendaMensal(int mes, int ano) {
        double soma = salarioBase;

        for (HoraContrato cadaContrato : contratos) {
            int mesContrato = cadaContrato.getData().getMonthValue();
            int anoContrato = cadaContrato.getData().getYear();

            if (mes == mesContrato && ano == anoContrato) {
                soma += cadaContrato.valorTotal();
            }
        }
        return soma;
    }
    
}

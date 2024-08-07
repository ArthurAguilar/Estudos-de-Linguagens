package Aulas.Composicao.entities;

import java.time.LocalDate;

public class HoraContrato {

    private LocalDate data;
    private double valorHora;
    private Integer horaTrabalhada;
    
    public HoraContrato() {
    }
    
    public HoraContrato(LocalDate data, double valorHora, Integer horaTrabalhada) {
        this.data = data;
        this.valorHora = valorHora;
        this.horaTrabalhada = horaTrabalhada;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(Integer horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public double valorTotal() {
        return valorHora * horaTrabalhada;
    }

}

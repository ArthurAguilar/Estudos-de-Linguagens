package ArraysVetores.ExerciciosDeFixacao.Aprovados.Entities;

public class Boletim {

    private String nome;
    private float primeiraNota;
    private float segundaNota;
    private float mediaAnual;

    public Boletim(String nome, float primeiraNota, float segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(float primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public float getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(float segundaNota) {
        this.segundaNota = segundaNota;
    }

    public float getMediaAnual() {
        mediaAnual = (this.primeiraNota + this.segundaNota) / 2;
        return mediaAnual;
    }


}

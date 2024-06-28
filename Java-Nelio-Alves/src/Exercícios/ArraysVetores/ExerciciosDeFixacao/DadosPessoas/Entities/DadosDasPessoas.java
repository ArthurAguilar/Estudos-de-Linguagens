package ArraysVetores.ExerciciosDeFixacao.DadosPessoas.Entities;

public class DadosDasPessoas {
    private float altura;
    private char genero;

    public DadosDasPessoas(float altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }   
}

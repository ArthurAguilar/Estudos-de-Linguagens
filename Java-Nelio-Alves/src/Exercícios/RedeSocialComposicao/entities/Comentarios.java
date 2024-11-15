package RedeSocialComposicao.entities;

public class Comentarios {
    public String textoComentario;

    public Comentarios (){};

    public Comentarios (String texto) {
        this.textoComentario = texto;
    }

    public String getTextoComentario() {
        return textoComentario;
    }

    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }

    @Override
    public String toString() {
        return  textoComentario;
    }    
}



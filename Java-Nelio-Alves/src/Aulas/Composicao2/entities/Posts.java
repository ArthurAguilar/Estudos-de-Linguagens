package Aulas.Composicao2.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Posts {

    
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentarios> comentarios = new ArrayList<>();

    public Posts() {}

    public Posts(LocalDateTime momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComentarios (Comentarios texto) {
        comentarios.add(texto);
    }
    
    public void removeComentarios (Comentarios texto) {
        comentarios.remove(texto);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n%d Likes - %s%n%s%nComentários:%n",    
                                titulo, 
                                likes, 
                                momento.format(fmt), 
                                conteudo));

        for (Comentarios cadaComentario : comentarios) {
            sb.append(String.format("-----%s%n", 
                                    cadaComentario.getTexto()));
        }

        return sb.toString();
    }

    
}

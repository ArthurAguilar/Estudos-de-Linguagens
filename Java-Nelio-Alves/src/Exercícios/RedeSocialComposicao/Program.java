package RedeSocialComposicao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import RedeSocialComposicao.entities.Comentarios;
import RedeSocialComposicao.entities.Posts;

public class Program {
    public static void main(String[] args) {

        // Criando Posts

        // Hora
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime hr1 = LocalDateTime.parse("21/06/2018 13:05:44", fmt);
        LocalDateTime hr2 = LocalDateTime.parse("28/07/2018 23:14:19", fmt);

        // Título
        String titulo1 = "Viajando à Nova Zelândia!";
        String titulo2 = "Boa noite, pessoal!";

        // Conteúdo
        String conteudo1 = "Estou indo visitar esse lindo país!";
        String conteudo2 = "Vejo vocês amanhã!";

        // Likes
        Integer likes1 = 12;
        Integer likes2 = 5;

        // Comentários;
        Comentarios comentario1 = new Comentarios("Tenha uma boa viagem!");
        Comentarios comentario2 = new Comentarios("Wow! Isso é incrível!");
        Comentarios comentario3 = new Comentarios("Boa noite!");
        Comentarios comentario4 = new Comentarios("Que a força esteja com você!");

        // Criando Posts
        Posts post1 = new Posts(hr1, titulo1, conteudo1, likes1);
        Posts post2 = new Posts(hr2, titulo2, conteudo2, likes2);

        post1.addComentarios(comentario1);
        post1.addComentarios(comentario2);
        post2.addComentarios(comentario3);
        post2.addComentarios(comentario4);

        // Imprimindo os Posts
        System.out.println(post1);
        System.out.println(post2);
    }
}

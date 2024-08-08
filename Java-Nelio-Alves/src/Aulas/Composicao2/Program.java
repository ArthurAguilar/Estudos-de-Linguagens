package Aulas.Composicao2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Aulas.Composicao2.entities.Comentarios;
import Aulas.Composicao2.entities.Posts;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime hr1 = LocalDateTime.parse("21/06/2018 13:05:44", fmt);
        LocalDateTime hr2 = LocalDateTime.parse("28/08/2018 23:14:19", fmt);
        
        Comentarios c1 = new Comentarios("Tenha uma boa viagem!");
        Comentarios c2 = new Comentarios("Uaal.. isso é incrível!");
        Comentarios c3 = new Comentarios("Boa noite!");
        Comentarios c4 = new Comentarios("Que a força esteja com você!");

        Posts post1 = new Posts(hr1, "Viajando à Nova Zelândia","Estou indo visitar este lindo país!", 12);
        Posts post2 = new Posts(hr2, "Boa noite, pessoal!", "Vejo vocês amanhã!", 5);

        post1.addComentarios(c1);
        post1.addComentarios(c2);

        post2.addComentarios(c3);        
        post2.addComentarios(c4);  

        System.out.println(post1);
        System.out.println();
        System.out.println(post2);
    }
}

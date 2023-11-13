package org.example;

import entities.*;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("************Criando um usuário************\n");
        Usuario usuario1 = new Usuario("jose45@gail.com","123456");
        System.out.println(usuario1.toString());

        System.out.println("************Criando perfil************\n");
        usuario1.setPerfil(new Perfil("Rua aleluia, 175","94555-6644", Sexo.MASCULINO,"04/04/2004"));
        System.out.println(usuario1.getPerfil());

        System.out.println("\n************Criando postagem Comum************\n");
        Postagem postagem1 = new Postagem("Primeiro Post","Minha primeira postagem na rede social Y", "imagem");
        List<Postagem>postagens = new ArrayList<>();
        postagens.add(postagem1);
        usuario1.setPostagens(postagens);
        System.out.println(usuario1.getPostagens());

        System.out.println("\n************Alterando o tipo de conta para premium************\n");
        usuario1.alteraTipoDeConta();
        System.out.println(usuario1.getTipoDeConta());

        System.out.println("\n************Criando postagem premium************\n");
        Usuario usuario2 = new Usuario("sergio45@gail.com","123456");
        List<Usuario>marcacao = new ArrayList<>();
        marcacao.add(usuario2);
        Postagem postagem2 = new PostagemPremium("Segundo Post","Minha segunda Postagem","Imagem","video",marcacao);
        postagens.add(postagem2);
        usuario1.setPostagens(postagens);
        System.out.println(usuario1.getPostagens());

        System.out.println("Adicionando Comentarios");
        List<Comentarios> comentarios = new ArrayList<>();
        Comentarios comentario1 = new Comentarios(usuario2,"13/11/2023","Comentário realizado");
        comentarios.add(comentario1);
        postagem1.setComentarios(comentarios);
        System.out.println(postagem1.getComentarios());

    }
}
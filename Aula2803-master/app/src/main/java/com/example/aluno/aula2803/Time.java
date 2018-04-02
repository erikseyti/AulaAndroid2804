package com.example.aluno.aula2803;

/**
 * Created by aluno on 28/03/18.
 */

public class Time {
    private long id;
    private String nome;
    private String cidade;
    // esta o valor inteiro pq o objeto drawable puxa uma instancia do elemento R que busca o valor dentro do listview que aparece como inteiro o valor
    // valor apenas para exibição (normalmente a imagem estará ou na galeria do celular ou no bdd da aplicação)
    private int imagem;

    public Time(long id, String nome, String cidade,
                int imagem) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.imagem = imagem;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

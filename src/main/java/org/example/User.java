package org.example;

public class User {

    private String nome;

    private Integer agencia;

    public User() {
    }

    public User(String nome, Integer agencia) {
        this.nome = nome;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
}

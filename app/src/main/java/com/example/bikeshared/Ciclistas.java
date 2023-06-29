package com.example.bikeshared;

public class Ciclistas {
    private int id_utente;
    private String nome;
    private String palavra_chave;
    private String email;
    private int saldo;

    public Ciclistas(int id_utente, String nome, String palavra_chave, String email, int saldo) {
        this.id_utente = id_utente;
        this.nome = nome;
        this.palavra_chave = palavra_chave;
        this.email = email;
        this.saldo = saldo;
    }

    public int getId_utente() {
        return id_utente;
    }

    public void setId_utente(int id_utente) {
        this.id_utente = id_utente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPalavra_chave() {
        return palavra_chave;
    }

    public void setPalavra_chave(String palavra_chave) {
        this.palavra_chave = palavra_chave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

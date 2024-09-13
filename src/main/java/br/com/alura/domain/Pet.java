package br.com.alura.domain;

public class Pet {
    public Pet() {
    }

    private String tipo;
    private int idade;
    private String nome;
    private String raca;
    private float peso;
    private long id;
    public Pet(String tipo, int idade, String nome, String raca, int idade1, float peso) {
        this.tipo = tipo;
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public long getId() {
        return id;
    }
}

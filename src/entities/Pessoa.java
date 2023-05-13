package entities;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Endereço endereço;

    public Pessoa(String nome, int idade, char sexo, Endereço endereço) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereço = endereço;
    }
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Pessoa 1: " +
                "\nNome: " + nome +
                "\nIdade :" + idade +
                "\nSexo: " + sexo +
                "\nEndereço: " + endereço;
    }
}

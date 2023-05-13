package program;

import entities.Endereço;
import entities.Pessoa;

public class Main {
    public static void main(String[] args) {
        //Eu já fiz os outros 5 códigos usando o Scanner. Desta vez vou iniciar eu mesmo, estou programando a mais de 5 horas.
        //Mas já está provado que tem como fazer com scanner, o exercício 5 é quase a mesma coisa. Nele eu usei scanner.

        //Vou adicionar a pessoa primeiramente, mas sem o endereço, logo que na ordem deveria ser pessoa primeiro.
        Pessoa pessoa1 = new Pessoa("Arthur", 20, 'M');
        Endereço endereço1 = new Endereço("Não sei o que é logradouro...", "Atrás da praça", 2001, "91240-261");

        //Agora vou adicionar o endereço na pessoa 1.
        pessoa1.setEndereço(endereço1);

        //Vamos printar pessoa, com sorte (E 2 toString) vem o endereço junto.
        System.out.println(pessoa1);

        //Bem, agora vamos criar uma segunda pessoa, e imprimir eles usado os get.
        Pessoa pessoa2 = new Pessoa("Marina", 18,'F');
        //Mesma coisa, acho mt estranho criar o endereço antes...
        Endereço endereço2 = new Endereço("É sério que logradouro é RUA?... Rua Andrade Neves", "13º Andar", 696969, "90010-210");

        pessoa2.setEndereço(endereço2);

        //Vamos printar com getters. Antes dar um espaço.
        System.out.println("\n--------------\n");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Sexo: " + pessoa2.getSexo());
        System.out.println("Endereço: " + pessoa2.getEndereço().getLogradouro() + ", " +
                pessoa2.getEndereço().getComplemento() + ", " +
                "Número: " + pessoa2.getEndereço().getNumero() + ", " +
                "CEP: " + pessoa2.getEndereço().getCep() + ".");

    }
}
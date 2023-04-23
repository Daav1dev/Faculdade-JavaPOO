package Aula0;
public class Pessoa {
    String nome;
    int idade;
    int RG;
    char sexo;

    public int fazAniversario() {
        idade = idade +1;
        return idade;

    }
    public void mostraInfo() {
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " +idade);
        System.out.println("RG: " +RG);
        System.out.println("Sexo: "+ sexo);

    }
}
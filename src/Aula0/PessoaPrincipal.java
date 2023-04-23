package Aula0;

import java.util.Scanner;

public class PessoaPrincipal {
    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);

        Pessoa p = new Pessoa();
        p.mostraInfo();

        System.out.println("Qual o seu nome ?");
        p.nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        p.idade = entrada.nextInt();

        System.out.println("Qual a sua indentidade?");
        p.RG = entrada.nextInt();

        System.out.println("Qual o seu sexo?");
        p.sexo = entrada.next().charAt(0);

        System.out.println("*******");
        p.mostraInfo();

    }
}
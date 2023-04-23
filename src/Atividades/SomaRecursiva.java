package Atividades;

import java.util.*;

public class SomaRecursiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor A ");
        int a = entrada.nextInt();
        System.out.println("Digite um valor B");
        int b = entrada.nextInt();

        int soma;
        if(a>b) {
            soma = somarecursiva(b, a);
        }else{
            soma = somarecursiva(a,b);

        }
        System.out.println("A soma dos números entre "+a+ " e "+b+" é "+soma);
    }

    public static int somarecursiva(int a, int b) {
        if(a>b) {
            return 0;
        }else{
            return a + somarecursiva(a+1,b);
        }
    }
}






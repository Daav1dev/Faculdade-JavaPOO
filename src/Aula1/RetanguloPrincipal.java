package Aula1;

import java.util.Scanner;
public class RetanguloPrincipal {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu comprimento?");
        float c = entrada.nextFloat();
        System.out.println("Qual a sua altura?");
        float b = entrada.nextFloat();

        while(c<0 ||b<0){
            System.out.println("Digite um valor válido!");
            System.out.println("Qual o comprimento?");
            c = entrada.nextFloat();

            System.out.println("Qual a altura?");
            b = entrada.nextFloat();
        }
        Retangulo r = new Retangulo();
        r.comprimento = c;
        r.largura = b;
        System.out.println("Perimetro="+r.perimetro());

    }
}





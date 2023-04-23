package Atividades;

import java.util.Scanner;

public class Fatorial {

    static int fatorial(int f) {
        if (f > 0)
            return f * fatorial(f - 1);
        else
            return 1;
    }

    static int Fibonacci(int n) {
        if (n < 2)
            return 1;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n;
        int resultado = 1;
        int resfib;
        int fib;
        System.out.println("Digite um numero ");
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        resultado = fatorial(n);
        System.out.println("O resultado do fatorial de " + n + " é igual a " + resultado);
        fib = ler.nextInt();
        resfib = Fibonacci(fib);
        System.out.println("O termo " + fib + " da série de Fibonacci");

    }
}
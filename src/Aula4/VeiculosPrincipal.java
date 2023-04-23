package Aula4;

public class VeiculosPrincipal {
    public static void main(String[] args) {

    Veiculos v1 = new Veiculos("Volks","Fox","branco", 5,0);
    Veiculos v2 = new Veiculos("GM","Spin","Azul", 7,0);

        System.out.println("Marca do veículo 1: " + v1.getMarca());
        System.out.println("Modelo do veículo 1: " + v1.getModelo());
        System.out.println("Cor do veículo 1: " + v1.getCor());
        System.out.println("Número de passageiros do veículo 1: " + v1.getNumPass());
        System.out.println("Quantidade de litros do veículo 1: " + v1.getQntLitros());

        System.out.println("Marca do veículo 2: " + v2.getMarca());
        System.out.println("Modelo do veículo 2: " + v2.getModelo());
        System.out.println("Cor do veículo 2: " + v2.getCor());
        System.out.println("Número de passageiros do veículo 2: " + v2.getNumPass());
        System.out.println("Quantidade de litros do veículo 2: " + v2.getQntLitros());

    }
    }


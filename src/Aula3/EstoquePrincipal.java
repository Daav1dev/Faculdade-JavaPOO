package Aula3;

public class EstoquePrincipal {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Impressora Jato de tinta",13, 6);
        Estoque estoque2= new Estoque("Monitor LCD 17 polegadas",11,13);
        Estoque estoque3= new Estoque("Mouse Optico",6,2);

        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);
a
        System.out.println("Precisa repor estoque 1: "+estoque1.precisaRepor());
        System.out.println("Precisa repor estoque 2: "+estoque2.precisaRepor());
        System.out.println("Precisa repor estoque 3: "+estoque2.precisaRepor());

        System.out.println("Estoque 1: "+estoque1.mostra());
        System.out.println("Estoque 2: "+estoque2.mostra());
        System.out.println("Estoque 3: "+estoque3.mostra());

        Estoque estoque4 = new Estoque();
        estoque4.mudarNome("Pincel");

        estoque4.qtdAtual = 30;
        estoque4.qtdMinima = 15;

    }
}

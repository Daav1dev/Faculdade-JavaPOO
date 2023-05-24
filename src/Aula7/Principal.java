package Aula7;

public class Principal{
        public static void main(String[] args) {
            DiasDaSemana diaAtual = DiasDaSemana.SEGUNDA;
            switch (diaAtual){
                case SEGUNDA:
                    System.out.println(diaAtual.getAbreviacao());
                    break;
                case TERCA:
                    System.out.println(diaAtual.getAbreviacao());
                    break;
                default:
                    System.out.println("Outro dia da semana");
            }
            String dia = "Qua";
            if(dia.equals(diaAtual.getAbreviacao()))
                System.out.println("Os valores são iguais");
            else
                System.out.println("Os valores são diferentes");
        }
}

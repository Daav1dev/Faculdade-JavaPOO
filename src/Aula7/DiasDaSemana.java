package Aula7;
// aprendendo enum
public enum DiasDaSemana {
    SEGUNDA("Seg"),
    TERCA("Ter"),
    QUARTA("Qua"),
    QUINTA("Qui"),
    SEXTA("Sex"),
    SABADO("Sab"),
    DOMINGO("Dom");

    private String abreviacao;

    DiasDaSemana(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

}

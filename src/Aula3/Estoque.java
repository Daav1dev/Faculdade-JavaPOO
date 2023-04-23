package Aula3;

public class Estoque {
    String nome;
    int qtdAtual, qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public void mudarQtdMinima(int qtdMinima) {
    }

    public void repor(int qtd) {
        this.qtdAtual = this.qtdAtual + qtd;
    }

    public void darBaixa(int qtd) {
        if ((this.qtdAtual - qtd) >= 0) {
            this.qtdAtual = this.qtdAtual - qtd;
        } else {
            System.out.println("Não é possivel dar baixa na quantidade atual");
            System.out.println("Quantidade superior a quantidade atual");
        }
    }

    public String mostra() {
        String msg = "Nome do produto:" + nome + "; Quantidade minima:" + qtdMinima + ";Quantidade atual:" + qtdAtual;
        return msg;
    }

    public boolean precisaRepor() {
        if (qtdAtual <= qtdMinima) {
            return false;
        }
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getnome() {
        return this.nome;
    }
    public void setQtdAtual(int qtdAtual){
        this.qtdAtual = qtdAtual;
    }
    public int getQtdAtual() {
        return this.qtdAtual;
    }
}


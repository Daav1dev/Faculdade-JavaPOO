package Aula4;
public class Veiculos {
    private String marca, modelo, cor;
    private int numPass, qntLitros;
    public Veiculos(String marca, String modelo, String cor,
                    int numPass, int qntLitros) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.numPass = numPass;
        this.qntLitros = qntLitros;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumPass() {
        return numPass;
    }
    public void setNumPass(int numPass) {

    }
    public int getQntLitros() {
        return qntLitros;
    }
    public void setQntLitros(int qntLitros) {

    }
}
//APRENDENDO ENCAPSULAMENTO
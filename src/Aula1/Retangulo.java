package Aula1;

public class  Retangulo {
    float comprimento, largura;

    public float perimetro(){
        float perimentro = 2*comprimento+2*largura;
        return perimentro;
    }
    public float area(){
        float area = comprimento*largura;
        return area;
    }
}
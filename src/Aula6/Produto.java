package Aula6;

public class Produto {
    private String nomeloja,descricao;
    private float preco;

    public Produto(String nomeloja, String descricao, float preco){
        this.nomeloja = nomeloja;
        this.descricao = descricao;
        this.preco = preco;
    }
    public Produto(String descricao){
        super();
        this.descricao = descricao;
    }
    public Produto(){
        super();
    }
    public String getNomeloja(){return nomeloja;}
    public void setNomeloja(String nomeloja){this.nomeloja = nomeloja;}

    public float getPreco(){return preco;}
    public void setPreco(float preco){this.preco = preco;}

    public String getDescricao(){return descricao;}
}

package Aula6;

public class Mouse extends Produto{
    private String tipo;

    public Mouse(String tipo,String descricao){
        super(descricao);
        this.tipo = tipo;
    }
@Override
    public String getDescricao(){return super.getDescricao()+";tipo" +tipo;}
}


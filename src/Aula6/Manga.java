package Aula6;

public class Manga extends Produto{
    private String manga;

    public Manga(String descricao, String manga){
        super(descricao);
        this.manga = manga;
    }
    @Override
    public String getDescricao(){return super.getDescricao()+";manga:"+manga;}
}

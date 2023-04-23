package Aula5;

public class AssistenteTecnico extends Assistente{
    double bonus;

    public AssistenteTecnico(int maitricula, double bonus){
        super(maitricula);
        this.bonus = bonus;
    }
    @Override
    public double ganhoAnual(){
        return super.ganhoAnual()+(bonus*13);
    }
}

package Aula5;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(int matricula){
        super();
        this.matricula = matricula;
    }
    public int getMatricula(){return matricula;}
    public void setMatricula(int matricula){this.matricula = matricula;}

    @Override
        public void exibeDados(){
            super.exibeDados();
        System.out.println("Matricula:" + matricula);
    }
}

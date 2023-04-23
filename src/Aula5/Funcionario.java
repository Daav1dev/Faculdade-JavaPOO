package Aula5;
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){}
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(String nome){
        super();
        this.nome = nome;
    }
    public double addAumento(double valor){
        salario = salario + valor;
        return salario;
    }
    public double ganhoAnual(){
        return salario*13;
    }
    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getSalario(){return salario;}
    public void setSalario(double salario){this.salario = salario;}
}


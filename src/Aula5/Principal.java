package Aula5;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Davi", 2000.0);
        funcionario1.exibeDados();
        System.out.println("Ganho anual: " + funcionario1.ganhoAnual());

        Assistente assistente1 = new Assistente(1001);
        assistente1.setNome("David");
        assistente1.setSalario(2500.0);
        assistente1.exibeDados();
        System.out.println("Ganho anual: " + assistente1.ganhoAnual());

        AssistenteTecnico tecnico1 = new AssistenteTecnico(1002, 500.0);
        tecnico1.setNome("Pedro");
        tecnico1.setSalario(3000.0);
        tecnico1.exibeDados();
        System.out.println("Ganho anual: " + tecnico1.ganhoAnual());

        AssistenteAdministrativo administrativo1 = new AssistenteAdministrativo(1003, "Noite", 200.0);
        administrativo1.setNome("Ana");
        administrativo1.setSalario(3500.0);
        administrativo1.exibeDados();
        System.out.println("Ganho anual: " + administrativo1.ganhoAnual());
    }
}

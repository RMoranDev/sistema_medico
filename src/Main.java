package src;



public class Main {
    public static void main(String[] args) {
         // Criando OBJETOS das classes concretas
        Hospital hospital = new Hospital("Hospital São Lucas");

        Medico clinicoGeral = new Medico(
                "Ana Souza", "12345678901", 38, "CRM-12345", "Clínica Geral");

        Especialista cardiologista = new Especialista(
                "Carlos Lima", "98765432100", 45, "CRM-67890", "Cardiologia", 450.00);

        Paciente p1 = new Paciente("João Silva",  "11122233300", 62, "Particular");
        Paciente p2 = new Paciente("Maria Oliveira", "44455566600", 34, "Unimed");

        p1.adicionarHistorico("Consulta inicial - 01/06/2025");
        p2.adicionarHistorico("Exame de sangue - 15/05/2025");

        // Cadastrando no hospital
        hospital.cadastrarMedico(clinicoGeral);
        hospital.cadastrarMedico(cardiologista);
        hospital.cadastrarPaciente(p1);
        hospital.cadastrarPaciente(p2);

        // Demonstrando POLIMORFISMO e HERANÇA
        hospital.listarPessoas();
        hospital.realizarAtendimentos();
        hospital.fecharFaturamento();

        // Demonstrando ENCAPSULAMENTO com getters/setters
        System.out.println("\n=== Atualização de dados (Encapsulamento) ===");
        p1.setConvenio("Bradesco");
        System.out.println("Convênio atualizado: " + p1.getConvenio());
        System.out.printf("Novo custo: R$ %.2f%n", p1.calcularCusto());

        // Demonstrando POLIMORFISMO com referência do tipo pai
        System.out.println("\n=== Polimorfismo com referência Pessoa ===");
        Pessoa[] pessoas = { clinicoGeral, cardiologista, p1, p2 };
        for (Pessoa pessoa : pessoas) {
            // getTipo() executa o método da subclasse real, não de Pessoa
            System.out.println("Tipo: " + pessoa.getTipo() + " → " + pessoa.getNome());
        }

        // Referência de interface — polimorfismo via interface
        System.out.println("\n=== Polimorfismo via Interface Atendivel ===");
        Atendivel[] atendiveis = { clinicoGeral, cardiologista };
        for (Atendivel a : atendiveis) {
            a.realizarAtendimento();
            System.out.println(a.gerarRelatorio());
        }
    }
}

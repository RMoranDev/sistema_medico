package src;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private List<Medico> medicos;
    private List<Paciente> pacientes;

    public Hospital(String nome) {
        this.nome = nome;
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public String getNome() { return nome; }

    public void cadastrarMedico(Medico m) { medicos.add(m); }
    public void cadastrarPaciente(Paciente p) { pacientes.add(p); }

    public void realizarAtendimentos() {
        System.out.println("\n=== Atendimentos em " + nome + " ===");
        for (Medico m : medicos) {
            m.realizarAtendimento(); // cada médico executa seu próprio comportamento
        }
    }

    public void fecharFaturamento() {
        System.out.println("\n=== Faturamento ===");
        for (Paciente p : pacientes) {
            p.emitirNota();
        }
        for (Medico m : medicos) {
            if (m instanceof Faturavel f) { // pattern matching (Java 16+)
                f.emitirNota();
            }
        }
    }

    public void listarPessoas() {
        System.out.println("\n=== Equipe Médica ===");
        for (Medico m : medicos) {
            System.out.print("[" + m.getTipo() + "] ");
            m.apresentar(); // método herdado de Pessoa
        }
        System.out.println("\n=== Pacientes ===");
        for (Paciente p : pacientes) {
            System.out.print("[" + p.getTipo() + "] ");
            p.apresentar();
        }
    }
}

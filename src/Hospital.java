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

    public void cadastrarMedico() {
    }

    public void realizarAtendimentos() {
    }

    public void fecharFaturamento() {
    }
}

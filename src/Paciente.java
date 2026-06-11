package src;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa implements Faturavel {
    private String convenio;
    private List<String> historico;

    public Paciente(String nome, String cpf, int idade, String convenio) {
        super(nome, cpf, idade);
        this.convenio = convenio;
        this.historico = new ArrayList<>();
    } 
}

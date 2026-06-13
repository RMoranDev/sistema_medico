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

    public String getConvenio() {
        return this.convenio;
    }

    public List<String> getHistorico() {
        return new ArrayList<>(historico);
    }

    @Override
    public String getTipo() { return "Paciente"; }

    public void setConvenio(String c) {
        this.convenio = c;
    }

    @Override
    public double calcularCusto() {
        if (this.convenio != null && !this.convenio.isEmpty()) {
            return 100.0;
        }
        return 250.0;
    }

    //     double base = 150.00; <-- outra forma de fazer.
    //     return convenio.equalsIgnoreCase("Particular") ? base : base * 0.4;

    @Override
    public void emitirNota() {
        System.out.println("Nota Fiscal emitida para o paciente: " + getNome());
        System.out.println("Custo Total: R$ " + calcularCusto());

        // System.out.printf("[Fatura] Paciente: %s | Convênio: %s | Valor: R$ %.2f%n",
        //         getNome(), convenio, calcularCusto());
    }

    public void adicionarHistorico(String entrada) {
        this.historico.add(entrada);
    }
}

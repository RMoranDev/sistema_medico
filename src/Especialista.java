package src;

public class Especialista extends Medico implements Faturavel {
    private double taxaConsulta;

    public Especialista(String nome, String cpf, int idade, String crm, String especialidade, double taxaConsulta) {
        super(nome, cpf, idade, crm, especialidade);
        this.taxaConsulta = taxaConsulta;
    }

    @Override
    public String getTipo() { return "Especialista"; }

    public double getTaxaConsulta() { return taxaConsulta; }

    public void setTaxaConsulta(double t) {
        if (t < 0) throw new IllegalArgumentException("Taxa não pode ser negativa.");
        this.taxaConsulta = t;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("[Especialista] Dr(a). " + getNome() +
                " realizando procedimento especializado em " + getEspecialidade() + ".");
    }

    @Override
    public String gerarRelatorio() {
        return "Relatório Especialista: " + getNome() + " - " + getEspecialidade() + " - Taxa: R$ " + this.taxaConsulta;
    }

    @Override
    public double calcularCusto() {
        return this.taxaConsulta;
    }

    @Override
    public void emitirNota() {
        System.out.println("Nota Fiscal de Honorários Médicos");
        System.out.println("Médico: " + getNome() + " | CRM: " + getCrm());
        System.out.println("Valor da Consulta Especializada: R$ " + calcularCusto());
    }
}

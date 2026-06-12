package src;

public class Medico extends Pessoa implements Atendivel {
    private String crm;
    private String especialidade;

    public Medico(String nome, String cpf, int idade, String crm, String especialidade) {
        super(nome, cpf, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() { return crm; } 
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String e) { this.especialidade = e; }

    @Override
    public String getTipo() {
        return "Médico";
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("[Médico] Dr(a). " + getNome() +
                " ( " + especialidade + " ) realizando consulta.");
    }

    @Override
    public String gerarRelatorio() {
        return "Relatório - Médico: " + getNome() + " - CRM: " + this.crm +
               " | Especialidade: " + especialidade;
    }
}

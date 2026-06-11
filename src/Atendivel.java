package src;
public interface Atendivel {
    String TIPO_ATENDIMENTO = "Médico";
    
    void realizarAtendimento();
    String gerarRelatorio();
}

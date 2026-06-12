package src;

public interface Atendivel {
    String TIPO_ATENDIMENTO = "PRESENCIAL";
    
    void realizarAtendimento();
    String gerarRelatorio();
}

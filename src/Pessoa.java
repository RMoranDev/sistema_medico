package src;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public abstract String getTipo();

    public String getNome()  { return nome; }
    public String getCpf()   { return cpf; }
    public int    getIdade() { return idade; }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        if (cpf == null || cpf.length() != 11)
            throw new IllegalArgumentException("CPF inválido.");
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Idade: " + idade);
    }
}

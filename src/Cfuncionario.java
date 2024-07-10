public abstract class Cfuncionario {
    private String nome;
    private String cpf;

    public Cfuncionario(String nome, String cpf) {
        this.nome = this.nome;
        this.cpf = this.cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract double calculaRendimentos();

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}

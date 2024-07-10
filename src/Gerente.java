public class Gerente  extends Funcionario{
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }private String departamento;

    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * 1.2; // acréscimo de 20% no salário base
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Salário: R$ " + getSalario() + ", Departamento: " + departamento;
    }
}

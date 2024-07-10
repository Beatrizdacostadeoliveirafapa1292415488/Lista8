public class FuncionarioCLT extends Cfuncionario{
    private double salarioMensal;

    public FuncionarioCLT(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calculaRendimentos() {
        return salarioMensal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário Mensal: R$ " + salarioMensal + ", Rendimentos: R$ " + calculaRendimentos();
    }





}

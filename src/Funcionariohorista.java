class Funcionariohorista extends Cfuncionario {
    private double salarioHora;
    private int horasTrabalhadas;

    public Funcionariohorista(String nome, String cpf, double salarioHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaRendimentos() {
        return salarioHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário por Hora: R$ " + salarioHora + ", Horas Trabalhadas: " + horasTrabalhadas + ", Rendimentos: R$ " + calculaRendimentos();
    }
}

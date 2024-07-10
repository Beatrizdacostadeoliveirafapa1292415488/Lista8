public class Contacorrente extends Conta {
    private double limite;

    public Contacorrente(String numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public Contacorrente(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            if (valor <= getSaldo()) {
                super.sacar(valor);
            } else {
                double restante = valor - getSaldo();
                super.sacar(getSaldo());
                limite -= restante;
                System.out.println("Saque de R$ " + valor + " realizado com uso do limite de cheque especial.");
            }
            return true;
        } else {
            System.out.println("Saldo e limite insuficientes ou valor de saque inválido.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente [Número: " + getNumero() + ", Titular: " + getTitular() + ", Saldo: R$ " + getSaldo() + ", Limite: R$ " + limite + "]";
    }
}

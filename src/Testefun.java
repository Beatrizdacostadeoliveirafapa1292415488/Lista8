public class Testefun {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("bia", "123.456.789-00", 3000.00);
        Funcionario funcionario2 = new Funcionario("alice", "987.654.321-00", 3500.00);
        Gerente gerente = new Gerente("ricardo", "456.789.123-00", 5000.00, "TI");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(gerente);
    }
    }


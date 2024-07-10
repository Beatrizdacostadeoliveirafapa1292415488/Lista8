public class Testecontacorente {
    public static void main(String[] args) {
        Contacorrente cc = new Contacorrente("12345-6", "Kellen", 1000.00, 500.00);

        System.out.println(cc);
        cc.depositar(200.00);
        System.out.println(cc);
        cc.sacar(1100.00);
        System.out.println(cc);
        cc.sacar(700.00);
        System.out.println(cc);
        cc.depositar(500.00);
        System.out.println(cc);
    }
    }


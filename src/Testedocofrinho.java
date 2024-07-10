public class Testedocofrinho {
    public static void main(String[] args) {
        Moeda umCentavo = new Moeda("Um Centavo", 0.01);
        Moeda cincoCentavos = new Moeda("Cinco Centavos", 0.05);
        Moeda dezCentavos = new Moeda("Dez Centavos", 0.10);
        Moeda vinteECincoCentavos = new Moeda("Vinte e Cinco Centavos", 0.25);
        Moeda cinquentaCentavos = new Moeda("Cinquenta Centavos", 0.50);
        Moeda umReal = new Moeda("Um Real", 1.00);

        Cofrinho cofrinho = new Cofrinho();


        cofrinho.adicionarMoeda(umCentavo);
        cofrinho.adicionarMoeda(cincoCentavos);
        cofrinho.adicionarMoeda(dezCentavos);
        cofrinho.adicionarMoeda(vinteECincoCentavos);
        cofrinho.adicionarMoeda(cinquentaCentavos);
        cofrinho.adicionarMoeda(umReal);


        cofrinho.removerMoeda(cincoCentavos);
        cofrinho.removerMoeda(umReal);


        System.out.println(cofrinho);
    }
    }


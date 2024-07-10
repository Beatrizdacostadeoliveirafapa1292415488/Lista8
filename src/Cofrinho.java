import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("Adicionada: " + moeda);
    }

    public void removerMoeda(Moeda moeda) {
        if (moedas.remove(moeda)) {
            System.out.println("Removida: " + moeda);
        } else {
            System.out.println("Moeda não encontrada: " + moeda);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cofrinho contém ").append(moedas.size()).append(" moedas:\n");
        for (Moeda moeda : moedas) {
            sb.append(moeda).append("\n");
        }
        return sb.toString();
    }

}

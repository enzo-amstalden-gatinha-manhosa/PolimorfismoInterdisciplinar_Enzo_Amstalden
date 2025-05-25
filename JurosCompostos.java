public class JurosCompostos extends Juros {
    public JurosCompostos(double dinheiro, double taxa, int tempo) {
        super(dinheiro, taxa, tempo);
    }

    @Override
    public double calcularJuros() {
        return dinheiro * Math.pow(1 + taxa / 100, tempo) - dinheiro;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Juros Compostos\nDinheiro: R$ " +dinheiro+ "\nTaxa: " +taxa+ "\nTempo: " +tempo+ " meses\nJuros: R$ " +calcularJuros()+ "\nValor final: R$ " +(dinheiro+calcularJuros())+ "\n");
    }
}

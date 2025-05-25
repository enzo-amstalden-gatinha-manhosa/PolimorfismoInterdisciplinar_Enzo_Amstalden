public class JurosCarencia extends Juros {
    private int carencia;

    public JurosCarencia(double dinheiro, double taxa, int tempo, int carencia) {
        super(dinheiro, taxa, tempo);
        this.carencia = carencia;
    }

    @Override
    public double calcularJuros() {
        if (tempo <= carencia) return 0;
        return dinheiro * taxa / 100 * (tempo - carencia);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Juros com carência\nDinheiro: R$ " +dinheiro+ "\nTaxa: " +taxa+ "\nTempo: " +tempo+ " meses\nCarência:" +carencia+ " meses \nJuros: R$ " +calcularJuros()+ "\nValor final: R$ " +(dinheiro+calcularJuros())+ "\n");
    }
}

public class JurosSimples extends Juros {
    
    public JurosSimples(double dinheiro, double taxa, int tempo) {
        super(dinheiro, taxa, tempo);
    }

    @Override
    public double calcularJuros() {
        return dinheiro * taxa / 100 * tempo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Juros Simples\nDinheiro: R$ " +dinheiro+ "\nTaxa: " +taxa+ "\nTempo: " +tempo+ " meses \nJuros: R$ " +calcularJuros()+ "\nValor final: R$ " +(dinheiro+calcularJuros())+ "\n");
    }
}

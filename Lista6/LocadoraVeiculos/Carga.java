public class Carga extends Veiculo {
    private int capacidade;
	
	public Carga() {
		super();
		capacidade = 15;
	}
	
	public void setCapacidade ( int capacidade ) {
		if ( capacidade > 0 ) {
			this.capacidade = capacidade;
		}
	}
	
	public int getCapacidade () {
		return capacidade;
	}
	
	@Override
	public double calculaValorLocacao () {
		return super.calculaValorLocacao () * 1.1;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + 
		       "Capacidade: " + capacidade + " ton";
	}	
}

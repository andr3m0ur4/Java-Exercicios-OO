public class Passeio extends Veiculo {
    private boolean arCondicionado;
	private int     portas;
	
	public Passeio () {
		super();
		arCondicionado = true;
		portas = 4;
	}
	
	public void setArCondicionado ( boolean arCondicionado ) {
		this.arCondicionado = arCondicionado;
	}
	
	public void setPortas ( int portas ) {
		if ( portas >= 1 ) {
			this.portas = portas;
		}
	}
	
	public boolean hasArCondicionado () {
		return arCondicionado;
	}
	
	public int getPortas () {
		return portas;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + 
		       (arCondicionado?"Tem ":"Nao tem ") +
		       "ar-condicionado";
	}
}

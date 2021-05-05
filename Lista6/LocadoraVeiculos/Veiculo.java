public class Veiculo {
    private String placa, marca;
	private double modelo;
	private int    ano;

	private int    kmInicial, kmFinal;
	private double valorKmRodado;
	
	//protected int    kmInicial, kmFinal;
	//protected double valorKmRodado;
	
	public Veiculo () {
		placa = "abc-1234";
		marca = "fusca";
		modelo = 1.0;
		ano = 2000;
		valorKmRodado = 10;
		kmInicial = 0;
		kmFinal = 100;
	}
	
	public void setPlaca ( String placa ) {
		if ( ! placa.isEmpty() ) {
			this.placa = placa;
		}
	}
	
	public void setMarca ( String marca ) {
		if ( ! marca.isEmpty() ) {
			this.marca = marca;
		}
	}
	
	public void setModelo ( double modelo ) {
		if ( modelo > 0.0 ) {
			this.modelo = modelo;
		}
	}
	
	public void setAno ( int ano ) {
		if ( ano >= 1950 && ano <= 2022 ) {
			this.ano = ano;
		}
	}
	
	public void setValorKmRodado ( double valorKmRodado ) {
		if ( valorKmRodado >= 0.0 ) {
			this.valorKmRodado = valorKmRodado;
		}
	}
	
	public void setKmInicial ( int kmInicial ) {
		if ( kmInicial >= 0 ) {
			this.kmInicial = kmInicial;
		}
	}
	
	public void setKmFinal ( int kmFinal ) {
		if ( kmFinal >= kmInicial ) {
			this.kmFinal = kmFinal;
		}
	}
	
	public String getPlaca () {
		return placa;
	}
	
	public String getMarca () {
		return marca;
	}
	
	public double getModelo () {
		return modelo;
	}
	
	public int getAno () {
		return ano;
	}
	
	public double getValorKmRodado () {
		return valorKmRodado;
	}
	
	public int getKmInicial () {
		return kmInicial;
	}
	
	public int getKmFinal () {
		return kmFinal;
	}
		
	public double calculaValorLocacao () {
		return ( kmFinal - kmInicial ) * valorKmRodado;
	}
	
	@Override
	public String toString () {
		return "[" + placa + "," + marca + "," + modelo + "]\n" +
		       "Valor Locacao: " + calculaValorLocacao();
	}
}

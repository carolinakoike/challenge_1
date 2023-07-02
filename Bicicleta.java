package challenge;

public class Bicicleta extends Veiculos {
	private Boolean eletrica;
	private Boolean bagageiro;
	
	public Bicicleta (String modelo, boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
	                int capCarga, Combustivel combustivel, Boolean eletrica, Boolean bagageiro) {
		super(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, combustivel);
	        this.eletrica = eletrica;
	        this.bagageiro = bagageiro;
	}
		
	public Boolean getEletrica() {
		return eletrica;
	}

	public void setEletrica(Boolean eletrica) {
		this.eletrica = eletrica;
	}

	public Boolean getBagageiro() {
		return bagageiro;
	}

	public void setBagageiro(Boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	
    public String getInfoEspecifica() {
        return "\nMovida a Eletricidade: " + (eletrica ? "True " : "False ") +
        	   ", Possui Bagageiro: " + (bagageiro ? "True " : "False ");
    }

}
package challenge;

public class Carro extends Veiculos {
	private boolean arCondicionado;
    private boolean radio;

    public Carro (String modelo, boolean motor, boolean volante, int passageiros, int portas, int rodas, 
    		boolean carga, int capCarga, Combustivel combustivel, boolean arCondicionado, boolean radio) {
    	super(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, combustivel);
        this.arCondicionado = arCondicionado;
        this.radio = radio;     
    }
    
	public boolean isPossuiArCondicionado() {
		return arCondicionado;
	}

	public void setPossuiArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isPossuiRadio() {
		return radio;
	}

	public void setPossuiRadio(boolean radio) {
		this.radio = radio;
	}
	
    public String getInfoEspecifica() {
        return "\nPossui Ar-Condicionado: " + (arCondicionado ? "True " : "False ") +
        	   ", Possui Radio: " + (radio ? "True " : "False ");
    }
    
}
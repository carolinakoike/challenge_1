package challenge;

public class Veiculos {
	private String modelo;
    private boolean motor;
    private boolean volante;
    private int passageiros;
    private int portas;
    private int rodas;
    private boolean carga;
    private int capCarga;
    private Combustivel combustivel;

    public Veiculos(String modelo, boolean motor, boolean volante, int passageiros, int portas,
                   int rodas, boolean carga, int capCarga, Combustivel combustivel) {
        this.setModelo(modelo);
    	this.setMotor(motor);
        this.setVolante(volante);
        this.setPassageiros(passageiros);
        this.setPortas(portas);
        this.setRodas(rodas);
        this.setCarga(carga);
        this.setCapCarga(capCarga);
        this.setCombustivel(combustivel);
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public boolean isVolante() {
		return volante;
	}

	public void setVolante(boolean volante) {
		this.volante = volante;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public boolean isCarga() {
		return carga;
	}

	public void setCarga(boolean carga) {
		this.carga = carga;
	}

	public double getCapCarga() {
		return capCarga;
	}

	public void setCapCarga(double capCarga) {
		this.capCarga = (int) capCarga;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	
    public String getInfoEspecifica() {
        return "";
    }
    
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("\nVeiculos")
	            .append("\nModelo: ").append(modelo)
	            .append(", Motor: ").append(motor)
	            .append(", Volante: ").append(volante)
	            .append(", Passageiros: ").append(passageiros)
	            .append(", Portas: ").append(portas)
	            .append(", Rodas: ").append(rodas)
	            .append(", Carga: ").append(carga)
	            .append(", Capacidade de Carga: ").append(capCarga)
	            .append(getInfoEspecifica())	            
	            .append(", Combustivel: ");
	    
	    if (combustivel != null) {
	        sb.append(combustivel.toString());
	    } else {
	        sb.append("N/A");
	    }
	    
	    return sb.toString();
	}

}
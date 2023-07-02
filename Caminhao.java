package challenge;

public class Caminhao extends Veiculos {
    private int eixos;

	public Caminhao (String modelo, boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
                int capCarga, Combustivel combustivel, int eixos) {
    	super(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, combustivel);
    	this.eixos = eixos;
        }

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
    public String getInfoEspecifica() {
        return "\nPossui Quantos Eixos: " + eixos;
    }

}
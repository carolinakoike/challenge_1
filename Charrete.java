package challenge;

public class Charrete extends Veiculos {

		public Charrete (String modelo, boolean motor, boolean volante, int passageiros, int portas, int rodas, boolean carga,
	                int capCarga, Combustivel combustivel) {
	    	super(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, combustivel);
	        }
	    public String getInfoEspecifica() {
	        return "";
	    }
}
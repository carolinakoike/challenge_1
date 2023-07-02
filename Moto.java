package challenge;

public class Moto extends Veiculos {
    private boolean partidaEletrica;
    
    public Moto(String modelo, boolean motor, boolean volante, int passageiros, int portas, int rodas, 
                boolean carga, int capCarga, boolean partidaEletrica, Combustivel combustivel) {
        super(modelo, motor, volante, passageiros, portas, rodas, carga, capCarga, combustivel);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    
    public String getInfoEspecifica() {
        return "\nPartida Eletrica: " + (partidaEletrica ? "True" : "False");
    }
    
}
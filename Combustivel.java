package challenge;

public class Combustivel {
	 	private boolean gasolina;
	    private boolean alcool;
	    private boolean diesel;
	    private boolean eletricidade;
	    private boolean humano;
	    private boolean animal;

	    public Combustivel(boolean gasolina, boolean alcool, boolean diesel, boolean eletricidade,
	                       boolean humano, boolean animal) {
	        this.setGasolina(gasolina);
	        this.setAlcool(alcool);
	        this.setDiesel(diesel);
	        this.setEletricidade(eletricidade);
	        this.setHumano(humano);
	        this.setAnimal(animal);
	    }

		public boolean isGasolina() {
			return gasolina;
		}

		public void setGasolina(boolean gasolina) {
			this.gasolina = gasolina;
		}

		public boolean isAlcool() {
			return alcool;
		}

		public void setAlcool(boolean alcool) {
			this.alcool = alcool;
		}

		public boolean isDiesel() {
			return diesel;
		}

		public void setDiesel(boolean diesel) {
			this.diesel = diesel;
		}

		public boolean isEletricidade() {
			return eletricidade;
		}

		public void setEletricidade(boolean eletricidade) {
			this.eletricidade = eletricidade;
		}

		public boolean isHumano() {
			return humano;
		}

		public void setHumano(boolean humano) {
			this.humano = humano;
		}

		public boolean isAnimal() {
			return animal;
		}

		public void setAnimal(boolean animal) {
			this.animal = animal;
		}
		
		@Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();

	        if (gasolina) {
	            sb.append("Gasolina ");
	        }
	        if (alcool) {
	            sb.append("Alcool ");
	        }
	        if (diesel) {
	            sb.append("Diesel ");
	        }
	        if (eletricidade) {
	            sb.append("Eletricidade ");
	        }
	        if (humano) {
	            sb.append("Humano ");
	        }
	        if (animal) {
	            sb.append("Animal ");
	        }

	        return sb.toString();
	    }
		
}
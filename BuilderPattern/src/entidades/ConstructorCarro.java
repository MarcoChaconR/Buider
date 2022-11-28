package entidades;

public class ConstructorCarro implements Constructor {
	private Carro carro;

	public ConstructorCarro() {
		super();
		carro = new Carro();
	}

	@Override
	public void construirPuertas() {
		carro.setLlantas("Construcción de Puertas completada");
		
	}

	@Override
	public void construirllantas() {
		carro.setPuertas("Construcción de Llantas completada");
		
	}

	@Override
	public void construirMotor() {
		carro.setMortor("Construcción de Motor completada");
		
	}

	@Override
	public Carro construirCarro() {
		return carro;		
	}

}

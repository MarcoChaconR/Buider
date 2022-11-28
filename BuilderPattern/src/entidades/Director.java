package entidades;

public class Director {
	public static Carro construir(Constructor constructor) {
		constructor.construirllantas();
		constructor.construirPuertas();
		constructor.construirMotor();
		return constructor.construirCarro();
	}

}

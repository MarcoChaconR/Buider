package builder;

import entidades.Carro;
import entidades.ConstructorCarro;
import entidades.Director;

public class Main {

	public static void main(String[] args) {
		Carro carro = Director.construir(new ConstructorCarro());

		System.out.println(carro.getLlantas());
		System.out.println(carro.getPuertas());
		System.out.println(carro.getMortor());

	}

}

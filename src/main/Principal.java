package main;


public class Principal {

	public static void main(String[] args) {
		Jugador j = JugadorFactory.crearJugador();
		System.out.println(j);
	}
	
	static class Jugador{
		public Jugador() {
			System.out.println("creando objeto que requere de una " +
					" dificil configuracion ");			
		}
	}
	
	static class JugadorFactory{
		public static Jugador crearJugador() {
			System.out.println("creando objeto que requiere de varias preparaciones");
			return new Jugador();
		}
	}

}

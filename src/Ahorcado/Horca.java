// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Ahorcado;

/************************************************************/
/**
 * 
 */
public class Horca {
	protected static final int MAX_FALLOS = 6;
	/**
	 * es el número de fallos que lleva el usuario, vamos a permitir 6 fallos
	 */
	private int fallos;

	/**
	 * 
	 */
	public Horca() {
		fallos = 0;
	}

	/**
	 * 
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}
	
	public void setFallos(int fallos) {
		this.fallos = fallos;
	}
	
	/**
	 * Te muestra los fallos en consola
	 */
	public void dibujar() {
		System.out.println("Fallos: " + fallos);
	}

	/**
	 * incrementa el contador de fallos
	 */
	public void incrementarFallo() {
		fallos++;
	}

	/**
	 * comprueba si hemos perdido la partida
	 * 
	 * @return perdido
	 */
	public boolean comprobarSiPerdido() {
		return (fallos == MAX_FALLOS);
	}
};

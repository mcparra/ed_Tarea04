
package cuentas;
/**
 * La clase CCuenta permite realizar operaciones de ingreso y retirada, así
 * como llevar un registro de los nombres de los clientes, cuentas, saldo
 * y tipo de interés.
 * 
 * @author mcparra 
 * @version 0.5 
 * @since 07/02/2022 
 * @see <a href="https://github.com/mcparra/ed_Tarea04/blob/master/deposito/src/cuentas/CCuenta.java">Enlace GitHub</a>
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	public CCuenta() {
	}

	/**
	 * @param nombre
	 * @param numero cuenta
	 * @param saldo
	 * @param tipo de interes
	 *
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param numero cuenta
	 *
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipo interes
	 *
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double estado() {
		return saldo;
	}
/**
 * El método ingresar funciona solo con cantidades positivas,
 * en caso contrario indicará que la cantidad es negativa.
 * 
 * @param cantidad
 * @throws Exception
 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}
/**
 * El método retirar permite solo la retirada de cantidades positivas y con
 * saldo suficiente para poder realizarlo.
 * @param cantidad
 * @throws Exception
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}

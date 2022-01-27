package cuentas;
/**
 * Clase CCuenta: Implementa o funcionamiento dunha conta bancaria.
 * @author Alex
 *@version 1.0
 */

public class CCuenta {

	/**
 	* Nome do titular da conta.
 	*/
    private String nombre;
    /**
     *N�mero da conta.
     */
    private String cuenta;
    /**
     * Saldo da conta.
     */
    private double saldo;
    /**
     * Inter�s a aplicar a conta.
     */
    private double tipoInteres;

    public CCuenta()
    {
    }
    /**
     * Constructor con catro par�ametros da clase para poder crear obxectos CCuenta.
     * @param nom Nome do titular da conta.
     * @param cue N�mero da conta.
     * @param sal Saldo da conta.
     * @param tipo Inter�s a aplicar a conta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    
    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInter�() {
		return tipoInteres;
	}

	private void setTipoInter�(double tipoInter�) {
		this.tipoInteres = tipoInter�;
	}
}

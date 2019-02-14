/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;



/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class CuentaBCTT extends Cuenta {

    
    private static final double COMISION_INGRESO = 0.05;
    private static final double COMISION_DESCUENTO = 0.02;

    public CuentaBCTT(String numero, String titular) {
        super(numero, titular);
        this.numero = numero;
    }

    public CuentaBCTT(String titular) {
        super(titular);
    }

    @Override
    public boolean retirar(String concepto, double cantidad) {
        
        this.saldo -= cantidad * COMISION_DESCUENTO;
        return super.retirar(concepto, cantidad);
    }

    @Override
    public boolean ingresar(String concepto, double cantidad) {
        this.saldo -= cantidad * COMISION_INGRESO;
        return super.ingresar(concepto, cantidad);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.PlanCelular;
import paquete2.Propietario;

/**
 *
 * @author Smart
 */
public class PlanPostPagoMinutosMegas extends PlanCelular{

    protected double minutosN;
    protected double costoN;
    protected double mega;
    protected double costoI;

    public PlanPostPagoMinutosMegas(Propietario pro, String c, String m, String mo, String n,double mN, double cN, double mI, double cI) {
        super(pro, c, m, mo, n);
        minutosN = mN;
        costoN = cN;
        mega = mI;
        costoI = cI;
    }

    public void CalcularPago() {
        pago = ((mega * costoI) + (minutosN * costoN));
    }
    
    public void establecerMinutosN(double e) {
        minutosN = e;
    }

    public void establecerCostoN(double e) {
        costoN = e;
    }

    public void establecerMega(double e) {
        mega = e;
    }

    public void establecerCostoI(double e) {
        costoI = e;
    }
    
    public double obtenerMinutosN() {
        return minutosN;
    }

    public double obtenerCostoN() {
        return costoN;
    }

    public double obtenerMega() {
        return mega;
    }

    public double obtenerCostoI() {
        return costoI;
    }

@Override
    public String toString() {
        String cadena = String.format(""
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Marca: %s\n"
                + "Modelo: %s\n"
                + "Numero: %s\n"
                + "Minutos: %.1f\n"
                + "Costo por minuto: $ %.2f\n"
                + "Gigas: %.1f\n"
                + "Costo por giga: $ %.2f\n"
                + "Total: $ %.2f\n",
                obtenerPropietario().obtenerNombres(),
                obtenerPropietario().obtenerApellido(),
                obtenerPropietario().obtenerCedula(),
                obtenerCiudad(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumero(),
                obtenerMinutosN(),
                obtenerCostoN(),
                obtenerMega(),
                obtenerCostoI(),
                obtenerPago());

        return cadena;
    }
}


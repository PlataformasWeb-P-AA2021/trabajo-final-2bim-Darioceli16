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
public class PlanPostPagoMinutos extends PlanCelular {

    protected double minutosN;
    protected double costoN;
    protected double minutosI;
    protected double costoI;

    public PlanPostPagoMinutos(Propietario pro, String c, String m, String mo, String n, double mN, double cN, double mI, double cI) {
        super(pro, c, m, mo, n);
        minutosN = mN;
        costoN = cN;
        minutosI = mI;
        costoI = cI;
    }

    public void CalcularPago() {
        pago = ((minutosN * costoN) + (minutosI * costoI));
    }

    public void establecerMinutosN(double e) {
        minutosN = e;
    }

    public void establecerCostoN(double e) {
        costoN = e;
    }

    public void establecerMinutosI(double e) {
        minutosI = e;
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

    public double obtenerMinutosI() {
        return minutosI;
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
                + "Minutos nacionales: %.1f\n"
                + "Costo por minuto nacional: $ %.2f\n"
                + "Minutos internacionales: %.1f\n"
                + "Costo por minuto internacional: $ %.2f\n"
                + "Total:  %.2f\n",
                obtenerPropietario().obtenerNombres(),
                obtenerPropietario().obtenerApellido(),
                obtenerPropietario().obtenerCedula(),
                obtenerCiudad(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumero(),
                obtenerMinutosN(),
                obtenerCostoN(),
                obtenerMinutosI(),
                obtenerCostoI());
        return cadena;
    }
}

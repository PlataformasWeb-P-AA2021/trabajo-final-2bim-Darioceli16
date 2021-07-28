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
public class PlanPostPagoMegas extends PlanCelular{
    protected double tarifa;
    protected double minutosI;
    protected double costoI;

    public PlanPostPagoMegas(Propietario pro, String c, String m, String mo, String n,double cN,double mI,double cI) {
        super(pro, c, m, mo, n);
        tarifa = cN;
        minutosI = mI;
        costoI = cI;
    }
    public void CalcularPago() {
        pago = (tarifa + (minutosI * costoI));
    }
    public void establecerTarifa(double e) {
        tarifa = e;
    }

    public void establecerMinutosI(double e) {
        minutosI = e;
    }
    public void establecerCostoI(double e) {
        costoI = e;
    }

    public double obtenerTarifa() {
        return tarifa;
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
                + "Gigas: %.1f\n"
                + "Costo por giga: $ %.2f\n"
                + "Tarifa base: $ %.2f\n"
                + "total: $ %.2f\n",
                obtenerPropietario().obtenerNombres(),
                obtenerPropietario().obtenerApellido(),
                obtenerPropietario().obtenerCedula(),
                obtenerCiudad(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumero(),
                obtenerMinutosI(),
                obtenerCostoI(),
                obtenerTarifa(),
                obtenerPago());

        return cadena;
    }
}

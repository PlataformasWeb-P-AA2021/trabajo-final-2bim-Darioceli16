/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author Smart
 */
public abstract class PlanCelular implements Serializable {

    protected Propietario propietario;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String numero;
    protected double pago;

    public PlanCelular(Propietario pro,String c, String m, String mo, String n) {
        propietario = pro;
        ciudad = c;
        marca = m;
        modelo = mo;
        numero = n;
    }

    public void establecerCiudad(String e) {
        ciudad = e;
    }

    public void establecerMarca(String e) {
        marca = e;
    }

    public void establecerModelo(String e) {
        modelo = e;
    }

    public void establecerNumero(String e) {
        numero = e;
    }

    public abstract void CalcularPago();

    public void establecerPropietario(Propietario e) {
        propietario = e;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public String obtenerNumero() {
        return numero;
    }

    public double obtenerPago() {
        return pago;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

@Override
    public String toString(){
        return String.format("Plan de Celular.");
    }


}

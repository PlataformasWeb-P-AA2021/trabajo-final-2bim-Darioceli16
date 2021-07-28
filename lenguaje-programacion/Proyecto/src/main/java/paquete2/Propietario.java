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
public class Propietario implements Serializable {

    protected String nombres;
    protected String cedula;
    protected String apellido;

    public Propietario(String n, String c, String a) {
        nombres = n;
        cedula = c;
        apellido = a;
    }

    public void establecerNombres(String e) {
        nombres = e;
    }

    public void establecerCedula(String e) {
        cedula = e;
    }

    public void establecerApellido(String e) {
        apellido = e;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }
    public String obtenerApellido() {
        return apellido;
    }

}

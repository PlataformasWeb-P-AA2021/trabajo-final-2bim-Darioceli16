/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.PlanCelular;
import paquete2.Propietario;
import paquete3.PlanPostPagoMegas;
import paquete3.PlanPostPagoMinutos;
import paquete3.PlanPostPagoMinutosMegas;
import paquete3.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author Smart
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarar variables
        String nombreArchivo = ("Planes.data");
        short n, opcion;
        String nom, ape, id, m, mo, nu, c;
        double nuM, nuI;
        double preM, preI, p;
        ArrayList<PlanCelular> planes = new ArrayList<>();
        // Entrada de datos
        System.out.print("\t<< PLAN CELULAR>>\n");
        System.out.println("\t===========================\n");
        System.out.print("QUE TIPO DE PLAN DESEA ADQUIRIR: ");
        n = sc.nextShort();
        do {
            System.out.print("\nMenu: \n"
                    + "Digite el numero de el proceso que desea realizar\n"
                    + "1 - PLAN POST PAGO MINUTOS\\n\"\n"
                    + "2 - PLAN POST PAGO MEGAS\\n\"\n"
                    + "3 - PLAN POST PAGO MINUTOS MEGAS\"\n"
                    + "4 - PLAN POST PAGO MINUTOS MEGAS ECONOMICO\"\n"
                    + "5 - SALIR\"\n"
                    + "Opcion: ");
            opcion = sc.nextShort();

            switch (opcion) {
                case 1:

                    System.out.print("\t<< BASE DE DATOS>>\n");
                    System.out.println("\t===========================\n");
                    System.out.print("Ingrese su nombre: ");
                    nom = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    ape = sc.nextLine();
                    System.out.print("Ingrese su identificacion: ");
                    id = sc.nextLine();
                    System.out.print("Ingrese la Ciudad: ");
                    c = sc.nextLine();
                    System.out.print("Ingrese la Marca: ");
                    m = sc.nextLine();
                    System.out.print("Ingrese su Modelo: ");
                    mo = sc.nextLine();
                    System.out.print("Ingrese su numero: ");
                    nu = sc.nextLine();
                    System.out.print("\t<< PLAN POST PAGO MINUTOS >>\n");
                    System.out.println("\t===========================\n");
                    System.out.print("Ingrese el numero de minutos nacionales: ");
                    nuM = sc.nextDouble();
                    System.out.print("Ingrese el precio por minuto nacional: ");
                    preM = sc.nextDouble();
                    System.out.print("Ingrese el numero de minutos internacionales: ");
                    nuI = sc.nextDouble();
                    System.out.print("Ingrese el precio de minutos internacionales: ");
                    preI = sc.nextDouble();
                    //establecer variables
                    Propietario pro1 = new Propietario(nom, id, ape);
                    PlanPostPagoMinutos ca1 = new PlanPostPagoMinutos(pro1, c, m, mo, nu, nuM, preM, nuI, preI);
                    ca1.CalcularPago();
                    planes.add(ca1);
                    break;
                case 2:
                    System.out.print("\t<< BASE DE DATOS>>\n");
                    System.out.println("\t===========================\n");
                    System.out.print("Ingrese su nombre: ");
                    nom = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    ape = sc.nextLine();
                    System.out.print("Ingrese su identificacion: ");
                    id = sc.nextLine();
                    System.out.print("Ingrese la Ciudad: ");
                    c = sc.nextLine();
                    System.out.print("Ingrese la Marca: ");
                    m = sc.nextLine();
                    System.out.print("Ingrese su Modelo: ");
                    mo = sc.nextLine();
                    System.out.print("Ingrese su numero: ");
                    nu = sc.nextLine();
                    System.out.print("\t<< PLAN POST PAGO MEGAS >>\n");
                    System.out.println("\t===========================\n");
                    System.out.print("Ingrese el numero de megas expresado en gigas: ");
                    nuM = sc.nextDouble();
                    System.out.print("Ingrese el precio por cada giga: ");
                    preM = sc.nextDouble();
                    System.out.print("Ingrese la tarifa base: ");
                    nuI = sc.nextDouble();
                    //establecer variables
                    Propietario pro = new Propietario(nom, id, ape);
                    PlanPostPagoMegas ca = new PlanPostPagoMegas(pro, c, m, mo, nu, nuM, preM, nuI);
                    ca.CalcularPago();
                    planes.add(ca);
                case 3:
                    System.out.print("\t<< BASE DE DATOS>>\n");
                    System.out.println("\t===========================\n");
                    System.out.print("Ingrese su nombre: ");
                    nom = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    ape = sc.nextLine();
                    System.out.print("Ingrese su identificacion: ");
                    id = sc.nextLine();
                    System.out.print("Ingrese la Ciudad: ");
                    c = sc.nextLine();
                    System.out.print("Ingrese la Marca: ");
                    m = sc.nextLine();
                    System.out.print("Ingrese su Modelo: ");
                    mo = sc.nextLine();
                    System.out.print("Ingrese su numero: ");
                    nu = sc.nextLine();
                    System.out.print("\t<< PLAN POST PAGO MINUTOS MEGAS >>\n");
                    System.out.println("\t===========================\n");
                    System.out.print("Ingrese el numero de minutos: ");
                    nuM = sc.nextDouble();
                    System.out.print("Ingrese el precio por minuto: ");
                    preM = sc.nextDouble();
                    System.out.print("Ingrese el numero de megas por cada giga: ");
                    nuI = sc.nextDouble();
                    System.out.print("Ingrese El precio por giga: ");
                    preI = sc.nextDouble();
                    //establecer variables
                    Propietario po = new Propietario(nom, id, ape);
                    PlanPostPagoMinutosMegas ci = new PlanPostPagoMinutosMegas(po, c, m, mo, nu, nuM, preM, nuI, preI);
                    ci.CalcularPago();
                    planes.add(ci);
                    break;
                case 4:
                    System.out.print("\t<< BASE DE DATOS>>\n");
                    System.out.println("\t===========================\n");
                    System.out.print("Ingrese su nombre: ");
                    nom = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    ape = sc.nextLine();
                    System.out.print("Ingrese su identificacion: ");
                    id = sc.nextLine();
                    System.out.print("Ingrese la Ciudad: ");
                    c = sc.nextLine();
                    System.out.print("Ingrese la Marca: ");
                    m = sc.nextLine();
                    System.out.print("Ingrese su Modelo: ");
                    mo = sc.nextLine();
                    System.out.print("Ingrese su numero: ");
                    nu = sc.nextLine();
                    System.out.print("\t<< PLAN POST PAGO MINUTOS MEGAS ECONOMICO >>\n");
                    System.out.println("\t===========================\n");
                    System.out.print("Ingrese el numero de minutos : ");
                    nuM = sc.nextDouble();
                    System.out.print("Ingrese el precio por minuto : ");
                    preM = sc.nextDouble();
                    System.out.print("Ingrese el numero de megas por cada giga: ");
                    nuI = sc.nextDouble();
                    System.out.print("Ingrese el precio por cada giga: ");
                    preI = sc.nextDouble();
                    System.out.print("Ingrese el porcentaje de descuento: ");
                    p = sc.nextDouble();
                    //establecer variables
                    Propietario pr = new Propietario(nom, id, ape);
                    PlanPostPagoMinutosMegasEconomico e = new PlanPostPagoMinutosMegasEconomico(pr, c, m, mo, nu, nuM, preM, nuI, preI, p);
                    e.CalcularPago();
                    planes.add(e);
                    break;

                case 5:
                    System.out.println("GRACIAS POR SU COLABORACION");
                    break;
                default:
                    System.err.println("Opcion Invalida");
            }
        } while (opcion != 6);

    }
}

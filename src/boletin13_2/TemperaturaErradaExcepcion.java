/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_2;

/**
 *
 * @author agonzalezgonzalez
 */
public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super("Error al introducir G.centigrados");
    }

    public TemperaturaErradaExcepcion(String mensaxe) {
        super("Error al introducir G.centigrados");
    }

}

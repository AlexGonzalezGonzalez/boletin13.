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
public class Boletin13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorTemperaturas ct = new ConversorTemperaturas();
        try {
            ct.centigradosAFharenheit();
            ct.centigradosAReimur();
        } catch (TemperaturaErradaExcepcion ex1) {
            System.out.println(ex1.getMessage());
        }
        ConversorTemperaturas ct1 = new ConversorTemperaturas();

        ct1.centigradosAReimur();

    }
}

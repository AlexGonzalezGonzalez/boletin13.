/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agonzalezgonzalez
 */
public class Boletin13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ConversorTemperaturas ct=new ConversorTemperaturas();
        try {
            ct.centigradosAFharenheit();
            
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println("La temperatura ha de ser superior a 80");
        }
    }
    
}

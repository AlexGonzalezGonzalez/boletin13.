/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_1;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezgonzalez
 */
public class ConversorTemperaturas {

    private final float t = 80;

    public void centigradosAFharenheit() throws TemperaturaErradaExcepcion {
        String mensaje;
        float centigrados;
        mensaje = JOptionPane.showInputDialog("Teclea G. centigrados");
        centigrados = Float.parseFloat(mensaje);
        if (centigrados > t) {
            float fharenheit;
            fharenheit = (float) (9 / 5 * centigrados + 32.4);
            JOptionPane.showMessageDialog(null, "Los G.Fherenheit son " + fharenheit);
        }
            else
            throw new TemperaturaErradaExcepcion("Non pode ser maior de 80 G. centigrados");

        }
    

    public void centigradosAReimur() throws TemperaturaErradaExcepcion {

        String mensaje;
        float centigrados;
        mensaje = JOptionPane.showInputDialog("Teclea G. centigrados");
        centigrados = Float.parseFloat(mensaje);
        if(centigrados<t){
        float reamur;
        reamur = (float)4 / 5 * centigrados;
        JOptionPane.showMessageDialog(null, "Los G.Reamur son " + reamur);
        throw new TemperaturaErradaExcepcion("Los G.Fherenheit son " + reamur);
        }

    }

}

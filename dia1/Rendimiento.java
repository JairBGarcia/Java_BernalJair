/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia1;

/**
 *
 * @author jairb
 */

public class Rendimiento {
    public Camper camper;
    public double notaTeorica, notaPractica, notaFinal;

    public Rendimiento(Camper camper, double notaTeorica, double notaPractica) {
        this.camper = camper;
        this.notaTeorica = notaTeorica;
        this.notaPractica = notaPractica;
        this.notaFinal = (notaTeorica * 0.3) + (notaPractica * 0.6);
    }

    public boolean estaAprobado() {
        return notaFinal >= 60;
    }
}


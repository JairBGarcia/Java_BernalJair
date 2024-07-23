/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia1;

/**
 *
 * @author jairb
 */
public class Coordinadores extends Roles {
    public Coordinadores() {
        super("Coordinador");
    }

    public void registrarNota(Camper camper, double notaTeorica, double notaPractica) {
        double notaFinal = (notaTeorica * 0.3) + (notaPractica * 0.6);
        if (notaFinal >= 60) {
            camper.estado = "Aprobado";
        }else{
            camper.estado = "Reprobado";
        }
    }
}


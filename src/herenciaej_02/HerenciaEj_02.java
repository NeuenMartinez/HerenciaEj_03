/*
 * @author NeuenMartinez
 */
package HerenciaEj_02;

import Entidades.Lavadora;
import Entidades.Televisor;


public class HerenciaEj_02 {

    public static void main(String[] args) {

        Lavadora Lavadora1 = new Lavadora();
        Lavadora1.crearLavadora();
        Televisor TV1 = new Televisor();
        TV1.crearTelevisor();      
        System.out.println(Lavadora1);
        System.out.println(TV1);
    }

}
/*
 * @author NeuenMartinez
 */
package HerenciaEj_02;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

public class HerenciaEj_02 {

    public static void main(String[] args) {
        
        Double SumaTotal = 0d;
        List<Electrodomestico> ListaElectrodomesticos = new ArrayList<>();
        Lavadora lavadora1 = new Lavadora(35d, 1000d, "Blanco", "A", 90d);
        lavadora1.precioFinalLavadora();
        Lavadora lavadora2 = new Lavadora(15d, 1000d, "Negro", "C", 75d);
        lavadora2.precioFinalLavadora();
        Televisor TV1 = new Televisor(52, Boolean.TRUE, 1000d, "Negro", "A", 20d);
        TV1.precioFinalTV();
        Televisor TV2 = new Televisor(68, Boolean.FALSE, 1000d, "Negro", "A", 25d);
        TV2.precioFinalTV();
        ListaElectrodomesticos.add(lavadora1);
        ListaElectrodomesticos.add(lavadora2);
        ListaElectrodomesticos.add(TV1);
        ListaElectrodomesticos.add(TV2);
        
        for (Electrodomestico aux : ListaElectrodomesticos) {
            aux.precioFinal();
            System.out.println(aux);
            SumaTotal = SumaTotal + aux.getPrecio();
        }
        
        System.out.println("El total de los electrodomesticos es: $" + SumaTotal);

    }

}

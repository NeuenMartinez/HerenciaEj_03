package Entidades;

import Enumeraciones.Colores;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    protected Double precio;
    protected String color;
    protected String consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumoEnergetico(String letra) {

        switch (letra) {
            case "A":
                consumo = "A";
                break;
            case "B":
                consumo = "B";
                break;
            case "C":
                consumo = "C";
                break;
            case "D":
                consumo = "D";
                break;
            case "E":
                consumo = "E";
                break;
            case "F":
                consumo = "F";
                break;
            default:
                consumo = "F";
        }
    }

    protected void comprobarColor(String col) {
        boolean check = false;
        for (Colores aux : Colores.values()) {
            if (aux.toString().equalsIgnoreCase(col)) {
                color = aux.toString().toUpperCase();
                check = true;

            }
            if (check = false) {
                color = "BLANCO";
            }
        }
    }

    public void crearElectrodomestico() {
        precio = 1000.0;
        System.out.println("INGRESAR LOS DATOS DEL ELECTRODOMESTICO");
        System.out.println("INGRESAR EL COLOR:");
        String col = leer.next();
        comprobarColor(col);
        System.out.println("INGRESAR LA LETRA DEL CONSUMO: (A-F)");
        String let = leer.next().substring(0, 1);
        comprobarConsumoEnergetico(let.toUpperCase());
        System.out.println("INGRESAR EL PESO:");
        peso = leer.nextDouble();
        precioFinal();
    }

    protected void precioFinal() {

        switch (consumo) {
            case "A":
                precio = precio + 1000;
                break;
            case "B":
                precio = precio + 800;
                break;
            case "C":
                precio = precio + 600;
                break;
            case "D":
                precio = precio + 500;
                break;
            case "E":
                precio = precio + 300;
                break;
            case "F":
                precio = precio + 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precio = precio + 100;
        } else if (peso >= 20 && peso <= 49) {
            precio = precio + 500;
        } else if (peso >= 50 && peso <= 79) {
            precio = precio + 800;
        } else if (peso >= 80) {
            precio = precio + 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "Precio: " + precio + ", Color: " + color + ", Consumo: " + consumo + ", Peso: " + peso + '}';
    }
    
    
}

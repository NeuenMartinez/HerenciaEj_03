package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public final class Lavadora extends Electrodomestico{

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    public void  crearLavadora (){
        System.out.println("LAVADORA:");
        crearElectrodomestico();
        System.out.println("INGRESAR LA CARGA MAXIMA DE LA LAVADORA");
        carga = leer.nextDouble();
        precioFinalLavadora();
    }
    

    public void precioFinalLavadora(){
        if (carga >= 30){
            precio = precio + 500;
        }  
    }

    @Override
    public String toString() {
        return "Lavadora{" + "Precio: " + precio + ", Color: " + color + ", Consumo: " + consumo + ", Peso: " + peso + ", Carga: " + carga + '}';
    }
    
    
}

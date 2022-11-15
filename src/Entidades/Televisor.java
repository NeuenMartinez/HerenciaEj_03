package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public final class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Double precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        boolean loop1 = false;
        System.out.println("TELEVISOR");
        crearElectrodomestico();
        System.out.println("INGRESAR LA RESOLUCION DEL TV: (PULGADAS)");
        resolucion = leer.nextInt();
        do {
            System.out.println("INGRESAR SI EL TV TIENE SINTONIZADOR TDT: (s/n)");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("s")) {
                sintonizadorTDT = true;
                loop1 = true;
            } else if (resp.equalsIgnoreCase("n")) {
                sintonizadorTDT = false;
                loop1 = true;
            } else {
                System.out.println("LA RESPUESTA INGRESADA ES INCORRECTA, UTILIZAR SOLO (s/n), INTENTE NUEVAMENTE...");
            }
        } while (loop1 == false);
        precioFinalTV();
    }
    
    protected void  precioFinalTV(){
        if (resolucion > 40){
            precio = precio + (precio * 0.3);
        }
        if (sintonizadorTDT){
            precio = precio + 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "Precio: " + precio + ", Color: " + color + ", Consumo: " + consumo + ", Peso: " + peso + ", Resolucion: " + resolucion + "''" + ", SintonizadorTDT: " + sintonizadorTDT + '}';
    }
    
    
}

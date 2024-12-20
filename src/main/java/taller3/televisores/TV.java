package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal) {
        if (estado && canal >= 1 && canal <= 120) { // Validar que esté encendido y dentro del rango
            this.canal = canal;
        }    
    }
    
    public Marca getMarca(){
        return this.marca;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    } 
    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    } 
    
    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        if ( volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    } 

    public Control getControl(){
        return this.control;
    }

    public void setControl(Control control){
        this.control = control;
    } 
    
    public static int getNumTV(){
        return TV.numTV;
    }

    public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public void canalUp() {
        if (estado && canal < 120) { // Validar límites y estado
            canal++;
        }
    }
    
    public void canalDown() {
        if (estado && canal > 1) { // Validar límites y estado
            canal--;
        }
    }    

    public void volumenUp(){
        if ((estado == true) && volumen<7){
            volumen++;
        }
    }

    public void volumenDown(){
        if ((estado == true) && volumen>0){
            volumen--;
        }
    }
}

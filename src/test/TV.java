package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.canal = 1;
        this.precio = 500;
        this.estado = estado;
        this.volumen = 1;
        numTV++;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal){
        this.canal = canal;
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

    public void setVolumen(int volumen){
        this.volumen = volumen;
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

    public void canalUp(){
        if (estado == true && canal<120){
            canal++;
        }
    }

    public void canalDown(){
        if (estado == true && canal>1){
            canal--;
        }
    }

    public void volumenUp(){
        if (estado == true && volumen<7){
            volumen++;
        }
    }

    public void volumenDown(){
        if (estado == true && volumen>0){
            volumen--;
        }
    }
}

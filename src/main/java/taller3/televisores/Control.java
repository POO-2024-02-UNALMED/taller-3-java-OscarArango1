package taller3.televisores;

public class Control {
    private TV tv;

    public TV getTv(){
        return this.tv;
    }

    public void setTv(TV tv){
        this.tv = tv;
    }

    public void turnOn() {
        if (tv != null){
            tv.turnOn();
        }
    }

    public void turnOff(){
        if (tv != null){
            tv.turnOff();
        }
    }
    public void canalUp(){
        if (tv != null && tv.getEstado()){
            tv.canalUp();
        }
    }
    public void canalDown(){
        if (tv != null && tv.getEstado()){
            tv.canalDown();
        }
    }

    public void volumenUp(){
        if (tv != null){
            tv.volumenUp();
        }
    }
    public void volumenDown(){
        if (tv != null){
            tv.volumenDown();
        }
    }

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public void setVolumen(int volumen){
        if (tv != null){
            tv.setVolumen(volumen);
        }
    }

    public void setCanal(int canal){
        if (tv != null){
            tv.setCanal(canal);
        }
    }
}
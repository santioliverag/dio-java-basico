public class SmartTv {
    boolean encendida = false;
    int canal = 1;
    int volumen = 25;

    public void encender() {
        encendida = true;
    }
    public void apagar() {
        encendida = false;
    }

    public void aumentarCanal() {
        canal++;
    }
    public void disminuirCanal() {
        canal--;
    }
    public void seleccionarCanal(int nuevoCanal) {
        canal = nuevoCanal;
    }

    public void aumentarVolumen() {
        volumen++;
    }
    public void disminuirVolumen() {
    volumen--;
    }
}

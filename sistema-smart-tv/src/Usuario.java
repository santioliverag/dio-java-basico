public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV encendida? " + smartTv.encendida);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volumen: " + smartTv.volumen);

        smartTv.encender();
        System.out.println("Nuevo status - TV encendida? " + smartTv.encendida);

        smartTv.seleccionarCanal(13);
        System.out.println("Nuevo status - Canal: " + smartTv.canal);

        smartTv.aumentarVolumen();
        smartTv.aumentarVolumen();
        System.out.println("Nuevo status - Volumen: " + smartTv.volumen);

    }
}

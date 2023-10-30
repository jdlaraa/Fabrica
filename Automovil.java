public class Automovil extends Vehiculo implements ITransporte {

    public Automovil() {
    }

    public Automovil(String nombre, String marca, String modelo, String color) {
        super(nombre, marca, modelo, color);
    }

    @Override
    public void encender() {
        System.out.println("El Automovil esta encendido... ");

    }

    @Override
    public void arrancar() {
        System.out.println("El Automovil arranco...");
    }

    @Override
    public void detener() {
        System.out.println("El Automovil esta detenido...");

    }

    @Override
    public void apagar() {
        System.out.println("El Automovil esta apagado...");

    }

}

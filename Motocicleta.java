public class Motocicleta extends Vehiculo implements ITransporte {

    public Motocicleta() {
    }

    public Motocicleta(String nombre, String marca, String modelo, String color) {
        super(nombre, marca, modelo, color);
    }

    @Override
    public void encender() {
        System.out.println("La Motocicleta esta encendida... ");

    }

    @Override
    public void arrancar() {
        System.out.println("La Motocicleta arranco... ");
    }

    @Override
    public void detener() {
        System.out.println("La Motocicleta esta detenida...  ");

    }

    @Override
    public void apagar() {
        System.out.println("La Motocicleta esta apagada... ");

    }
}

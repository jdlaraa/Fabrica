public class Vehiculo {

    private String nombre;
    private String marca;
    private String modelo;
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(String nombre, String marca, String modelo, String color) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

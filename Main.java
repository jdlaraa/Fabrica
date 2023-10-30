import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("args = " + args);

        int opc = 0;

        do {
            System.out.println("----------------------------------- \n" +
                    "Fabrica Medios de Transporte" +
                    " \nIngrese un medio de transporte a fabricar: " +
                    " \n -----------------------------------" +
                    " \n 1. Crear Automovil " +
                    " \n 2. Crear Motocicleta " +
                    " \n 3. Salir" +
                    " \n -----------------------------------");
            Scanner sc = new Scanner(System.in);
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del Automovil");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la marca del Automovil");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese el modelo del Automovil");
                    String modelo = sc.nextLine();
                    System.out.println("Ingrese el color del Automovil");
                    String color = sc.nextLine();
                    System.out.println("Ingrese la marca del radio");
                    String radio = sc.nextLine();
                    Automovil automovil = new Automovil(nombre, marca, modelo, color);
                    Radio radiom = new Radio(radio);

                    System.out.println("----------------------------------- \n " +
                            "El carro fabricado es: \n Nombre: " + nombre + " \n Marca: " + marca + "\n Modelo: " + modelo +
                            "\n color: " + color + "\n Radio: " + radio + " \n----------------------------------- \n ");

                    int opc1 = 0;
                    do {
                        System.out.println("----------------------------------- \n " +
                                "Seleccione una funcion a realizar" +
                                "\n -----------------------------------" +
                                "\n 1. Encender " +
                                "\n 2. Arrancar " +
                                "\n 3. detener " +
                                "\n 4. Apagar " +
                                "\n 5. Salir" +
                                "\n -----------------------------------");

                        opc1 = Integer.parseInt(sc.nextLine());
                        switch (opc1) {
                            case 1:
                                automovil.encender();
                                break;
                            case 2:
                                automovil.arrancar();
                                break;
                            case 3:
                                automovil.detener();
                                break;
                            case 4:
                                automovil.apagar();
                                break;
                            case 5:
                                System.out.println("Salir");
                                opc = 0;
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                        }
                    } while (opc1 < 5);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la Motocicleta");
                    String nombrem = sc.nextLine();
                    System.out.println("Ingrese la marca de la Motocicleta");
                    String marcam = sc.nextLine();
                    System.out.println("Ingrese el modelo de la Motocicleta");
                    String modelom = sc.nextLine();
                    System.out.println("Ingrese el color de la Motocicleta");
                    String colorm = sc.nextLine();
                    Motocicleta motocicleta = new Motocicleta(nombrem, marcam, modelom, colorm);
                    int opc2 = 0;
                    do {
                        System.out.println("------------------------- \n " +
                                "Seleccione una funcion a realizar" +
                                "\n 1. Encender " +
                                "\n 2. Arrancar " +
                                "\n 3. detener " +
                                "\n 4. Apagar " +
                                "\n 5. Salir" +
                                "\n -----------------------------------");

                        opc2 = Integer.parseInt(sc.nextLine());
                        switch (opc2) {
                            case 1:
                                motocicleta.encender();
                                break;
                            case 2:
                                motocicleta.arrancar();
                                break;
                            case 3:
                                motocicleta.detener();
                                break;
                            case 4:
                                motocicleta.apagar();
                                break;
                            case 5:
                                System.out.println("Salir");
                                opc = 0;
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                        }
                    } while (opc2 < 5);
                    break;
                default:
                    System.out.println("Salir");
            }
        } while (opc < 3);
    }
}

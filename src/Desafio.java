import java.util.Scanner;

public class Desafio {

    Scanner teclado;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte sesion = 0;
        String nombreCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;


        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $" + saldo);
        System.out.println("");
        System.out.println("*****************************************");

        while (sesion != 9){
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            System.out.println("");
            sesion = teclado.nextByte();

            switch (sesion){
                case 1 -> System.out.println("El saldo actual de tu cuenta es de $" + saldo);

                case 2 -> {
                    double retiro = 0;
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    retiro = teclado.nextDouble();
                    saldo -= retiro;
                    System.out.println("Tu saldo restante es de $" + saldo);
                }

                case 3 -> {
                    double abono = 0;
                    System.out.println("¿Cuál es el valor que desea abonar?");
                    abono = teclado.nextDouble();
                    saldo += abono;
                    System.out.println("Tu saldo restante es de $" + saldo);
                }

                case 9 -> System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                default -> System.out.println("Por favor vuelve a intentar con otra opción");
            }

        }
    }

}

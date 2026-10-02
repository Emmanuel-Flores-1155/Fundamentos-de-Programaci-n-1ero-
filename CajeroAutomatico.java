import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int LIMITE_RETIRO = 5000;
        double saldo, deposito, retiro;
        int opcion;

        System.out.println("==== BIENVENIDO AL CAJERO ====");
        System.out.print("Ingrese el saldo disponible de su cuenta: $");
        saldo = entrada.nextDouble();
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Deposito");
        System.out.println("2. Retiro");
        System.out.println("3. Ver Saldo");
        System.out.println("4. Salir");

        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad a depositar: $");
            deposito = entrada.nextDouble();
            if (deposito <= 0) {
                System.out.println("Error, la cantidad a depositar debe ser mayor a 0");
            } else {
                saldo = saldo + deposito;
                System.out.println("Operación realizada, su nuevo saldo es: $" + saldo);
            }
        }

        if (opcion == 2) {

            System.out.println("CANTIDAD DISPONIBLE: $" + saldo);
            System.out.println("LIMITE DE RETIRO: $" + LIMITE_RETIRO);
            System.out.print("Ingrese la cantidad a retirar: $");
            retiro = entrada.nextDouble();

            if (retiro <= 0) {
                System.out.println("Error al retirar, la cantidad debe ser mayor a 0");
            } else {
                if (retiro > LIMITE_RETIRO) {
                    System.out.println("Error, el retiro supera el limite de: $" + LIMITE_RETIRO);
                } else {
                    if (retiro > saldo) {
                        System.out.println("Error al retirar, saldo insuficiente");
                    } else {
                        saldo = saldo - retiro;
                        System.out.println("Operación realizada, su saldo es: $" + saldo);
                        System.out.println("Efectivo entregado: $" + retiro);
                        if (saldo < 500) {
                            System.out.println("ADVERTENCIA, SU SALDO RESTANTE ES MENOR A $500");
                            System.out.println("SALDO RESTANTE: $" + saldo);
                        }
                    }
                }
            }
        }

        if (opcion == 3) {
            System.out.println("CANTIDAD DISPONIBLE: $" + saldo);
        }

        if (opcion == 4) {
            System.out.println("Gracias por usar el cajero, ¡HASTA PRONTO!");
        }
    }
}
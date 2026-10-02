import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double CLIENTE_FRECUENTE = 0.10;
        final double CLIENTE_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;
        double montoCompra, total, descuento, descuento2;
        int tipoCliente;
        String nombre;

        System.out.println("----BIENVENIDO AL SUPERMERCADO----");
        System.out.println("----------------------------------");
        System.out.println("USTED HA LLEGADO A LA CAJA DE COBRÓ");
        System.out.print("INGRESE SU NOMBRE: ");
        nombre = entrada.nextLine();
        System.out.print("INGRESE EL TOTAL DE SU COMPRA: $");
        montoCompra = entrada.nextDouble();

        System.out.println("ES USTED UN CLIENTE: ");
        System.out.println("1. Cliente normal");
        System.out.println("2. Cliente frecuente");
        System.out.println("3. Cliente VIP");
        tipoCliente = entrada.nextInt();

        if (tipoCliente == 1) {
            if (montoCompra >= 2000) {
                descuento = montoCompra * DESCUENTO_ADICIONAL;
                total = montoCompra - descuento;
                System.out.println("NOMBRE: " + nombre);
                System.out.println("ES USTED UN CLIENTE NORMAL, PERO OBTUVO 5% DE DESCUENTO");
                System.out.println("DESCUENTO DE SU COMPRA: " + descuento);
                System.out.println("TOTAL DE SU COMPRA: $" + total);
                System.out.println("HASTA PRONTO");
            } else {
                System.out.println("NOMBRE: " + nombre);
                System.out.println("USTED NO TIENE DESCUENTO POR SU COMPRA");
                System.out.println("TOTAL DE SU COMPRA: $" + montoCompra);
                System.out.println("HASTA PRONTO");
            }
        }

        if (tipoCliente == 2) {
            if (montoCompra >= 2000) {
                descuento = montoCompra * (CLIENTE_FRECUENTE + DESCUENTO_ADICIONAL);
                descuento2 = montoCompra * CLIENTE_FRECUENTE;
                total = montoCompra - descuento;
                System.out.println("NOMBRE: " + nombre);
                System.out.println("ES USTED UN CLIENTE FRECUENTE, Y OBTUVO 5% DE DESCUENTO ADICIONAL");
                System.out.println("DESCUENTO DE CLIENTE FRECUENTE: $" + descuento2);
                System.out.println("DESCUENTO ADICIONAL: $" + (montoCompra * DESCUENTO_ADICIONAL));
                System.out.println("DESCUENTO TOTAL DE SU COMPRA: " + descuento);
                System.out.println("TOTAL DE SU COMPRA: $" + total);
                System.out.println("HASTA PRONTO");
            } else {
                descuento = montoCompra * CLIENTE_FRECUENTE;
                total = montoCompra - descuento;
                System.out.println("NOMBRE: " + nombre);
                System.out.println("USTED TIENE 10% DE DESCUENTO POR SER CLIENTE FRECUENTE");
                System.out.println("DESCUENTO DE SU COMPRA: $" + descuento);
                System.out.println("TOTAL DE SU COMPRA: $" + total);
                System.out.println("HASTA PRONTO");
            }
        }

        if (tipoCliente == 3) {
            if (montoCompra >= 2000) {
                descuento = montoCompra * (CLIENTE_VIP + DESCUENTO_ADICIONAL);
                descuento2 = montoCompra * CLIENTE_VIP;
                total = montoCompra - descuento;
                System.out.println("NOMBRE: " + nombre);
                System.out.println("ES USTED UN CLIENTE VIP, Y OBTUVO 5% DE DESCUENTO ADICIONAL");
                System.out.println("DESCUENTO DE CLIENTE VIP: $" + descuento2);
                System.out.println("DESCUENTO ADICIONAL: $" + (montoCompra * DESCUENTO_ADICIONAL));
                System.out.println("DESCUENTO TOTAL DE SU COMPRA: " + descuento);
                System.out.println("TOTAL DE SU COMPRA: $" + total);
                System.out.println("HASTA PRONTO");
            } else {
                descuento = montoCompra * CLIENTE_VIP;
                total = montoCompra - descuento;
                System.out.println("NOMBRE: " + nombre);
                System.out.println("USTED TIENE 20% DE DESCUENTO POR SER CLIENTE VIP");
                System.out.println("DESCUENTO DE SU COMPRA: $" + descuento);
                System.out.println("TOTAL DE SU COMPRA: $" + total);
                System.out.println("HASTA PRONTO");
            }
        }
    }
}

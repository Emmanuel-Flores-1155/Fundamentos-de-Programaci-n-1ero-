import java.util.Scanner;

public class Practica7Compra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int ENVIO = 80;
        int cantidad;
        double precio, descuento;

        System.out.println("=== HOLA BIENVENIDO ===");
        System.out.print("INGRESA EL PRECIO DEL PRODUCTO: $");
        precio = entrada.nextInt();
        System.out.print("INGRESA LA CANTIDAD DE PRODUCTOS QUE DESEAS LLEVAR: ");
        cantidad = entrada.nextInt();

        if ((cantidad * precio) < 1000) {
            System.out.println("PRECIO DEL PRODUCTO: $" + precio);
            System.out.println("CANTIDAD: " + cantidad);
            System.out.println("SU COMPRA NO APLICA DESCUENTO");
            System.out.println("COSTO DE ENVIO: $" + ENVIO);
            System.out.println("TOTAL: $" + ((cantidad * precio) + ENVIO));
        } else {
            descuento = (cantidad * precio) / 10;
            System.out.println("PRECIO DEL PRODUCTO: $" + precio);
            System.out.println("CANTIDAD: " + cantidad);
            System.out.println("DESCUENTO: $" + descuento);
            System.out.println("TOTAL CON SU DESCUENTO: $" + ((cantidad * precio) - descuento));

            if (((cantidad * precio) - descuento) >= 1500) {
                System.out.println("SU COMPRA ES CON ENVIO GRATIS");
                System.out.println("TOTAL: $" + ((cantidad * precio) - descuento));
            } else {
                System.out.println("SU COMPRA TIENE UN COSTO DE ENVIO: $" + ENVIO);
                System.out.println("TOTAL: $" + ((cantidad * precio) - descuento + ENVIO));
            }
        }
    }
}
import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int MOTOCICLETA = 10;
        final int AUTOMOVIL = 20;
        final int CAMIONETA = 30;
        final double DESCUENTO1 = 0.10;
        final double DESCUENTO2 = 0.20;

        double subtotal, total, descuento;
        int tipoVehiculo, horas;

        System.out.println("===== ESTACIONAMIENTO =====");
        System.out.println("1. MOTOCICLETA");
        System.out.println("2. AUTOMOVIL");
        System.out.println("3. CAMIONETA");
        System.out.print("¿QUE TIPO DE VEHICULO ESTACIONASTE?: ");
        tipoVehiculo = entrada.nextInt();
        System.out.print("¿CUANTAS HORAS ESTUVO ESTACIONADO?: ");
        horas = entrada.nextInt();

        if (horas <= 0) {
            System.out.println("LA CANTIDAD DE HORAS NO ES VALIDA");
        } else {
            if (tipoVehiculo == 1) {
                subtotal = horas * MOTOCICLETA;
                if (horas > 10) {
                    descuento = subtotal * DESCUENTO2;
                    total = subtotal - descuento;
                } else {
                    if (horas > 5) {
                        descuento = subtotal * DESCUENTO1;
                        total = subtotal - descuento;
                    } else {
                        descuento = 0;
                        total = subtotal;
                    }
                }
                System.out.println("TIPO DE VEHICULO ESTACIONADO: MOTOCICLETA");
                System.out.println("HORAS ESTACIONADO: " + horas);
                System.out.println("TARIFA DE ESTACIONAMIENTO: $" + MOTOCICLETA);
                System.out.println("SUBTOTAL: $" + subtotal);
                System.out.println("DESCUENTO: $" + descuento);
                System.out.println("TOTAL A PAGAR: $" + total);
            } else {
                if (tipoVehiculo == 2) {
                    subtotal = horas * AUTOMOVIL;
                    if (horas > 10) {
                        descuento = subtotal * DESCUENTO2;
                        total = subtotal - descuento;
                    } else {
                        if (horas > 5) {
                            descuento = subtotal * DESCUENTO1;
                            total = subtotal - descuento;
                        } else {
                            descuento = 0;
                            total = subtotal;
                        }
                    }
                    System.out.println("TIPO DE VEHICULO ESTACIONADO: AUTOMOVIL");
                    System.out.println("HORAS ESTACIONADO: " + horas);
                    System.out.println("TARIFA DE ESTACIONAMIENTO: $" + AUTOMOVIL);
                    System.out.println("SUBTOTAL: $" + subtotal);
                    System.out.println("DESCUENTO: $" + descuento);
                    System.out.println("TOTAL A PAGAR: $" + total);
                } else {
                    if (tipoVehiculo == 3) {
                        subtotal = horas * CAMIONETA;
                        if (horas > 10) {
                            descuento = subtotal * DESCUENTO2;
                            total = subtotal - descuento;
                        } else {
                            if (horas > 5) {
                                descuento = subtotal * DESCUENTO1;
                                total = subtotal - descuento;
                            } else {
                                descuento = 0;
                                total = subtotal;
                            }
                        }
                        System.out.println("TIPO DE VEHICULO ESTACIONADO: CAMIONETA");
                        System.out.println("HORAS ESTACIONADO: " + horas);
                        System.out.println("TARIFA DE ESTACIONAMIENTO: $" + CAMIONETA);
                        System.out.println("SUBTOTAL: $" + subtotal);
                        System.out.println("DESCUENTO: $" + descuento);
                        System.out.println("TOTAL A PAGAR: $" + total);
                    } else {
                        System.out.println("TIPO DE VEHICULO NO VALIDO");
                    }
                }
            }
        }
    }
}
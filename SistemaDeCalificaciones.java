import java.util.Scanner;

public class SistemaDeCalificaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int MINIMO_APROBATORIO = 70;
        final int MINIMO_UNIDAD = 60;
        int calificacion1, calificacion2, calificacion3, promedio;

        System.out.println("==== BIENVENIDO AL SISTEMA DE CALIFICACIONES ====");
        System.out.println("Ingresa las calificaciones de las 3 unidades para calcular su promedio:");
        System.out.println("La calificación debe ser de 0 a 100");

        System.out.print("Calificación de UNIDAD 1: ");
        calificacion1 = entrada.nextInt();
        System.out.print("Calificación de UNIDAD 2: ");
        calificacion2 = entrada.nextInt();
        System.out.print("Calificación de UNIDAD 3: ");
        calificacion3 = entrada.nextInt();

        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        if (calificacion1 <= MINIMO_UNIDAD) {
            System.out.println("USTED HA SACADO CALIFICACIÓN BAJA EN LA UNIDAD 1");
            System.out.println("Deberá presentarse para recuperar esta unidad");
            System.out.println("Calificación: " + calificacion1);
        } else {
            if (calificacion2 <= MINIMO_UNIDAD) {
                System.out.println("USTED HA SACADO CALIFICACIÓN BAJA EN LA UNIDAD 2");
                System.out.println("Deberá presentarse para recuperar esta unidad");
                System.out.println("Calificación: " + calificacion2);
            } else {
                if (calificacion3 <= MINIMO_UNIDAD) {
                    System.out.println("USTED HA SACADO CALIFICACIÓN BAJA EN LA UNIDAD 3");
                    System.out.println("Deberá presentarse para recuperar esta unidad");
                    System.out.println("Calificación: " + calificacion3);
                } else {
                    if (promedio >= MINIMO_APROBATORIO) {
                        System.out.println("HAS APROBADO LA MATERIA, FELICITACIONES");
                        System.out.println("CALIFICACION 1: " + calificacion1);
                        System.out.println("CALIFICACION 2: " + calificacion2);
                        System.out.println("CALIFICACION 3: " + calificacion3);
                        System.out.println("SU CALIFICACIÓN FINAL ES: " + promedio);
                    } else {
                        System.out.println("HAS REPROBADO LA MATERIA");
                        System.out.println("CALIFICACION 1: " + calificacion1);
                        System.out.println("CALIFICACION 2: " + calificacion2);
                        System.out.println("CALIFICACION 3: " + calificacion3);
                        System.out.println("SU CALIFICACIÓN FINAL ES: " + promedio);
                    }
                }
            }
        }
    }
}

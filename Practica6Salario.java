import java.util.Scanner;

public class Practica6Salario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int HORAS_MAXIMAS = 40;
        String nombre;
        int horas;
        double salarioHora, salarioTotal;

        System.out.println("=== BIENVENIDO AL SISTEMA DE CALCULO DE SALARIO ===");
        System.out.print("INGRESA TU NOMBRE: ");
        nombre = entrada.nextLine();
        System.out.print("INGRESA HORAS TRABAJADAS EN LA SEMANA: ");
        horas = entrada.nextInt();
        System.out.print("INGRESA TU SALARIO POR HORA: $");
        salarioHora = entrada.nextDouble();

        if (horas > HORAS_MAXIMAS) {
            int horasExtra = horas - HORAS_MAXIMAS;
            salarioTotal = (HORAS_MAXIMAS * salarioHora) + (horasExtra * salarioHora * 2);
            System.out.println("=== RESULTADOS ===");
            System.out.println("NOMBRE DE EMPLEADO: " + nombre);
            System.out.println("TOTAL DE HORAS TRABAJADAS: " + horas);
            System.out.println("HORAS NORMALES: " + HORAS_MAXIMAS);
            System.out.println("HORAS EXTRAS: " + horasExtra);
            System.out.println("SALARIO TOTAL: $" + salarioTotal);
        } else {
            salarioTotal = horas * salarioHora;
            System.out.println("=== RESULTADOS ===");
            System.out.println("NOMBRE DE EMPLEADO: " + nombre);
            System.out.println("TOTAL DE HORAS TRABAJADAS: " + horas);
            System.out.println("HORAS NORMALES: " + horas);
            System.out.println("HORAS EXTRAS: 0");
            System.out.println("SALARIO TOTAL: $" + salarioTotal);
        }
    }
}

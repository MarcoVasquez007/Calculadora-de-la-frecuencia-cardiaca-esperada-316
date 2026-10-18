import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su día de nacimiento (1-31): ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese su mes de nacimiento (1-12): ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese su año de nacimiento (ej. 1995): ");
        int anio = entrada.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        System.out.println("\n========================================");
        System.out.println("INFORMACIÓN DEL PACIENTE Y FRECUENCIAS");
        System.out.println("========================================");
        System.out.println("Nombre completo: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Fecha de nacimiento: " + persona.getDiaNacimiento() + "/" + persona.getMesNacimiento() + "/" + persona.getAnioNacimiento());
        System.out.println("Edad: " + persona.obtenerEdad() + " años");
        System.out.println("Frecuencia cardíaca máxima: " + persona.obtenerFrecuenciaCardiacaMaxima() + " bpm");
        System.out.println("Rango de frecuencia cardíaca esperada: " + persona.obtenerFrecuenciaCardiacaEsperada());

        entrada.close();
    }
}
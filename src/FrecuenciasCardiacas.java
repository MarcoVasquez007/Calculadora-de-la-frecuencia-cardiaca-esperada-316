import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String nombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int obtenerEdad() {
        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    public int obtenerFrecuenciaCardiacaMaxima() {
        return 220 - obtenerEdad();
    }

    public String obtenerFrecuenciaCardiacaEsperada() {
        int max = obtenerFrecuenciaCardiacaMaxima();
        double minEsperada = max * 0.50;
        double maxEsperada = max * 0.85;
        return String.format("%.1f - %.1f bpm", minEsperada, maxEsperada);
    }
}
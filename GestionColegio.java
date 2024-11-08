import java.util.Set;
import java.util.List;

public class GestionColegio {

    public static boolean gestionarPaseDeAnio(IEvaluable alumno) {
        List<Integer> notas;
        if (alumno instanceof AlumnoPrimaria) {
            notas = ((AlumnoPrimaria) alumno).getNotasDirectamente();
        } else if (alumno instanceof AlumnoSecundaria) {
            notas = ((AlumnoSecundaria) alumno).getNotasDirectamente();
        } else {
            throw new IllegalArgumentException("Tipo de alumno no soportado");
        }
        return calcularSiPasaDeAnio(notas);
    }

    private static boolean calcularSiPasaDeAnio(List<Integer> notas) {
        if (notas.isEmpty()) {
            return false;
        }

        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        double promedio = suma / (double)notas.size();
        return promedio >= 6.0;
    }

    public static long contarAlumnosJardin(Set<Alumno> alumnado) {
        long contador = 0;
        for (Alumno alumno : alumnado) {
            if (alumno instanceof AlumnoJardin) {
                contador++;
            }
        }
        return contador;
    }
}
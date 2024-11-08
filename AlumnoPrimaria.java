import java.util.List;
import java.util.ArrayList;

public final class AlumnoPrimaria extends Alumno implements IEvaluable {
    private List<Integer> notas;
    private static int countAlumnosPrimaria = 0;

    public AlumnoPrimaria(){
        super();
        this.notas = new ArrayList<>();
        countAlumnosPrimaria++;
    }

    public AlumnoPrimaria(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        countAlumnosPrimaria++;
        this.notas = new ArrayList<>();
    }

    public static int getCountAlumnosPrimaria() {
        return countAlumnosPrimaria;
    }

    @Override
    public void cargarNotas(int nota) {
        if (this.notas.size() < 10) {
            this.notas.add(nota);
        }
    }

    @Override
    public void mostrarNotas() {
        System.out.print("Notas: ");
        for (int nota : this.notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public List<Integer> getNotasDirectamente() {
        return this.notas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alumnos de Primaria: " + countAlumnosPrimaria;
    }
}
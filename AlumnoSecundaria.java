import java.util.ArrayList;
import java.util.List;

public final class AlumnoSecundaria extends Alumno implements IEvaluable {
    private boolean mayorDeEdad;
    private List<Integer> notas;

    public AlumnoSecundaria(){
        super();
        this.mayorDeEdad = false;
        this.notas = new ArrayList<>();
    }

    public AlumnoSecundaria(String nombre, String apellido, String dni, boolean mayorDeEdad) {
        super(nombre, apellido, dni);
        this.mayorDeEdad = mayorDeEdad;
        this.notas = new ArrayList<>();
    }

    public boolean isMayorDeEdad() {
        return mayorDeEdad;
    }

    public void setMayorDeEdad(boolean mayorDeEdad) {
        this.mayorDeEdad = mayorDeEdad;
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
        return super.toString() + ", Mayor de Edad: " + mayorDeEdad;
    }
}
public final class AlumnoJardin extends Alumno implements IAlumnoJardin {
    private TipoJardin tipoJardin;

    public AlumnoJardin(String nombre, String apellido, String dni, TipoJardin tipoJardin) {
        super(nombre, apellido, dni);
        this.tipoJardin = tipoJardin;
    }

    public TipoJardin getTipoJardin() {
        return tipoJardin;
    }

    public void setTipoJardin(TipoJardin tipoJardin) {
        this.tipoJardin = tipoJardin;
    }

    @Override
    public void cambiar() {
        System.out.println(super.getNombre() + " " + super.getApellido() + " ha sido cambiado de pañal.");
    }

    @Override
    public void darAlmuerzo() {
        System.out.println(super.getNombre() + " " + super.getApellido() + " ha recibido su almuerzo.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Jardín: " + tipoJardin;
    }
}
public abstract class Alumno implements IAlumno, Comparable<Alumno> {
    private String nombre;
    private String apellido;
    private String dni;

    public Alumno(){
        this.nombre = null;
        this.apellido = null;
        this.dni = null;
    }

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public void alta() {
        System.out.println(nombre + " " + apellido + " ha sido dado de alta.");
    }

    @Override
    public void baja() {
        System.out.println(nombre + " " + apellido + " ha sido dado de baja.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni;
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno alumno = (Alumno) obj;
        return dni.equals(alumno.dni);
    }

    @Override
    public int compareTo(Alumno other) {
        int lastNameComparison = this.apellido.compareTo(other.apellido);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return this.nombre.compareTo(other.nombre);
    }
}
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        // Crear instancias de AlumnoSecundaria
        AlumnoSecundaria alumnoSecundaria1 = new AlumnoSecundaria("Juan", "Pérez", "12345678", true);
        AlumnoSecundaria alumnoSecundaria2 = new AlumnoSecundaria("Ana", "Gómez", "87654321", false);
        AlumnoSecundaria alumnoSecundaria3 = new AlumnoSecundaria("Ana", "Gómez", "87654321", false);


        // Crear instancias de AlumnoPrimaria
        AlumnoPrimaria alumnoPrimaria1 = new AlumnoPrimaria("María", "López", "11223344");
        AlumnoPrimaria alumnoPrimaria2 = new AlumnoPrimaria("Pedro", "Martínez", "44332211");

        // Crear instancias de AlumnoJardin
        AlumnoJardin alumnoJardin1 = new AlumnoJardin("Sofía", "Rodríguez", "55667788", TipoJardin.MATERNAL);
        AlumnoJardin alumnoJardin2 = new AlumnoJardin("Lucía", "Fernández", "99887766", TipoJardin.PREESCOLAR);

        // Crear colección Alumnado

                    /*CREO UN TREESET YA QUE LA INTERFAZ SET NO PERMITE ELEMENTOS DUPLICADOS Y
                    ADEMAS EL TREESET ORDENA LOS ELEMENTOS DE FORMA ASCENDENTE POR DEFECTO
                     */
        TreeSet<Alumno> alumnado = new TreeSet<>();



        do {

            System.out.println("---------------INGRESE UNA OPCION------------");
            System.out.println("1.IMPLEMENTACION DE TODOS LOS METODOS DEL ALUMNO DE SECUNDARIA");
            System.out.println("2.IMPLEMENTACION DE TODOS LOS METODOS DEL ALUMNO DE PRIMARIA");
            System.out.println("3.IMPLEMENTACION DE TODOS LOS METODOS DEL ALUMNO DE JARDIN");
            System.out.println("4.AGREGO ALUMNOS A LA COLECCION ALUMNADO Y LOS MUESTRO");
            System.out.println("5.CONTAR ALUMNOS DE JARDIN");
            System.out.println("6.GESTIONO EL PASE DE AÑO");
            System.out.println("7.SALIR");
             opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc){

                case 1:
                    // Invocar métodos del alumno 1
                    alumnoSecundaria1.alta();
                    alumnoSecundaria1.cargarNotas(6);
                    alumnoSecundaria1.cargarNotas(7);
                    alumnoSecundaria1.cargarNotas(8);
                    alumnoSecundaria1.cargarNotas(9);
                    alumnoSecundaria1.cargarNotas(10);
                    alumnoSecundaria1.mostrarNotas();
                    alumnoSecundaria1.baja();
                     //invocar metodos del alumno 2
                    alumnoSecundaria2.alta();
                    alumnoSecundaria2.cargarNotas(5);
                    alumnoSecundaria2.cargarNotas(4);
                    alumnoSecundaria2.cargarNotas(3);
                    alumnoSecundaria2.cargarNotas(7);
                    alumnoSecundaria2.cargarNotas(8);
                    alumnoSecundaria2.mostrarNotas();
                    alumnoSecundaria2.baja();
                    break;


                case 2:
                    ///invocar metodos del alumno 1 de primaria
                    alumnoPrimaria1.alta();
                    alumnoPrimaria1.cargarNotas(1);
                    alumnoPrimaria1.cargarNotas(1);
                    alumnoPrimaria1.cargarNotas(2);
                    alumnoPrimaria1.cargarNotas(5);
                    alumnoPrimaria1.cargarNotas(6);
                    alumnoPrimaria1.mostrarNotas();
                    alumnoPrimaria1.baja();

                    //invocar metodos del alumno 2 de primaria
                    alumnoPrimaria2.alta();
                    alumnoPrimaria2.cargarNotas(5);
                    alumnoPrimaria2.cargarNotas(6);
                    alumnoPrimaria2.cargarNotas(7);
                    alumnoPrimaria2.cargarNotas(8);
                    alumnoPrimaria2.cargarNotas(9);
                    alumnoPrimaria2.mostrarNotas();
                    alumnoPrimaria2.baja();

                    break;

                case 3:
                    // Invocar métodos del alumno 1 de jardin
                    alumnoJardin1.alta();
                    alumnoJardin1.cambiar();
                    alumnoJardin1.darAlmuerzo();
                    alumnoJardin1.baja();
                    //invocar metodos del alumno 2 de jardin
                    alumnoJardin2.alta();
                    alumnoJardin2.cambiar();
                    alumnoJardin2.darAlmuerzo();
                    alumnoJardin2.baja();


                    break;

                case 4:

                    alumnado.add(alumnoSecundaria1);
                    alumnado.add(alumnoSecundaria2);
                    alumnado.add(alumnoPrimaria1);
                    alumnado.add(alumnoPrimaria2);
                    alumnado.add(alumnoJardin1);
                    alumnado.add(alumnoJardin2);

                     ///MUESTRO LA COLECCION ALUMNADO
                    Iterator<Alumno> it = alumnado.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                    break;





                case 5:

                    // Contar alumnos de jardín
                    long alumnosJardin = GestionColegio.contarAlumnosJardin(alumnado);
                    System.out.println("\nCantidad de alumnos de jardín: " + alumnosJardin);
                    break;

                case 6:

                    // Gestionar pase de año
                    System.out.println("Alumno " + alumnoPrimaria1.getNombre() + " " + alumnoPrimaria1.getApellido()
                            + (GestionColegio.gestionarPaseDeAnio(alumnoPrimaria1) ? " pasa de año." : " no pasa de año."));
                    System.out.println("Alumno " + alumnoSecundaria2.getNombre() + " " + alumnoSecundaria2.getApellido()
                            + (GestionColegio.gestionarPaseDeAnio(alumnoSecundaria2) ? " pasa de año." : " no pasa de año."));
                    break;

                case 7:
                    System.out.println("GRACIAS POR USAR NUESTRO SISTEMA");
                    System.exit(0);

                    break;


                default:
                    System.out.println("OPCION NO VALIDA.");
                    System.out.printf("SALIENDO DEL SISTEMA...");
                    break;

        }



        }while(opc>0 && opc<8);




    }
}

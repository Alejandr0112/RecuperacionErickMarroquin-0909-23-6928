import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n====================");
            System.out.println("       Menu");
            System.out.println("====================");
            System.out.println("1. Calculadora basica");
            System.out.println("2. Clase vacía - N/A");
            System.out.println("3. Administrador de estudiantes");
            System.out.println("4. Anadir estudiantes");
            System.out.println("5. Lista de estudiantes");
            System.out.println("6. Gestion de estudiantes");
            System.out.println("7. Salir");
            System.out.println("====================");
            System.out.print("Ingrese su opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menu.Calculadorabasica();
                    break;
                case 2:
                    menu.ClaseVacia();
                    break;
                case 3:
                    menu.AdministradorDeEstudiantes();
                    break;
                case 4:
                    menu.AnadirEstudiantes();
                    break;
                case 5:
                    menu.ListaDeEstudiantes();
                    break;
                case 6:
                    menu.gestionDeEstudiantes();
                    break;
                case 7:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error: Opción no valida. Por favor, seleccione una opción valida.");
                    break;
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingresa la operacion que deseas aplicar (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado;

        switch (operacion) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: Division por cero");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operacion no valida");
                scanner.close();
                return;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}

public class Catedratico {
    private String nombre;
    private int edad;
    private String especialidad;
    private String universidad;

    public Catedratico() {
    }

    public Catedratico(String nombre) {
        this.nombre = nombre;
    }

    public Catedratico(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}

public void listaDeEstudiantes() {
    System.out.println("Lista de estudiantes:");
    for (String estudiante : estudiantes) {
        System.out.println(estudiante);
    }
}

public void gestionDeEstudiantes() {
    boolean gestionSalir = false;

    while (!gestionSalir) {
        System.out.println("\n====================");
        System.out.println("  Gestion de estudiantes");
        System.out.println("====================");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Eliminar estudiante");
        System.out.println("3. Volver al menú principal");
        System.out.println("====================");
        System.out.print("Ingrese su opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                agregarEstudiante();
                break;
            case 2:
                eliminarEstudiante();
                break;
            case 3:
                gestionSalir = true;
                break;
            default:
                System.out.println("Error: Opcion no valida. Por favor, seleccione una opcion valida.");
                break;
        }
    }
}

private void agregarEstudiante() {
    System.out.print("Ingrese el nombre y calificacion del estudiante a agregar: ");
    String nombre = scanner.nextLine();
    Main.estudiantes.add(nombre);
    System.out.println("Estudiante \"" + nombre + "\" agregado correctamente.");
}

private void eliminarEstudiante() {
    System.out.print("Ingrese el nombre y calificacion del estudiante a eliminar: ");
    String nombre = Main.scanner.nextLine();
    if (estudiantes.remove(nombre)) System.out.println("Estudiante \"" + nombre + "\" eliminado correctamente.");
    else {
        System.out.println("Error: Estudiante no encontrado.");
    }
}

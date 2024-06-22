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

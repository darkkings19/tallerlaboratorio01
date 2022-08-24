import java.util.ArrayList;
import java.util.Scanner;
public class libros {
    public static void main(String[] args) {
        ArrayList Libros = new ArrayList();
        String Mislibros[] = new String[];
        agregarLibro(Libros,"El Hobbit","J.R.R Tolkien","Ed Planeta");
        agregarLibro(Libros,"Cujo","Stephen King","Ed. Que Susto");
        agregarLibro(Libros,"Un Mundo Feliz","Aldous Huxley","Ed. No me acuerdo");
        menu();
    }
    public static void menu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("1. AGREAR LIBRO");
            System.out.println("2. BUSCAR LIBRO");
            System.out.println("3. MOSTRAR ESPACIOS USADOS");
            System.out.println("4. MOSTRAR ESPACIOS DISPONIBLES");
            System.out.println("5. MOSTRAR TODA LA COLECCION");
            System.out.println("6. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("AGREAR LIBRO");
                    agregarLibro();
                    break;
                case 2:
                    System.out.println("BUSCAR LIBRO");
                    mostrarBusquedadeLibroAutor();
                    break;
                case 3:
                    System.out.println("MOSTRAR ESPACIOS USADOS");
                    totalLibros();
                    break;
                case 4:
                    System.out.println("MOSTRAR ESPACIOS DISPONIBLES");
                    mostrarEspaciosDisponibles();
                    break;
                case 5:
                    System.out.println("MOSTRAR TODA LA COLECCION");
                    mostrartlacoleccion();
                    break;
                case 6:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }

        }
    }
    public  static String[][] agregarLibro(String misLibros[],String titulo,String autor,String editorial){

        return new String[0][];
    }
    public  static void mostrartlacoleccion(String misLibros[]){
        System.out.println(misLibros);
    }
    public static void mostrarBusquedadeLibroAutor(String misLibros[],String autor){

    }
    public static int totalLibros(String misLibros[]){
        return 0;
    }
    public static int espaciosDisponibles(String misLibros[]){
        return 0;
    }
    public static void mostrarEspaciosDisponibles(String misLibros[]){

    }

}

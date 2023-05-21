import edu.princeton.cs.stdlib.In;
import edu.princeton.cs.stdlib.Out;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

import java.io.FileWriter;
import java.util.Locale;

public class SistemaImpl implements Sistema {

    /**
     * Metodo que inicializa variables y el programa
     */
    @Override
    public void iniciar() {
        while (true) {
            menu();
        }
    }

    /**
     * Metodo que despliega un menu para el usuario
     */
    @Override
    public void menu() {
        String opcion;
        StdOut.println("""
                [𝅘𝅥𝅮] Bienvenido a Beat the Rhythm [𝅘𝅥𝅮]
                                
                [1] Agregar instrumento
                [2] Vender instrumento
                [3] Consultar inventario
                [4] Salir del programa
                """);
        StdOut.print("Escoja una opcion: ");
        opcion = StdIn.readLine();

        switch (opcion) {
            case "1" -> this.agregarInstrumento();
            case "2" -> StdOut.println("Vender instrumento");
            case "3" -> this.consultarInventario();
            case "4" -> System.exit(0);
            default -> StdOut.println("Opcion no valida, intente nuevamente");
        }
    }

    /**
     * Metodo que agrega un instruemento al archivo Instrumentos.txt
     *
     * @return true si se agrego correctamente false en caso contrario
     */
    @Override
    public boolean agregarInstrumento() {
        try {
            StdOut.print("Ingrese el nombre del instrumento");
            String nombre = StdIn.readLine();
            nombre = nombre.toLowerCase(Locale.ROOT);

            if (nombre.equals("guitarra") || nombre.equals("bajo") || nombre.equals("violin") || nombre.equals("arpa")) {

                StdOut.print("Ingrese el codigo del instrumento");
                int codigo = Integer.parseInt(StdIn.readLine());

                StdOut.print("Ingrese el precio del instrumento");
                double precio = Double.parseDouble(StdIn.readLine());

                StdOut.print("Ingrese el stock del instrumento");
                int stock = Integer.parseInt(StdIn.readLine());

                StdOut.print("Ingrese el material del instrumento");
                String material = StdIn.readLine();


                StdOut.print("Ingrese el tipo de cuerda del instrumento");
                String tipoCuerda = StdIn.readLine();


                StdOut.print("Ingrese el tipo del instrumento");
                String tipo = StdIn.readLine();

                StdOut.print("Ingrese el numero de cuerdas del instrumento");
                int cuerdas = Integer.parseInt(StdIn.readLine());

                Cuerda nuevo = new Cuerda(nombre, codigo, precio, stock, material, tipoCuerda, cuerdas, tipo);

                return true;
            } else {
                System.out.println("No se ingreso un nombre de instrumento valido");
                this.agregarInstrumento();
            }
        } catch (Exception e) {
            System.out.println("Se ingresó un valor invalido");
            this.agregarInstrumento();
        }

        return false;
    }

    /**
     * Metodo que permite desplegar el inventario
     */
    @Override
    public void consultarInventario(){
        // Nombre del archivo a leer
        String archivo = "csv_prueba.csv";

        // Definicion del archivo de entrada
        In entrada = new In(archivo);

        // Mientras existan lineas por leer
        while (entrada.hasNextLine()) {

            // Leer la linea completa
            String linea = entrada.readLine();
            System.out.println(linea);
    }
    }
}








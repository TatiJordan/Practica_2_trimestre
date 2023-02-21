package tiernoparla.es;

public class Menu {
    private static boolean finalizar = false;

    private static final String OPCION_1 = "1. Mostrar obras";
    private static final String OPCION_2 = "2. Dar de alta una obra.";
    private static final String OPCION_3 = "3. Modificar una Obra.";
    private static final String OPCION_4 = "4. Visualizar una obra de arte en concreto.";
    private static final String OPCION_5 = "5. Precios de venta.";
    private static final String OPCION_6 = "6. Imprimir etiqueta de una obra de arte en concreto";
    private static final String OPCION_0 = "0. Salir.";

    private static final String MENSAJE_DE_FALLO = "La opcion elegida no es la correcta.";

    public static final String[] OPCIONES_DEL_MENU = { OPCION_1, OPCION_2, OPCION_3, OPCION_4, OPCION_5, OPCION_6,
        OPCION_0 };

        public static void mostrarOpciones() {
            while (!finalizar) {
                for (int i = 0; i < OPCIONES_DEL_MENU.length; i++) {
                    System.out.println(OPCIONES_DEL_MENU[i]);
                } // for
                int entradaUsuario = 0;
                try {
                    entradaUsuario = sc.nextInt();
                } // try
                catch (InputMismatchException ex) {
                    System.out.println("El valor introducido no es valido.");
                } // catch
                switch (entradaUsuario) {
                    case 1:
                        ObrasDeArte.mostrarObras();
                        break;
                    case 2:
                        try {
                            ObrasDeArte.darDeAltaUnaObra();
                        } catch (IllegalArgumentException excep) {
                            System.out.println(excep.getMessage());
                        }
                        break;
                    case 3:
                        ObrasDeArte.modificarObra();
                        break;
                    case 4:
                        ObrasDeArte.visualizarUnaObraEnConcreto();
                        break;
                    case 5:
                        System.out.println("Dime el id de la obra que quieras saber el precio: ");
                        ObrasDeArte obra = ObrasDeArte.usuarioEligeObra();
                        System.out.println(obra.calcularPrecioFinal());
                        break;
                    case 6:
                        ObrasDeArte.imprimirEtiqueta();
                        break;
                    case 0:
                        finalizar = true;
                }// switch
                if (entradaUsuario < 0 || entradaUsuario > 6) {
                    System.out.println(MENSAJE_DE_FALLO);
                } // if
            } // while
            System.out.println("Esperemos haber sido de ayuda! Adios.");
        }// mostraropcione
}//menu

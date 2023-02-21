package tiernoparla.es;

public class ObrasDeArte {

    private static ObrasDeArte[] obras;

    private int id;
    private String nombre;
    private String autor;
    private String tipo;
    private double precio;
    private double alturaM;
    private double peso;
    private int piezas;
    private String descripcion;

    public ObrasDeArte(int id, String nombre, String autor, String tipo, double precio, double alturaM,
            double peso, int piezas, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.precio = precio;
        this.alturaM = alturaM;
        this.peso = peso;
        this.piezas = piezas;
        this.descripcion = descripcion;

    }// constructores

    public static void añadirObra(ObrasDeArte obra) {

        if (existeID(obra.getId()))
            throw new IllegalArgumentException("El id se repite.");

        aumentarArray();
        obras[obras.length - 1] = obra;

    }// añadir obras

    private static void aumentarArray() {
        int tamañoAdicional = 1;
        ObrasDeArte arrayRespaldo[] = new ObrasDeArte[obras.length + tamañoAdicional];

        for (int i = 0; i < obras.length; i++) {
            arrayRespaldo[i] = obras[i];
        } // for
        obras = arrayRespaldo;

    }// aumentar array

    public static void crearArray() {

        Pintura id_1 = new Pintura(1, "Guernica", "P.Picasso", "Pintura", "Oleo", 1000, 5, 2, 5, "Cuadro guerra civil");
        Pintura id_2 = new Pintura(2, "La Vie", "P.Picasso", "Pintura", "Oleo", 200, 1, 1, 1, "Pintura al oleo");
        Pintura id_3 = new Pintura(3, "El sueño", "P.Picasso", "Pintura", "Oleo", 300, 1.3, 1, 1, "Pintura al oleo");
        Pintura id_4 = new Pintura(4, "Retrato de Dora Maar", "P.Picasso", "Pintura", "Oleo", 400, 1, 0.8, 1,
                "Pintura al oleo");
        Escultura id_5 = new Escultura(5, "El piel roja", "U.Checa", "Escultura", "Marmol", 350, 1, 0.8, 1,
                "Es una escultura");

        int tam = 0;

        obras = new ObrasDeArte[tam];

        añadirObra(id_1);
        añadirObra(id_2);
        añadirObra(id_3);
        añadirObra(id_4);
        añadirObra(id_5);

    }// Crear array

    public static void mostrarObras() {

        for (int i = 0; i < obras.length; i++) {
            System.out.println(obras[i]);
        } // for
    }// mostrar obras

    public static void darDeAltaUnaObra() {
        int id;
        String nombre;
        String autor;
        String tipo;
        String tecnica;
        String material;
        double precio;
        double altura;
        double peso;
        int piezas;
        String descripcion;

        System.out.println("Dime el id de la obra: ");
        id = sc.nextInt();
        sc.nextLine();

        if (existeID(id)) {
            throw new IllegalArgumentException("El id se repite.");
        }
        System.out.println("Dime el nombre de la obra: ");
        nombre = sc.nextLine();
        System.out.println("Dime el autor de la obra: ");
        autor = sc.nextLine();
        System.out.println("Dime el precio: ");
        precio = sc.nextDouble();
        System.out.println("Dime la altura: ");
        altura = sc.nextDouble();
        System.out.println("Dime el peso: ");
        peso = sc.nextDouble();
        System.out.println("Dime el numero de piezas: ");
        piezas = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Que quieres poner en la descripcion?");
        descripcion = sc.nextLine();
        System.out.println("Dime el tipo de obra (Escultura o Pintura): ");
        tipo = sc.nextLine();

        if (tipo.equals("Pintura")) {
            System.out.println("Dime la tecnica: ");
            tecnica = sc.nextLine();
            Pintura id_x = new Pintura(id, nombre, autor, tipo, tecnica, precio, altura, peso, piezas, descripcion);
            añadirObra(id_x);

        } else if (tipo.equals("Pintura")) {
            System.out.println("Dime el material: ");
            material = sc.nextLine();
            Escultura id_x = new Escultura(id, nombre, autor, tipo, material, precio, altura, peso, piezas,
                    descripcion);
            añadirObra(id_x);
        } // ifelse

    }// dar de alta una obra

    public static ObrasDeArte usuarioEligeObra() {

        int id;

        id = sc.nextInt();

        ObrasDeArte obra = null;
        for (int i = 0; i < obras.length; i++) {

            if (obras[i].getId() == id) {
                obra = obras[i];
            } // if
        } // for
        return obra;
    }// usuario elige obra

    public static void modificarObra() {

        System.out.println("¿Cual es el id actual de la obra que quieres modificar?");

        ObrasDeArte obra = usuarioEligeObra();

        System.out.println("Dime el nuevo id de la obra: ");
        obra.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Dime el nuevo nombre de la obra: ");
        obra.setNombre(sc.nextLine());
        System.out.println("Dime el autor de la obra: ");
        obra.setAutor(sc.nextLine());
        System.out.println("Dime el nuevo precio: ");
        obra.setPrecio(sc.nextDouble());
        System.out.println("Dime la altura: ");
        obra.setAlturaM(sc.nextDouble());
        System.out.println("Dime el peso: ");
        obra.setPeso(sc.nextDouble());
        System.out.println("Dime el numero de piezas: ");
        obra.setPiezas(sc.nextInt());
        sc.nextLine();
        System.out.println("¿Que quieres poner en la descripcion?");
        obra.setDescripcion(sc.nextLine());
        System.out.println("Dime el tipo de obra (Escultura o Pintura): ");
        obra.setTipo(sc.nextLine());

        if (obra instanceof Escultura) {
            System.out.println("Dime que material usa: ");
            ((Escultura) obra).setMaterial(sc.nextLine());
        } else if (obra instanceof Pintura) {
            System.out.println("Dime la tecnica que se usa: ");
            ((Pintura) obra).setTecnica(sc.nextLine());
        } // if else
    }// modificarObra

    public static void visualizarUnaObraEnConcreto() {
        System.out.println("¿Cual es el id de la obra que quieres ver?");

        ObrasDeArte obra = usuarioEligeObra();
        obra.getId();
        obra.getNombre();
        obra.getAutor();
        obra.getTipo();
        if (obra instanceof Escultura) {
            ((Escultura) obra).getMaterial();
        } else if (obra instanceof Pintura) {
            ((Pintura) obra).getTecnica();
        } // if else
        obra.getPrecio();
        obra.getAlturaM();
        obra.getPeso();
        obra.getPiezas();
        obra.getDescripcion();

    }// visualizar una obra en concreto.

    public static ObrasDeArte[] getObras() {
        return obras;
    }

    public static void imprimirEtiqueta() {
        System.out.println("Dime el id de la obra de la que quieres la etiqueta: ");

        ObrasDeArte obra = usuarioEligeObra();

        System.out.println("Nombre: " + obra.getNombre());
        System.out.println("Autor: " + obra.getAutor());
        System.out.println("Descripcion: " + obra.getDescripcion());

    }// imprimir etiquetas

    public static boolean existeID(int id) {
        boolean existe = false;
        for (int i = 0; i < obras.length; i++) {

            if (obras[i].getId() == id) {
                existe = true;
            } // if
        } // for
        return existe;
    }// existe id

    public double calcularPrecioInicial() {

        double precioInicial = 0;
        int cargoPeso1 = 100;
        int cargoPeso2 = 20;
        int cargoAltura1 = 100;
        int cargoAltura2 = 20;
        int cargoPiezas = 10;

        precioInicial = precio + (precio * COMISION_GALERIA) / 100;

        System.out.println("Comision galeria: " + (precio * COMISION_GALERIA) / 100);

        if (peso > 1) {
            precioInicial += cargoPeso1;
            System.out.println("Importe por peso(€): " + cargoPeso1);
        } else {
            precioInicial += cargoPeso2;
            System.out.println("Importe por peso(€): " + cargoPeso2);
        } // else if

        if (alturaM > 2) {
            precioInicial += cargoAltura1;
            System.out.println("Importe por Altura(M): " + cargoAltura1);
        } else {
            precioInicial += cargoAltura2;
            System.out.println("Importe por Altura(M): " + cargoAltura2);
        } // elseif

        if (piezas > 2) {
            for (int i = 2; i < piezas; i++) {
                precioInicial += cargoPiezas;
                System.out.println("Importe por nº de pieza - " + i + "(€): " + cargoPiezas);
            } // for
        } // if

        return precioInicial;

    }// calcular precio incial

    public abstract double calcularPrecioFinal();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAlturaM() {
        return alturaM;
    }

    public void setAlturaM(double alturaM) {
        this.alturaM = alturaM;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ObrasDeArte" + "\n" + "[id =" + id + "\n" + " Nombre = " + nombre + "\n" + " Autor = " + autor + "\n"
                + " Tipo = " + tipo + "\n" + " Precio = "
                + precio + "\n" + " AlturaM = " + alturaM + "\n" + " Peso = " + peso + "\n" + " Piezas = " + piezas
                + "\n" + " Descripcion = "
                + descripcion + "\n";
    }// toString
}// ObrasDeArte

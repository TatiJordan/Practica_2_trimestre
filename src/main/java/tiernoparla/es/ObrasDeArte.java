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

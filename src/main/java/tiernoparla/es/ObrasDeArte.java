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
}//ObrasDeArte

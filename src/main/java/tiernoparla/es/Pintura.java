package tiernoparla.es;

public class Pintura extends ObrasDeArte {

    private String tecnica;

    public Pintura(int id, String nombre, String autor, String tipo, String tecnica,
            double precio, double alturaM, double pesoT, int piezas, String descripcion) {
        super(id, nombre, autor, tipo, precio, alturaM, pesoT, piezas, descripcion);
        this.tecnica = tecnica;
    }// constructor

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public String toString() {
        return super.toString() + " Tecnica = " + tecnica + "]";
    }// toString

    @Override
    public double calcularPrecioFinal() {

        double precioFinal = 0;
        int descuento = 10;
        double precioInicial;

        precioInicial = super.calcularPrecioInicial();

        precioFinal = precioInicial - (precioInicial * descuento) / 100;
        System.out.println("Descuento: " + (precioInicial * descuento) / 100);
        System.out.println("Precio final es: " + precioFinal);
        return precioFinal;
    }
}// Pinturas

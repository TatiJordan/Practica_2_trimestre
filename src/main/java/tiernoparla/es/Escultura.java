package tiernoparla.es;

public class Escultura extends ObrasDeArte {

    private String material;

    public Escultura(int id, String nombre, String autor, String tipo, String material,
            double precio, double alturaM, double pesoT, int piezas, String descripcion) {
        super(id, nombre, autor, tipo, precio, alturaM, pesoT, piezas, descripcion);
        this.material = material;
    }//constructor

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public String toString() {
        return super.toString() + " Material= " + material + "]";
    }// tostring
    
    @Override
    public double calcularPrecioFinal() {
        double precioFinal = 0;
        int descuento = 20;
        int cargo_manipulacion = 50;
        double precioInicial;
        precioInicial = super.calcularPrecioInicial();

        precioFinal = (precioInicial - (precioInicial * descuento) / 100) + cargo_manipulacion;
        System.out.println("Con descuento: " + (precioInicial * descuento) / 100);
        System.out.println("*Avisamos de que añadiremos un cargo por manipulacion de: " + cargo_manipulacion + "€ *");
        System.out.println("Precio final: " + precioFinal);

        return precioFinal;
    }
}//escultura

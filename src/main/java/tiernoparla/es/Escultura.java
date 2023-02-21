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
}//escultura

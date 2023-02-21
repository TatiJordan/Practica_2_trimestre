package tiernoparla.es;

public class Pintura extends ObrasDeArte{
    
    private String tecnica;

    public Pintura(int id, String nombre, String autor, String tipo, String tecnica,
            double precio, double alturaM, double pesoT, int piezas, String descripcion) {
        super(id, nombre, autor, tipo, precio, alturaM, pesoT, piezas, descripcion);
        this.tecnica = tecnica;
    }// constructor

}//Pintura

abstract class Producto extends Tienda {
    protected String nombre;
    protected String codigo;
    protected String descripcion;
    protected int cantStock;
    protected double precioUnit;
    protected float ganancia;
    protected boolean disponible;
    protected float descuento;

    protected void Producto(String nombre, String descripcion, int cantStock, double precioUnit, float ganancia, boolean disponible, float descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantStock = cantStock;
        this.precioUnit = precioUnit;
        this.ganancia = ganancia;
        this.disponible = disponible;
        this.descuento=descuento;

    }
}


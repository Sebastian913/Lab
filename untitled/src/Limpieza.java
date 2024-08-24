public class Limpieza extends Producto {
    protected String tipoAplicacion;
    public void subproducto(String nombre, String codigo, String descripcion, int cantStock, double precioUnit, float ganancia, boolean disponible, String tipoAplicacion, float descuento) {
        super.Producto(nombre, descripcion, cantStock, precioUnit, ganancia, disponible, descuento);
        this.codigo = "AZ" + codigo;
        this.tipoAplicacion = tipoAplicacion;
    }
}

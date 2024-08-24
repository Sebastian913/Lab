public class Envasados extends Consumible {
    protected String tipoEnvase;
    protected boolean importado;

    public void subproducto(String nombre, String codigo, String descripcion, int cantStock, double precioUnit, float ganancia, boolean disponible, String tipoEnvase, boolean importado, float calorias, int fechaCaducidad, float descuento) {
        super.Producto(nombre, descripcion, cantStock, precioUnit, ganancia, disponible, descuento);
        super.consumible(calorias, fechaCaducidad);
        this.codigo = "AB" + codigo;
        this.tipoEnvase = tipoEnvase;
        this.importado = importado;
    }
}

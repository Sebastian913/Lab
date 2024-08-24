public class Bebidas extends Consumible {
    protected float graduacionAcohol;
    protected boolean importado;
    public void subproducto(String nombre, String codigo, String descripcion, int cantStock, double precioUnit, float ganancia, boolean disponible, float graduacionAlcohol, boolean importado, float calorias, int fechaCaducidad, float descuento) {
        super.Producto(nombre, descripcion, cantStock, precioUnit, ganancia, disponible, descuento);
        super.consumible(calorias, fechaCaducidad);
        this.codigo = "AC" + codigo;
        this.graduacionAcohol = graduacionAlcohol;
        this.importado = importado;
    }
}

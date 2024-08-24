public class Consumible extends Producto{
    protected float calorias;
    protected int fechaCaducidad;

    protected void consumible(float calorias, int fechaCaducidad){
        this.calorias = calorias;
        this.fechaCaducidad = fechaCaducidad;
    }
}

import java.util.List;
import java.util.ArrayList;

public class Tienda {
    protected String nombre;
    protected int capacidadStock;
    protected int caja;
    public ArrayList<String> ListaStockEnvasados = new ArrayList<>();
    public ArrayList<String> ListaStockBebidas = new ArrayList<>();
    public ArrayList<String> ListaStockLimpieza = new ArrayList<>();

    public void tienda(String nombre, int capacidadStock, int caja){
         this.nombre = nombre;
         this.capacidadStock = capacidadStock;
         this.caja = caja;
    }

    public void compra(String nombre, String codigo, String descripcion, int cantStock, double precioUnit, float ganancia, boolean disponible, float descuento, int precioCompra, int cantProducto, String tipoProducto){
        if(cantProducto*precioCompra>this.caja){
            System.out.println("El producto no podrá ser agregado a la tienda por saldo insuficiente en la caja");
        } else if(this.capacidadStock< ListaStockEnvasados.size()+ListaStockBebidas.size()+ListaStockLimpieza.size()+cantProducto){
            System.out.println("No se pueden agregar nuevos productos a la tienda ya que se alcanzó el máximo de stock");
        } else{
            String x = tipoProducto;
            String y = nombre;
            if(x.equals("envasado")){
                Envasados y= new Envasados();
                y.subproducto(nombre, codigo, descripcion, cantStock, precioUnit, ganancia, disponible, );
        }else if(x.equals("bebida")){
                
            } else{
                
            }
        }
    }
}

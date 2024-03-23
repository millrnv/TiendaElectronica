package modelo;

public class TiendaElectronica {

    private String nombreTienda, direccion;
    private Producto[] productos;

    public TiendaElectronica(String nombreTienda, String direccion, Producto[] productos) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
        this.productos = productos;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    //método para mostrar todos los productos disponibles





    //método para buscar un producto por su nombre o categoría



    //método para agregar un nuevo producto a la lista



    //método para modificar la información de un producto existente



    //método para eliminar un producto de la lista



    //método para realizar una compra, disminuyendo el stock del producto vendido



}

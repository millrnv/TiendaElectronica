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
    public void mostrarProductos() {
        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
    }

    //método para buscar un producto por su nombre o categoría
    public void buscarProducto(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                producto.mostrarProducto();
            }
        }
    }

    //método para agregar un nuevo producto a la lista
    public void agregarProducto(Producto producto) {
        Producto[] productosAnadidos = new Producto[productos.length + 1];
        for (int i = 0; i < productos.length; i++) {
            productosAnadidos[i] = productos[i];
        }
        productosAnadidos[productos.length] = producto;
        productos = productosAnadidos;
    }

    //método para modificar la información de un producto existente
    public void modificarProducto(String nombreProducto, String descripcionProducto, double precio, int stock, String categoria) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                producto.setDescripcion(descripcionProducto);
                producto.setPrecio(precio);
                producto.setStock(stock);
                producto.setCategoria(categoria);
            }
        }
    }

    //método para eliminar un producto de la lista
    public void eliminarProducto(String nombreProducto) {
        Producto[] productosRestantes = new Producto[productos.length - 1];
        int j = 0;
        for (int i = 0; i < productos.length; i++) {
            if (!productos[i].getNombre().equals(nombreProducto)) {
                productosRestantes[j] = productos[i];
                j++;
            }
        }
        productos = productosRestantes;
    }

    //método para realizar una compra, disminuyendo el stock del producto vendido
    public void realizarCompra(String nombreProducto, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                producto.setStock(producto.getStock() - cantidad);
            }
        }
    }


}
package principal;
import modelo.Producto;
import modelo.TiendaElectronica;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = {
                new Producto("Audifonos", "Inalambricos marca Apple", "Musica",119.990,15 ),
                new Producto("Cargador", "lightning marca Apple", "Vida diaria", 29.990,10),
                new Producto("Parlante", "Gran sonido marca Sony", "Musica", 39.990,40)
        };

        TiendaElectronica tiendaElectronica = new TiendaElectronica("Tienda Electronica","Calle 1, Temuco",productos);

        System.out.println("Todos los productos disponibles:");
        tiendaElectronica.mostrarProductos();

        System.out.println("\nBuscar producto por nombre 'Parlante':");
        tiendaElectronica.buscarProducto("Parlante");

        System.out.println("\nBuscar producto por categoría 'Vida diaria':");
        tiendaElectronica.buscarProducto("Vida diaria");

        Producto nuevoProducto = new Producto("Parlante2", "Segundo parlante", "Musica", 19.990, 10);
        tiendaElectronica.agregarProducto(nuevoProducto);
        System.out.println("\nProducto 'Parlante2' agregado. Todos los productos: ");
        tiendaElectronica.mostrarProductos();

        System.out.println("\nModificar producto 'Cargador':");
        tiendaElectronica.modificarProducto("Cargador", "lightning marca Apple", 19.990, 5, "Vida diaria");
        tiendaElectronica.mostrarProductos();

        System.out.println("\nEliminar producto 'Audifonos':");
        tiendaElectronica.eliminarProducto("Audifonos");
        tiendaElectronica.mostrarProductos();

        System.out.println("\nRealizar compra de 5 unidades de 'Audifonos':");
        tiendaElectronica.realizarCompra("Audifonos", 5);
        tiendaElectronica.mostrarProductos();
        //validacion nuevo stock
        tiendaElectronica.buscarProducto("Audifonos");

    }
}

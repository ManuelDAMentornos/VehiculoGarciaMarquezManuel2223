package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class VehiculoGarciaMarquezManuel2223 {

    /**
     * Nombre del vehículo: {@value nombre}.
     */
    private String nombre;
    /**
     * Precio del vehículo: {@value precio}.
     */
    private double precio;
    /**
     * Precio con IVA:{@value precioIVA}.
     */
    private double precioIVA;
    /**
     * Cantidad de vehículos en stock: {@value stock}.
     */
    private int stock;

    /**
     * Constructor sin argumentos. Crea un nuevo objeto vehículo.
     * <code>VehiculoGarciaMArquezManuel2223</code> que no recibe valores en sus
     * atributos.
     */
    public VehiculoGarciaMarquezManuel2223() {
    }

    /**
     * Constructor que recibe el nombre del vehículo, así como el precio y el
     * número que hay en stock. Crea un nuevo objeto
     * <code>VehiculoGarciaMArquezManuel2223</code> con el nombre del vehículo,
     * el precio de venta y la cantidad que hay en stock.
     *
     * @param nom Nombre del vehículo
     * @param precio Precio del vehículo
     * @param stock Cantidad de vehículos en stock
     */
// Constructor con parámetro para iniciar todas las propiedades de la clase
    public VehiculoGarciaMarquezManuel2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Método para asignar el nombre del vehiculo. Asigna el nombre al vehículo.
     * @param nom 
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método que me devuelve el nombre del vehiculo. 
     * @return  Devuelve el nombre del vehículo.
     */
    //
    public String obtenerNombre() {
        return getNombre();
    }
    
        /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return  Devuelve el stock de vehículos..
     */
    public int obtenerStock() {
        return getStock();
    }
    
    /**
     *  Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * @param cantidad Cantidad de vehículos a comprar. No puede ser negativa
     * @throws Exception Si ocurre alguna excepción.
     */
    
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        setStock(getStock() + cantidad);
    }
    /**
     * Método para vender vehículos. Modifica el stock.
     * @param cantidad Cantidad de vehículos a vender. No puede ser 0 o negativa.
     * Tampoco puede ser mayor que el stock.
     * @throws Exception Si ocurre alguna excepción
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        setStock(getStock() - cantidad);
    }

    /**
     * @return Obtener el nombre del vehículo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Modificar nombre del vehículo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Obtener el precio del vehículo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio Modificar el precio del vehículo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return Obtener el Precio Iva
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA Modificar el precio IVA
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return Obtener el stock.
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock Modificar el stock.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

}

package vehiculo;

/**
 * Programa para la compra, venta y obtención de stock de un vehículo. La
 * ejecución del programa creará un objeto
 * <code> VehiculoGarciaMarquezManuel2223</code>  con unos parámetros.
 * El vehículo tendrá una cantidad * en stock y este programa <strong>venderá</strong> 
 * una cantidad del stock, <strong>comprará</strong> otra cantidad y finalmente mostrará 
 * la cantidad de vehículos disponibles <strong> (stock) </strong>.
 *

 * @author IES Aguadulce
 */
public class Main {
    /**
     * Método Main.
     *  Este método es el principal de ejecución del programa
     * @param args Argumentos del main, no es necesario enviar argumentos.
     */
    public static void main(String[] args) {

        VehiculoGarciaMarquezManuel2223 miVehiculoGarciaMarquezManuel2223;
        //int stockActual;

        miVehiculoGarciaMarquezManuel2223 = new VehiculoGarciaMarquezManuel2223("Seat", 18000, 100);
        operativaVehiculosGarciaMarquezManuel2223(miVehiculoGarciaMarquezManuel2223, 50);
    }

    /**
     * Método operativaVehiculosGarciaMarquezManuel2223.
     * 
     * Este método  va a realizar una serie de acciones, en primer lugar va a vender una cantidad de coches, esta cantidad no puede ser negativo ni 0, además tampoco puede ser mayor 
     * que la cantidad que hay en stock. 
     * 
     * Luego va a  comprar más vehículos, la cantidad dada como parámetro no puede ser negativa.
     * 
     * Finalmente mostrará el stock del vehículo.
     * 
     * En caso de no cumplir con los límites establecidos, la clase <code>VehiculoGarciaMarquezManuel2223</code> lanzará una excepción. Este método controla los posibles errores
     * con try-catch en el que si la acción no se puede realizar mostrará un mensaje de error.
     * @param miVehiculoGarciaMarquezManuel2223
     * @param cantidad
     */
    private static void operativaVehiculosGarciaMarquezManuel2223(VehiculoGarciaMarquezManuel2223 miVehiculoGarciaMarquezManuel2223, int cantidad) {
        int stockActual;
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoGarciaMarquezManuel2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoGarciaMarquezManuel2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoGarciaMarquezManuel2223.obtenerStock();
        System.out.println("El stock actual es" + stockActual);
    }

}

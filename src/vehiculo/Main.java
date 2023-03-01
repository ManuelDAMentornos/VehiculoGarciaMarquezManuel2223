
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
        
      public static void main(String[] args) {
        VehiculoGarciaMarquezManuel2223 miVehiculoGarciaMarquezManuel2223;
        //int stockActual;
        
        miVehiculoGarciaMarquezManuel2223 = new VehiculoGarciaMarquezManuel2223("Seat",18000,100);
        operativaVehiculosGarciaMarquezManuel2223(miVehiculoGarciaMarquezManuel2223, 50); 
    }

    private static void operativaVehiculosGarciaMarquezManuel2223(VehiculoGarciaMarquezManuel2223 miVehiculoGarciaMarquezManuel2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGarciaMarquezManuel2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGarciaMarquezManuel2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoGarciaMarquezManuel2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    

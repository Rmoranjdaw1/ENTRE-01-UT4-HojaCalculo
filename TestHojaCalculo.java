
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - 
 *  
 */
public class TestHojaCalculo
{

    /**
     * Constructor  
     */
    public TestHojaCalculo()    {

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el constructor por defecto
     * de fila (el que no tiene parámetros)
     */
    public void test1() {
           Fecha fecha1 = new Fecha(4,10,2020);
           Fecha fecha2 = new Fecha(5,10,2020);
           Fecha fecha3 = new Fecha(1,1,2020);
           
           HojaCalculo hojaCalculo = new HojaCalculo("HOJA1");
           hojaCalculo.addFila("fila1",fecha1,25.50,132.00);
           hojaCalculo.addFila("fila2",fecha2,300.00,350.00);
           hojaCalculo.addFila("fila3",fecha3,0.00,0.00);
           
           HojaCalculo hojaDuplicada = hojaCalculo.duplicarHoja("Duplicada HOJA1");
           System.out.println(hojaCalculo.toString());
           System.out.println(hojaDuplicada.toString());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
         Fecha fecha1 = new Fecha(7,10,2020);
         Fecha fecha2 = new Fecha(8,10,2020);
         
         HojaCalculo hojaCalculo = new HojaCalculo("HOJA2");
         
         hojaCalculo.addFila("fila1",fecha1,260.00,125.00);
         hojaCalculo.addFila("fila2",fecha2,125.00,245.00);
         HojaCalculo hojaDuplicada = hojaCalculo.duplicarHoja("Duplicada HOJA2");
         
         System.out.println(hojaCalculo.toString());
         System.out.println(hojaDuplicada.toString());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        Fecha fecha1 = new Fecha(8,10,2020);
         
         HojaCalculo hojaCalculo = new HojaCalculo("HOJA3");
         
         hojaCalculo.addFila("fila1",fecha1,670.00,234.00);
         HojaCalculo hojaDuplicada = hojaCalculo.duplicarHoja("Duplicada HOJA3");
         
         System.out.println(hojaCalculo.toString());
         System.out.println(hojaDuplicada.toString());

    }

}

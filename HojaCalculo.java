
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author -   
 *  
 */
public class HojaCalculo
{
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila1 = null;
        this.fila1 = null;

    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return fila1;

    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return fila2;

    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return fila3;

    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() {
        int nFilas = 3;
        if(fila1 == null){
        nFilas += 1;
        }else if(fila2 == null){
        nFilas += 1;    
        }else if(fila3 == null){
        nFilas += 1; 
        }
        return nFilas;
    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        return true;

    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) {
        if(hojaCompleta()){
            System.out.printf("FilaX no se puede añadir en HOJAX",hojaCompleta());
        }else{
            fila1 = fila;
            fila2 = fila;
            fila3 = fila;
        }
    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
         Fila fila = new Fila(id,fecha, ingresos, gastos);
         fila = new Fila("fila"); 
    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {
        double ingresoTotal1 = fila1.getIngresos(); 
        double ingresoTotal2 = fila2.getIngresos();
        double ingresoTotal3 = fila3.getIngresos(); 
        return ingresoTotal1 + ingresoTotal2 + ingresoTotal3;

    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        double totalGastos1 = fila1.getGastos();
        double totalGastos2 = fila2.getGastos();
        double totalGastos3 = fila3.getGastos();
        return totalGastos1 + totalGastos2 + totalGastos3;

    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        double totalBeneficios1 = fila1.getBeneficio(); 
        double totalBeneficios2 = fila2.getBeneficio();
        double totalBeneficios3 = fila3.getBeneficio();
        return totalBeneficios1 + totalBeneficios2 + totalBeneficios3;

    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString() {
        
        String toString = String.format("\t/12sFECHA","\t/13sINGRESOS","\t/14sGASTOS","\t/15sBENEFICIO");
        toString = String.format("Fila1",fila1);
        toString = String.format("Fila2",fila2);
        toString = String.format("Fila3",fila3);
        return toString;

    }
 
    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja() {
        HojaCalculo Duplicado = new HojaCalculo("Duplicada HojaX");
        Fila copiaFila1 = fila1.duplicar();
        Fila copiaFila2 = fila2.duplicar();
        Fila copiaFila3 = fila3.duplicar();
        
       return Duplicado;
    }

   
}

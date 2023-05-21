public class Cuerda extends Instrumento{
    private String tipoInstrumentoCuerda ;
    private String tipoCuerda ;
    private int numeroCuerdas ;
    private String tipo;

    /**
     * Constructor del a clase Cuerda
     * @param nombre nombre del instrumento
     * @param codigo codigo  del instrumento
     * @param precio precio del instrumento
     * @param stock stock del instrumento
     * @param material material del instrumento
     * @param tipoCuerda tipo de cuerda  del instrumento
     * @param numeroCuerdas numero de cuerdas del instrumento
     */
    public Cuerda(String nombre, int codigo, double precio, int stock, String material, String tipoCuerda, int numeroCuerdas,String tipo) {
        super(nombre, codigo, precio, stock, material);
        this.tipoCuerda = tipoCuerda;
        this.numeroCuerdas = numeroCuerdas;
    }

    /**
     * Permite obtener el tipo de cuerda
     * @return tipo de cuerda
     */
    public String getTipoCuerda() {
        return tipoCuerda;
    }

    /**
     *Permite obtener el numero de cuerdas
     * @return numero de cuerdas
     */
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }
}

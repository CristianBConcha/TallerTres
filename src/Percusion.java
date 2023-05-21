public class Percusion extends Instrumento{
    private String tipoInstrumentoPercusion;
    private String tipoPercusion;
    private float altura ;
    /**
     * Constructor clase percusion
     * @param nombre nombre del instrumento
     * @param codigo codigo del instrumento
     * @param precio precio del instrumento
     * @param stock stock del instrumento
     * @param material material del instrumento
     * @param tipoPercusion tipo de percusion  del instrumento
     * @param altura altura  del instrumento
     */
    public Percusion(String nombre, int codigo, double precio, int stock, String material, String tipoPercusion, float altura) {
        super(nombre, codigo, precio, stock, material);
        this.tipoPercusion = tipoPercusion;
        this.altura = altura;
    }

    /**
     *  Permite obtener el tipo de instrumento de percusion
     * @return tipo de instrumento de percusion
     */
    public String getTipoInstrumentoPercusion() {
        return tipoInstrumentoPercusion;
    }

    /**
     *  Permite obtener el tipo de percusion
     * @return tipo de percusion
     */
    public String getTipoPercusion() {
        return tipoPercusion;
    }

    /**
     *  Permite obtener el altura del instrumento
     * @return altura del instrumento
     */
    public float getAltura() {
        return altura;
    }
}

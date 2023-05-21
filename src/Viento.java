public  class Viento extends Instrumento{
        private String tipoInstrumentoViento;
    /**
     * Constructor de la clase veinto
     * @param nombre nombre del instrumento
     * @param codigo codigo del instrumento
     * @param precio precio  del instrumento
     * @param stock stock  del instrumento
     * @param material material  del instrumento
     * @param tipoInstrumentoViento tipo de instrumento de viento
     */
    public Viento(String nombre, int codigo, double precio, int stock, String material, String tipoInstrumentoViento) {
        super(nombre, codigo, precio, stock, material);
        this.tipoInstrumentoViento = tipoInstrumentoViento;
    }

    /**
     * Permite obtener el tipo de instrumento de viento
     * @return el tipo de instrumento de viento
     */
    public String getTipoInstrumentoViento() {
        return tipoInstrumentoViento;
    }
}
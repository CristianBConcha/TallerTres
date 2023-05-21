public abstract class  Instrumento {

    private String nombre;
    private int codigo;
    private double precio;
    private int stock;
    private String material;

    /**
     * Constructor de la clase Instrumento
     * @param nombre nombre del instrumento
     * @param codigo codigo del instrumento
     * @param precio precio del instrumento
     * @param stock stock del instrumento
     * @param material material del instrumento
     */
    public Instrumento(String nombre, int codigo, double precio, int stock, String material) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * permite obtener el codigo  del instrumento
     * @return codigo del instrumento
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * permite obtener el precio  del instrumento
     * @return precio del instrumento
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * permite obtener el stock  del instrumento
     * @return stock del instrumento
     */
    public int getStock() {
        return stock;
    }

    /**
     * permite obtener el material  del instrumento
     * @return material del instrumento
     */
    public String getMaterial() {
        return material;
    }
}

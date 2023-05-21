public interface Sistema {
    /**
     * Metodo que inicializa variables y el programa
     */
    public void iniciar();

    /**
     * Metodo que despliega un menu para el usuario
     */
    public void menu();

    /**
     * Metodo que agrega un instruemento al archivo Instrumentos.txt
     * @return true si se agrego correctamente false en caso contrario
     */
    public boolean agregarInstrumento();

    /**
     * Metodo que permite desplegar el inventario
     */
    public void consultarInventario();
}

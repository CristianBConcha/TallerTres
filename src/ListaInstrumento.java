public class ListaInstrumento {
    private int cantMax;
    private int cantActual;
    private Instrumento[] arreglo;

    /**
     * Constructor clase ListaInstrumento
     * @param cantMax cantidad maxima del arreglo
     */
    public ListaInstrumento(int cantMax) {
        if(cantMax<0){
            throw new IllegalArgumentException("No se puede crear una lista con valor maximo 0 o negativo");
        }
        this.cantMax = cantMax;
        this.arreglo= new Instrumento[this.cantMax];
    }

    /**
     * Metodo que permite buscar un instrumento por su codigo
     * @param codigo codigo del instrumento a buscar
     * @return la poscion del instrumento o -1 si no se logro encontrar
     */
    public int buscar(int codigo){
        for(int i =0;i<this.cantMax;i++){
            if(this.arreglo[i]!= null&&this.arreglo[i].getCodigo()==codigo){
                return i;
            }
        }
        return -1;
    }
    public Instrumento obtener(int posicion){
        if(posicion<0||posicion>cantMax){
            throw new IllegalArgumentException("posicion no valida");
        }
        return this.arreglo[posicion];

    }

    /**
     * Metodo que permite agregar un instrumento al arreglo
     * @param instrumento coidgo del instrumento a agregar
     */
    public void agregar(Instrumento instrumento){
        //se busca por codigos repetidos
        if(this.buscar(instrumento.getCodigo())!=-1){
            throw new IllegalArgumentException("codigo del instrumento ya se encuentra");
        }
        //se valida que el arreglo no este lleno
        if(this.cantActual==this.cantMax){
            throw new IllegalArgumentException("arreglo lleno");
        }
        //Se encuentra un espacio vacio en el arreglo
        for(int i=0;i<this.cantMax;i++){
            if(this.arreglo[i]== null){
                this.arreglo[i]= instrumento;
                cantActual++;
                return;
            }
        }
        throw new IllegalArgumentException("no se pudo agregar al arreglo");
    }

    /**
     * Metodo que permite eliminar un instrumento del arreglo
     * @param codigo codigo del instrumento a eliminar
     * @return true si se elimino, en caso contrario false
     */
    public boolean eliminar(int codigo){
        int poscion= this.buscar(codigo);
        //no se encontro el instrumento
        if (poscion<0){
            return false;
        }
        this.arreglo[poscion]=null;
        this.cantActual--;
        return true;
    }

    /**
     * Permite obtener la cantidad maxima del arreglo
     * @return cantidad maxima del arreglo
     */
    public int getCantMax() {
        return cantMax;
    }

    /**
     * Permite obtener la cantidad actual del arreglo
     * @return cantidad actual del arreglo
     */
    public int getCantActual() {
        return cantActual;
    }
}

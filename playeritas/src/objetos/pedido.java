package objetos;

public class pedido {
    private int folioPedido;
    private int idEstado;
    private int folio;
    private int idProducto;
    public pedido(){
        
    }

    /**
     * @return the folioPedido
     */
    public int getFolioPedido() {
        return folioPedido;
    }

    /**
     * @param folioPedido the folioPedido to set
     */
    public void setFolioPedido(int folioPedido) {
        this.folioPedido = folioPedido;
    }

    /**
     * @return the idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public void imprimir(){
     System.out.println(getFolio());   
     System.out.println(getFolioPedido());
     System.out.println(getIdProducto());
     System.out.println(getIdEstado());
     System.out.println("------------------------------------");
    }    
}

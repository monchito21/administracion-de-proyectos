package objetos;

public class pedido {
    private int idPersona;
    private int folio;
    private String cantidad;
    private String pxp;
    private String color;
    private String pTotal;
    private int idTipo;
    private String cliente;
    private int idEstado;
    private String estado;
    private String tipo;
    
    public pedido(){       
    }

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the pxp
     */
    public String getPxp() {
        return pxp;
    }

    /**
     * @param pxp the pxp to set
     */
    public void setPxp(String pxp) {
        this.pxp = pxp;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the pTotal
     */
    public String getpTotal() {
        return pTotal;
    }

    /**
     * @param pTotal the pTotal to set
     */
    public void setpTotal(String pTotal) {
        this.pTotal = pTotal;
    }

    /**
     * @return the idTipo
     */
    public int getIdTipo() {
        return idTipo;
    }

    /**
     * @param idTipo the idTipo to set
     */
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
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
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void imprimir(){
        System.out.println(getCliente());
        System.out.println(getIdPersona());
        System.out.println(getCantidad());
        System.out.println(getPxp());
        System.out.println(getpTotal());
        System.out.println(getColor());
        System.out.println(getEstado());
        System.out.println(getIdTipo());
        System.out.println(getTipo());
        System.out.println("-------------------------");
    }
}

package objetos;

public class suministro {
    private int idSuministro;
    private String nomSuministro;
    private int idInventario;
    private int idEmpleado;
    private String cantidad;
    public suministro(){
        
    }

    /**
     * @return the idSuministro
     */
    public int getIdSuministro() {
        return idSuministro;
    }

    /**
     * @param idSuministro the idSuministro to set
     */
    public void setIdSuministro(int idSuministro) {
        this.idSuministro = idSuministro;
    }

    /**
     * @return the nomSuministro
     */
    public String getNomSuministro() {
        return nomSuministro;
    }

    /**
     * @param nomSuministro the nomSuministro to set
     */
    public void setNomSuministro(String nomSuministro) {
        this.nomSuministro = nomSuministro;
    }

    /**
     * @return the idInventario
     */
    public int getIdInventario() {
        return idInventario;
    }

    /**
     * @param idInventario the idInventario to set
     */
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the c
     */
    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public void imprime(){
        System.out.println(getIdEmpleado());
        System.out.println(getCantidad());
        System.out.println(getIdInventario());
        System.out.println(getIdSuministro());
        System.out.println(getNomSuministro());
        System.out.println("------------------------------------------------------");
    }
}

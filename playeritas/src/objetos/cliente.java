package objetos;

public class cliente extends Persona{
    private double idCliente;
    private String pass;
    public cliente(){
    }

    /**
     * @return the idCliente
     */
    public double getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(double idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
}

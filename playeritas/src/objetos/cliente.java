package objetos;

public class cliente extends Persona{
    private int idCliente;
    private String pass;
    public cliente(){
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
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
    public void imprime(){
        System.out.println(getNombre()+" "+getaP()+" "+getaM());
        System.out.println(getId());
        System.out.println(getPass());
        System.out.println(getIdCliente());
        System.out.println(getCalle());
        System.out.println(getNo());        
        System.out.println(getCol());
        System.out.println(getCorreo());
        System.out.println("----------------------------------------------------");
    }
}

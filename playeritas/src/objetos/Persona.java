package objetos;

public  abstract class Persona {
    private double id;
    private String nombre;
    private String aP;
    private String aM;
    private String calle;
    private String no;
    private String  col;
    private String correo;
    
    public Persona(){
        
    }   

    /**
     * @return the id
     */
    public double getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(double id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the aP
     */
    public String getaP() {
        return aP;
    }

    /**
     * @param aP the aP to set
     */
    public void setaP(String aP) {
        this.aP = aP;
    }

    /**
     * @return the aM
     */
    public String getaM() {
        return aM;
    }

    /**
     * @param aM the aM to set
     */
    public void setaM(String aM) {
        this.aM = aM;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return the col
     */
    public String getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(String col) {
        this.col = col;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}

package objetos;

public class empleado extends Persona{
    private int pass;
    public empleado(){
        
    }

    /**
     * @return the pass
     */
    public int getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(int pass) {
        this.pass = pass;
    }
      public void imprime(){
        System.out.println(getPass());
        System.out.println(getId());
        System.out.println("----------------------------------------------------");
    }
}

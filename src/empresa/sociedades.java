package empresa;


public class sociedades extends Empresa {
    
    private int cantidadDeSocios;
    private String jefeGeneral;
    private Boolean nocturno;

    public sociedades(int cantidadDeSocios, String jefeGeneral, Boolean nocturno, int numeroDeEmpleados, boolean asegurada, boolean vacaciones, String colorDeUniformes) {
        super(numeroDeEmpleados, asegurada, vacaciones, colorDeUniformes);
        this.cantidadDeSocios = cantidadDeSocios;
        this.jefeGeneral = jefeGeneral;
        this.nocturno = nocturno;
    }

    public int getCantidadDeSocios() {
        return cantidadDeSocios;
    }

    public void setCantidadDeSocios(int cantidadDeSocios) {
        this.cantidadDeSocios = cantidadDeSocios;
    }

    public String getJefeGeneral() {
        return jefeGeneral;
    }

    public void setJefeGeneral(String jefeGeneral) {
        this.jefeGeneral = jefeGeneral;
    }

    public Boolean getNocturno() {
        return nocturno;
    }

    public void setNocturno(Boolean nocturno) {
        this.nocturno = nocturno;
    }
    
      public void cantidadDeSocios(int nuevaCantidadDeSocios){
        if(nuevaCantidadDeSocios<=this.cantidadDeSocios){
            System.out.println("no hay nuevos socios: ");
            
        }else{
            this.cantidadDeSocios = nuevaCantidadDeSocios;
            System.out.println("Los nuevos socios son: ");
        }
    }
    
    
}

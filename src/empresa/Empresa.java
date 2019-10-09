
package empresa;

public class Empresa {

private int numeroDeEmpleados;
private boolean asegurada;
private boolean vacaciones;
private String colorDeUniformes;

    public Empresa(int numeroDeEmpleados, boolean asegurada, boolean vacaciones, String colorDeUniformes) {
        this.numeroDeEmpleados = numeroDeEmpleados;
        this.asegurada = asegurada;
        this.vacaciones = vacaciones;
        this.colorDeUniformes = colorDeUniformes;
    }


public void contratarEmpleados(){
    numeroDeEmpleados +=4;
}
public void asegurarEmpresa(){
    asegurada =true;
}
  public void vacacionesDisponibles (){
      vacaciones = true;
  }
  public void colorPemitido (){
      String rojo = null;
      colorDeUniformes = rojo;
  }

    public int getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }

    public void setNumeroDeEmpleados(int numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    public boolean isAsegurada() {
        return asegurada;
    }

    public void setAsegurada(boolean asegurada) {
        this.asegurada = asegurada;
    }

    public boolean isVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(boolean vacaciones) {
        this.vacaciones = vacaciones;
    }

    public String getColorDeUniformes() {
        return colorDeUniformes;
    }

    public void setColorDeUniformes(String colorDeUniformes) {
        this.colorDeUniformes = colorDeUniformes;
    }
    
  public void contratarEmpleados(int nuevosEmpleados){
      if(nuevosEmpleados<=this.numeroDeEmpleados){
          System.out.println("No hay nuevos empleados: ");
      }else{
          this.numeroDeEmpleados = nuevosEmpleados;
          System.out.println("Los nuevos empleados son: ");
      }
  }
}  

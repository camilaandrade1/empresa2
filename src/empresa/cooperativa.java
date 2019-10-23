package empresa;

public class cooperativa extends Empresa{
    
    private String sociedad;
    private int proveedor;
    private boolean exportacion;

    public cooperativa(String sociedad, int proveedor, boolean exportacion, int numeroDeEmpleados, boolean asegurada, boolean vacaciones, String colorDeUniformes) {
        super(numeroDeEmpleados, asegurada, vacaciones, colorDeUniformes);
        this.sociedad = sociedad;
        this.proveedor = proveedor;
        this.exportacion = exportacion;
    }

    public String getSociedad() {
        return sociedad;
    }

    public void setSociedad(String sociedad) {
        this.sociedad = sociedad;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isExportacion() {
        return exportacion;
    }

    public void setExportacion(boolean exportacion) {
        this.exportacion = exportacion;
    }
      public void proveedor(int nuevoProveedor){
        if(nuevoProveedor<=this.proveedor){
            System.out.println("no hay nuevo proveedor: ");
            
        }else{
            this.proveedor = nuevoProveedor;
            System.out.println("El nuevo proveedor es: ");
        }
    }
    
}

package empresa;

public class cooperativa extends Empresa{
    
    private String sociedad;
    private int proveedor;
    private boolean exportacion;

    public cooperativa(int numeroDeEmpleados, boolean asegurada, boolean vacaciones, String colorDeUniformes) {
        super(numeroDeEmpleados, asegurada, vacaciones, colorDeUniformes);
    }

    public cooperativa(String sociedad, int proveedor, boolean exportacion, int numeroDeEmpleados, boolean asegurada, boolean vacaciones, String colorDeUniformes) {
        super(numeroDeEmpleados, asegurada, vacaciones, colorDeUniformes);
        this.sociedad = sociedad;
        this.proveedor = proveedor;
        this.exportacion = exportacion;
    }
    
}

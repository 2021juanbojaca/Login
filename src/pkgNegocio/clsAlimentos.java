
package pkgNegocio;


public class clsAlimentos {
    private String id;
    private String alimento;
    private String descripcion;
    

    public clsAlimentos() {
    }

    public clsAlimentos(String id, String nombre, String descripcion) {
        this.id = id;
        this.alimento = alimento;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
}

import biblioteca.funcionesPrincipales;

public class Biblotecario extends Persona implements funcionesPrincipales{
    //atributos
    private String numEmpleado;
    private String fechaContratacion;
    private String estado;

    //constructor

    public Biblotecario(String numEmpleado, String fechaContratacion, String estado) {
        super();
        this.numEmpleado = numEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.estado = estado;
    }

    //getters y setters


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    //Metodos

    public void agregarPublicacion(){
        this.agregarPublicacion();
    };
    public void agregarEjemplar(){
        this.agregarEjemplar();
    };
    public void agregarSeccion(){
        this.agregarSeccion();
    };

    public void agregarEstanteria(){
        this.agregarEstanteria();
    };

    public void registrarSocio(){
        this.registrarSocio();
    };

    public void prestarEjemplar(){
        this.prestarEjemplar();
    };

    public void devolverEjemplar(){
        this.devolverEjemplar();
    };

    public void buscarEjemplar(){
        this.buscarEjemplar();
    };

    public void buscarSeccion(){
        this.buscarSeccion();
    };

    public void colocarEjemplar(){
        this.colocarEjemplar();
    };
}

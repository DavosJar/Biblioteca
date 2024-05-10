import biblioteca.Seccion;

public class Prestamo {

    //atributos
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String estado;

    //relaciones
    private Seccion.Ejemplar ejemplar;

    //constructor
    public Prestamo(String fechaPrestamo, String fechaDevolucion, String estado) {
        super();
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    //getters y setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Seccion.Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Seccion.Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

}

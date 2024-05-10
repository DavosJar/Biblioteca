import java.util.ArrayList;

public class Socio extends Persona {
    //atributos
    private String numSocio;
    private String fechaInscripcion;
    private String fechaVencimiento;
    private String estado;

    //relaciones
    private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

    //constructor
    public Socio(String numSocio, String fechaInscripcion, String fechaVencimiento, String estado) {
        super();
        this.numSocio = numSocio;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
    }

    //getters y setters

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    //metodos


}

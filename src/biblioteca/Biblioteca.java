package biblioteca;

import java.util.ArrayList;

public class Biblioteca implements funcionesPrincipales{
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    //relaciones
    private Inventario inventario;
    private ArrayList<Seccion> secciones;

    public Biblioteca(String nombre, String direccion, String telefono, String email, Inventario inventario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.inventario = inventario;
        this.secciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public ArrayList<Seccion> getSecciones() {
        return secciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void setSecciones(ArrayList<Seccion> secciones) {
        this.secciones = secciones;
    }

    //Metodos

    public void agregarPublicacion(){
        this.agregarEjemplar();
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

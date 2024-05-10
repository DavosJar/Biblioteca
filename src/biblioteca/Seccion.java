package biblioteca;

import publicacion.Libro;

import java.util.ArrayList;

public class Seccion {
    private int nombre;
    private int cantidadPublicaciones;
    private int cantidadLibros;
    private int cantidadRevistas;
    public static int contadorSeccion = 0;

    //relaciones
    private ArrayList<Estanteria> estanterias;

    public Seccion(int nombre, int cantidadPublicaciones, int cantidadLibros, int cantidadRevistas) {
        this.nombre = nombre;
        this.cantidadPublicaciones = cantidadPublicaciones;
        this.cantidadLibros = cantidadLibros;
        this.cantidadRevistas = cantidadRevistas;
        this.estanterias = new ArrayList<>();
    }
    //


    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    public static int getContadorSeccion() {
        return contadorSeccion;
    }

    public static void setContadorSeccion(int contadorSeccion) {
        Seccion.contadorSeccion = contadorSeccion;
    }

    public int getCantidadRevistas() {
        return cantidadRevistas;
    }

    public void setCantidadRevistas(int cantidadRevistas) {
        this.cantidadRevistas = cantidadRevistas;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPublicaciones() {
        return cantidadPublicaciones;
    }

    public void setCantidadPublicaciones(int cantidadPublicaciones) {
        this.cantidadPublicaciones = cantidadPublicaciones;
    }

    @Override
    public String toString() {
        return "Seccion{" +
                "nombre=" + nombre +
                ", cantidadPublicaciones=" + cantidadPublicaciones +
                '}';
    }



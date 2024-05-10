package biblioteca;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Inventario {
    private Data fechaUltimaActualizacion;
    private int cantidadPublicaciones;
    private int cantidadLibros;
    private int cantidadRevistas;

    //relaciones
    private Biblioteca biblioteca;
    private ArrayList<Seccion> seccionList;

    public Inventario(Data fechaUltimaActualizacion, int cantidadPublicaciones, int cantidadLibros, int cantidadRevistas, Biblioteca biblioteca) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
        this.cantidadPublicaciones = cantidadPublicaciones;
        this.cantidadLibros = cantidadLibros;
        this.cantidadRevistas = cantidadRevistas;
        this.biblioteca = biblioteca;
        this.seccionList = new ArrayList<>();
    }

    public Data getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public int getCantidadPublicaciones() {
        return cantidadPublicaciones;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public int getCantidadRevistas() {
        return cantidadRevistas;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public ArrayList<Seccion> getSeccionList() {
        return seccionList;
    }

    public void setFechaUltimaActualizacion(Data fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public void setCantidadPublicaciones(int cantidadPublicaciones) {
        this.cantidadPublicaciones = cantidadPublicaciones;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public void setCantidadRevistas(int cantidadRevistas) {
        this.cantidadRevistas = cantidadRevistas;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void setSeccionList(ArrayList<Seccion> seccionList) {
        this.seccionList = seccionList;
    }

    public void addSeccion(Seccion seccion) {
        seccionList.add(seccion);
    }

    public void removeSeccion(Seccion seccion) {
        seccionList.remove(seccion);
    }

    public void updateCantidadPublicaciones() {
        cantidadPublicaciones = 0;
        for (Seccion seccion : seccionList) {
            cantidadPublicaciones += seccion.getCantidadPublicaciones();
        }
    }
}

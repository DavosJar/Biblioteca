package biblioteca;
import Ejemplar;
import java.util.ArrayList;

public class Estanteria {
    private int numero;
    private int cantidadLibros;
    private int cantidadRevistas;
    private int cantidadPublicaciones;

    //relaciones
    private Seccion seccion;
    private ArrayList<Ejemplar> ejemplarList;

    public Estanteria() {
        this.ejemplarList = new ArrayList<>();
    }

    public Estanteria(int numero, int cantidadLibros, int cantidadRevistas, int cantidadPublicaciones, Seccion seccion) {
        this();
        this.numero = numero;
        this.cantidadLibros = cantidadLibros;
        this.cantidadRevistas = cantidadRevistas;
        this.cantidadPublicaciones = cantidadPublicaciones;
        this.seccion = seccion;
    }

    public int getNumero() {
        return numero;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public int getCantidadRevistas() {
        return cantidadRevistas;
    }

    public int getCantidadPublicaciones() {
        return cantidadPublicaciones;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public ArrayList<Ejemplar> getEjemplarList() {
        return ejemplarList;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public void setCantidadRevistas(int cantidadRevistas) {
        this.cantidadRevistas = cantidadRevistas;
    }

    public void setCantidadPublicaciones(int cantidadPublicaciones) {
        this.cantidadPublicaciones = cantidadPublicaciones;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public void setEjemplarList(ArrayList<Ejemplar> ejemplarList) {
        this.ejemplarList = ejemplarList;
    }

    public void agregarEjemplar(.Ejemplar ejemplar){
        this.ejemplarList.add(ejemplar);
    }
    public ArrayList<Ejemplar> getEjemplares(){
        return ejemplarList;
    }

    @Override
    public String toString() {
        return "Estanteria{" +
                "numero=" + numero +
                ", cantidadLibros=" + cantidadLibros +
                ", cantidadRevistas=" + cantidadRevistas +
                ", cantidadPublicaciones=" + cantidadPublicaciones +
                ", seccion=" + seccion +
                ", ejemplarList=" + ejemplarList +'}';
    }

}

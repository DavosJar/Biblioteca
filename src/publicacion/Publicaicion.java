package publicacion;

public abstract class Publicaicion {
    protected String titulo;
    protected String fechaPublicaion;
    protected String editorioal;
    public static int cantidadEjemplares = 0;

    //Relaciones
    protected Autor autor;

    public Publicaicion(String titulo, String fechaPublicaion, String editorioal, Autor autor) {
        this.titulo = titulo;
        this.fechaPublicaion = fechaPublicaion;
        this.editorioal = editorioal;
        this.autor = autor;
        cantidadEjemplares++;
    }



}

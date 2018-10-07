import java.util.ArrayList;

public class Artista {
    int idArtista;
    String nombre;
    String pseudonimo;
    Boolean anonimo;
    Agente suAgente;
    ArrayList<Album> susAlbumes;

    public Artista(int idArtista, String nombre, String pseudonimo, Boolean anonimo, Agente suAgente) {
        this.idArtista = idArtista;
        this.nombre = nombre;
        this.pseudonimo = pseudonimo;
        this.anonimo = anonimo;
        this.suAgente = suAgente;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public ArrayList<Album> getSusAlbumes() {
        return susAlbumes;
    }

    public void setSusAlbumes(ArrayList<Album> susAlbumes) {
        this.susAlbumes = susAlbumes;
    }

    public Boolean getAnonimo() {
        return anonimo;
    }

    public void setAnonimo(Boolean anonimo) {
        this.anonimo = anonimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
}

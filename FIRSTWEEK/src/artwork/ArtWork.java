package artwork;

import java.util.Objects;

public abstract class ArtWork {
    protected String titolo, artista;

    protected ArtWork(String titolo, String artista){
        this.artista = artista;
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public abstract double printEncumbrace();

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof ArtWork artWork)) return false;
        return getTitolo().equals(artWork.getTitolo()) && getArtista().equals(artWork.getArtista());
    }

}

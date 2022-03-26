package artwork;

import java.util.Objects;

public class Sculture extends ArtWork {
    private double height, width, depth;

    public Sculture(String titolo, String artista, double width, double height, double depth) {
        super(titolo, artista);
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    /**
     * Stampa l'ingombro dell'opera
     * non sapendo cosa specificamente è lo vedo come il volume occipato, quindi base per altezza per profondita
     *
     * @return
     */
    @Override
    public double printEncumbrace() {
        return width * height * depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Sculture sculture)) return false;
        return super.equals(o) &&
                sculture.getDepth() == this.depth &&
                sculture.getHeight() == this.height &&
                sculture.getWidth() == this.width;
    }

}

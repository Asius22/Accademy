package artwork;

import java.util.Objects;

public class Square extends ArtWork {
    private double height, width;

    public Square(String titolo, String artista, double larghezza, double altezza) {
        super(titolo, artista);
        this.height = altezza;
        this.width = larghezza;
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


    @Override
    public double printEncumbrace() {
        return this.height * this.width;
    }

    @Override
    public boolean equals(Object o) {
       if (o == null) return false;
       if (this == o) return true;
       if (!(o instanceof Square square)) return false;
       return super.equals(o) &&
               this.width == square.getWidth() &&
               this.height == square.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }
}

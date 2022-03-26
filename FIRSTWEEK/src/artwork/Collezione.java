package artwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Collezione {
    private String name;
    private List<ArtWork> collezione;

    public Collezione(String name) {
        this.name = name;
        this.collezione = new ArrayList<>();
    }

    public Collezione(String name, List<ArtWork> collezione) {
        this.name = name;
        this.collezione = collezione;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ArtWork> getCollezione() {
        return collezione;
    }

    public void setCollezione(List<ArtWork> collezione) {
        this.collezione = collezione;
    }

    public boolean add(ArtWork a) {
        if (!collezione.contains(a))
            return collezione.add(a);
        return false;
    }

    public String printCollection() {
        StringBuilder res = new StringBuilder();
        for (ArtWork a : collezione)
            res.append(a.toString())
                    .append("\n");

        return res.toString();
    }

    public double princEncumbrace(ArtWork a) {
        return a.printEncumbrace();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Collezione other)) return false;
        return this.name.equals(other.getName()) &&
                this.collezione.equals(other.getCollezione());
    }
}

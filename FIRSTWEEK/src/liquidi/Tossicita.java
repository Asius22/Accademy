package liquidi;

public enum Tossicita {
    BASSO(10),
    MEDIO(20),
    ALTO(30);
    private final int value;
    Tossicita(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}

package hm2.task2;

public enum Genre {
    Novel("Novel"),

    Poem("Poem"),

    Poetry("Poetry"),
    ;

    private final String type;

    Genre(String type) {
        this.type = type;
    }

    public String getGenre() {
        return type;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genre='" + type + '\'' +
                '}';
    }
}

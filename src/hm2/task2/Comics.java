package hm2.task2;

public class Comics extends Book{

    Genre genre;

    public Comics() {
    }

    public Comics(int size, int pages, Genre genre) {
        super(size, pages);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "genre=" + genre +
                '}' + super.toString();
    }
}

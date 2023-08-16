public class Book {
    private String bookName;
    private Author fullName;
    private int publicationYear;

    public Book(String bookName, Author fullName, int publicationYear) {
        this.bookName = bookName;
        this.fullName = fullName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getFullName() {
        return this.fullName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

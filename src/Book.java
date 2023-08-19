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

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "Название - " + bookName + fullName.toString() + " Год публикации - " + publicationYear;
    }
}

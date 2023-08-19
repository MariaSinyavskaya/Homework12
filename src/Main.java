public class Main {
    public static void main(String[] args) {
        Author authorLeoTolstoy = new Author("Лев","Толстой");
        Author authorJaneAusten = new Author("Джейн", "Остин");
        Book bookAnnaKarenina = new Book("\"Анна Каренина\"", authorLeoTolstoy, 1873);
        Book bookPrideAndPrejudice = new Book("\"Гордость и Предубеждение\"", authorJaneAusten, 1811);
        bookPrideAndPrejudice.setPublicationYear(1813);
        System.out.println(bookAnnaKarenina.toString());
        System.out.println(bookPrideAndPrejudice.toString());
        System.out.println(authorJaneAusten.equals(authorLeoTolstoy));
    }
}
package chapter7.records;

public record Book(int numberOfPages, String author) {
    // compact constructor
    // - processes validation and transformations succinctly
    // - takes no params and implicitly sets all fields
    // - it's executed before full constructor
    // - cannot modify the fields of the record
    public Book {
        if (numberOfPages <= 0 ) throw new IllegalArgumentException(); // optional guard condition
        author = author.toUpperCase(); // note it's not field this.author, transformation is applied to constructor
        // parameter
    }

    // long constructor
//    public Book(int numberOfPages, String author) {
//        if (numberOfPages <= 0 ) throw new IllegalArgumentException(); // optional guard condition
//        this.numberOfPages = numberOfPages;
//        this.author = author;
//    }
}

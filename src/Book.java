public class Book {
    private Author author;
    private String name;
    private int publishingYear;

    public Book(String name, int publishingYear, Author author) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishingYear() {
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1900 || publishingYear > 2024) {
            System.out.println("Invalid publishing year:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book Book1 = (Book) other;
        return name.equals(Book1.name);
    }

    @Override
    public String toString() {
        return "Book: " + name + "; Year of publication: " + publishingYear + "; Author: " + author;
    }


    /*@Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book Book3 = (Book) other;
        return name.equals(Book3.name);
    }*/
}
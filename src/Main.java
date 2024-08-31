public class Main {
    public static void main(String[] args) {
        Author SL = new Author("Stanislav", "Lem");
        Book Solaris = new Book("Solaris", 1961, SL);
        System.out.println("Book: " + Solaris.getName() + "; Year of publication: " + Solaris.getPublishingYear() + "; Author: " + Solaris.getAuthor().getFirstName() + " " + Solaris.getAuthor().getSecondName());
        Author RB = new Author("Ray", "Bradbury");
        Book Fahrenheit = new Book("Fahrenheit 451", 1956, RB);
        System.out.println("Book: " + Fahrenheit.getName() + "; Year of publication: " + Fahrenheit.getPublishingYear() + "; Author: " + Fahrenheit.getAuthor().getFirstName() + Fahrenheit.getAuthor().getSecondName());
        Fahrenheit.setPublishingYear(1953);
        System.out.println("Corrected. Year of publication: " + Fahrenheit.getPublishingYear());
    }
}
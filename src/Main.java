public class Main {
    public static void main(String[] args) {
        Author SL = new Author("Stanislav", "Lem");
        //Book Solaris = new Book("Solaris", 1961, SL);
        //System.out.println("Book: " + Solaris.getName() + "; Year of publication: " + Solaris.getPublishingYear() + "; Author: " + Solaris.getAuthor().getFirstName() + " " + Solaris.getAuthor().getSecondName());
        Author RB = new Author("Ray", "Bradbury");
        //Book Fahrenheit = new Book("Fahrenheit 451", 1953, RB);
        //System.out.println("Book: " + Fahrenheit.getName() + "; Year of publication: " + Fahrenheit.getPublishingYear() + "; Author: " + Fahrenheit.getAuthor().getFirstName() + Fahrenheit.getAuthor().getSecondName());
        //System.out.println(new Book("Solaris", 1961, SL));
        //System.out.println(new Book("Fahrenheit 451", 1953, RB));
        //Fahrenheit.setPublishingYear(1953);
        //System.out.println("Corrected. Year of publication: " + Fahrenheit.getPublishingYear());
        Book Solaris = new Book("Solaris", 1961, SL);
        String Book1 = Solaris.toString();
        System.out.println(Book1);
        Book Fahrenheit451 = new Book("Fahrenheit 451", 1953, RB);
        String Book2 = Fahrenheit451.toString();
        System.out.println(Book2);
        Book MagellanicCloud = new Book("The Magellanic Cloud", 1955, SL);
        String Book3 = MagellanicCloud.toString();
        System.out.println(Book3);
        Book DandelionWine = new Book("Dandelion Wine", 1957, RB);
        String Book4 = DandelionWine.toString();
        System.out.println(Book4);
        Book DuplicateSolaris = new Book("Solaris", 1961, SL);
        String Book5 = DuplicateSolaris.toString();
        System.out.println(Book5);
        System.out.println(Book5.equals(Book1));
        Author SM = new Author("Stanislav", "Martin");
        System.out.println(SM.equals(SL));
    }
}
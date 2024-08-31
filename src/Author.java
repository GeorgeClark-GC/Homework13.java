public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author SL = (Author) other;
        return firstName.equals(SL.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }


}
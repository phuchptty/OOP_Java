public class VietnameseName {
    public String firstName;
    public String lastname;

    public VietnameseName(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstName + lastname;
    }
}

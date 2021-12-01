public class ForeignName extends VietnameseName {
    public ForeignName(String firstName, String lastname) {
        super(firstName, lastname);
    }

    @Override
    public String toString() {
        return super.lastname + super.firstName;
    }
}

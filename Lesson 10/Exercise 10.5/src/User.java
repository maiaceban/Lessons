public class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        }
        else if (firstName.isEmpty() || lastName.isEmpty()) {
            return lastName.isEmpty() ? firstName : lastName;
        }
        return firstName + " " + lastName;
    }
}

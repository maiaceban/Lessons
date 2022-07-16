public class Account {
    /*
    There are two classes: Account with three fields (code, balance, owner) and User with
    three fields (login, firstName, lastName). Both classes have parameterized constructors.
    See full declarations of these classes in the code template. Do not be afraid of the static keyword.
    It's not important now.

    In the main method, create an instance of the Account class and pass it to the process method by calling process(account).
    This method is already defined.
    The instance must have the following values of the fields:
    ● code: "123456",
    ● balance: 1000,
    ● owner: (login: "demo-user", firstName: "Alexander", lastName: "Schmidt").
    Note that the owner is an instance of the User class.
     */

    private String code;
    private long balance;
    private User owner;

    public Account(String code, long balance, User owner) {
        this.code = code;
        this.balance = balance;
        this.owner = owner;
    }

    public String getCode() {
        return code;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

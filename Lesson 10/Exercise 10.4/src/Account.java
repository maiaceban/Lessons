public class Account {
    /*
    You are given a class named Account. It has three fields: a long field balance, a
string field ownerName, and a boolean flag locked.
Write getters and setters for all fields.
     */

    private long balance;
    private String ownerName;
    private boolean locked;

    //Getter
    public long getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Boolean getLocked() {
        return locked;
    }

    //Setter
    public void setBalance(long b) {
        this.balance = b;
    }

    public void setOwnerName(String on) {
        this.ownerName = on;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}

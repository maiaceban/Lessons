import java.util.Objects;

public class Money {
    private int amount;
    private String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
// Overriding equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Money money)) { //cast
            return false;
        }
        return amount == money.amount&& Objects.equals(currencyCode,money.currencyCode);
    }
    //Overriding hashCode
    @Override
    public int hashCode(){
        return Objects.hash(amount, currencyCode);
    }
}

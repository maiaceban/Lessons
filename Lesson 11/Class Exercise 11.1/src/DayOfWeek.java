public enum DayOfWeek {
    MONDAY("Luni"), TUESDAY("Marti"), WEDNESDAY("Miercuri"), THURSDAY("Joi"),
    FRIDAY("Vineri"), SATURDAY("Sambata"), SUNDAY("Duminica");

    private final String mdName;

    DayOfWeek(String mdName) {
        this.mdName = mdName;

    }

    public String getmdName() {
        return mdName;
    }

}


public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values())
            System.out.println(day);
    }
}


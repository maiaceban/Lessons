public class Clock {
    /*
    You are given a class Clock. It has two int fields: hours and minutes. The clock has
a minute scale from 0 to 59 and an hour scale from 1 to 12. The clock does not know
whether it's day or night (no AM or PM).
Implement the method next that increases the value of minutes by 1. The minutes
must be reset to zero when the current hour ends. Do not forget to change the hours as
well. Let's consider the examples.
     */

    int hours = 12;
    int minutes = 0;

    public void next(){
        this.minutes += 1;
        if (this.minutes > 59){
            this.minutes = 0;
            this.hours += 1;
            this.hours = this.hours > 12 ? 1 : this.hours;
        }
    }
}

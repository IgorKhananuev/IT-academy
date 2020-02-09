package timeDivision;

public class TimeInterval {
    private int hour;
    private int minute;
    private int second;

    TimeInterval(int second) {
        this.second = second;
    }

    TimeInterval(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    int setSecond(int second) {
        return this.second = second;
    }

    int getSecond() {
        return second;
    }

    int converterIntoSecond() {
        return second = this.hour * 3600 + this.minute * 60 + this.second;
    }

    public int compareTwoObjects(Object o) {
        if (this.converterIntoSecond() > ((TimeInterval) o).converterIntoSecond()) {
            System.out.println("If result is \"1\" it's mean that object One more than object Two");
            return 1;
        } else if (this.converterIntoSecond() < ((TimeInterval) o).converterIntoSecond()) {
            System.out.println("If result is \"-1\" it's mean that object One less than object Two");
            return -1;
        } else {
            System.out.println("If result is \"0\" it's mean that object One equals to object Two");
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if ((o == null) || (getClass() != o.getClass())) return false;
        TimeInterval timeInterval = (TimeInterval) o;
        return ((timeInterval.hour == hour) && (timeInterval.minute == minute) && (timeInterval.second == second));
    }

    @Override
    public int hashCode() {
        return 31 + this.hour + this.minute + this.second;
    }

    @Override
    public String toString() {
        return "This is a object of " + this.getClass().getSimpleName() + " class;" + "\n" +
                "It's consist of :" + "\n"
                + "hour = " + hour + " minute = " + minute + " second = " + second;
    }

    @Override
    public void finalize() {
        System.out.println("Garbage collection is completed");
    }
}

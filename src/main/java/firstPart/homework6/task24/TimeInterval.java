package firstPart.homework6.task24;

public class TimeInterval {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeInterval(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds - hours * 3600) / 60;
        this.seconds = (seconds - hours * 3600) % 60;
    }

    public TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int compareTo(TimeInterval anotherTimeInterval) {
        if (this.getSeconds() > anotherTimeInterval.getSeconds()) {
            return 1;
        } else if (this.getSeconds() == anotherTimeInterval.getSeconds()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "TimeInterval{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}

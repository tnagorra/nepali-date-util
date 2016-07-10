package patro;

public class Ymd {

    protected int y;
    protected int m;
    protected int d;

    public Ymd(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public Ymd(Ymd ymd) {
        y = ymd.y;
        m = ymd.m;
        d = ymd.d;
    }

    public int year() {
        return y;
    }

    public int month() {
        return m;
    }

    public int day() {
        return d;
    }

    public boolean isEqual(Ymd ymd){
        return (y == ymd.y) && (m == ymd.m) && (d == ymd.d);
    }

    public boolean isNotEqual(Ymd ymd) {
        return ! isEqual(ymd);
    }

    public boolean isLessThan(Ymd ymd) {
        return (y < ymd.y) || (y == ymd.y && m < ymd.m) ||
               (y == ymd.y && m == ymd.m && d < ymd.d);
    }

    public boolean isGreaterThan(Ymd ymd) {
        return ! isLessThan(ymd);
    }

    public boolean isLessThanOrEqual(Ymd ymd) {
        return isEqual(ymd) || isLessThan(ymd);
    }

    public boolean isGreaterThanOrEqual(Ymd ymd) {
        return isEqual(ymd) || isGreaterThan(ymd);
    }

}
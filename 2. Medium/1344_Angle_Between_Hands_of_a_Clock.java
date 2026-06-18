class Solution {
    public double angleClock(int hour, int minutes) {
        double m = minutes * 6;
        double h = 30 * (hour + (minutes/60.0));
        double diff = Math.abs(m - h);
        return Math.min(diff, 360 - diff);
    }
}

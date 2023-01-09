public enum Shift {
    MORNING(0600, 1200),
    AFTERNOON(1200, 1800),
    EVENING(1800, 2400),
    NIGHT(2400, 0600);

    final int shiftStart;
    final int shiftEnd;
    private Shift( int shiftStart, int shiftEnd) {
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
    }
}

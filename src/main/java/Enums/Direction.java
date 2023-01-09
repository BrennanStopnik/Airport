package Enums;

public enum Direction {
    NORTH(360),
    SOUTH(180),
    EAST(90),
    WEST(270);

    final int degrees;

    private Direction(int degrees) {
        this.degrees = degrees;
    }
    public Direction getReturnDirection() {
        switch (this) {
            case NORTH:
                return SOUTH;
            case SOUTH:
                return NORTH;
            case EAST:
                return WEST;
            case WEST:
                return EAST;
            default:
                return null;
        }
    }
}

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        return getDirection(LEFT, RIGHT, DOWN, UP);
    }

    private Direction getDirection(Direction left, Direction right, Direction down, Direction up) {
        switch (this) {
            case UP:
                return left;
            case DOWN:
                return right;
            case LEFT:
                return down;
            case RIGHT:
                return up;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        return getDirection(RIGHT, LEFT, UP, DOWN);
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}


class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int posX = robot.getX();
        int posY = robot.getY();

        if (toY > posY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (toY < posY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
        if (toX < posX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        } else if (toX > posX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
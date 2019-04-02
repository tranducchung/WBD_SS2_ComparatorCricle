class Cricle {
    private double radius = Math.random() * 10;

    Cricle() {
    }

    double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Cricle " +
                " radius =" + getRadius();

    }
}

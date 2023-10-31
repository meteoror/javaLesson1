public class Circle {
    private double radius;

    // this is a constructor; same name as class and no return type
    public Circle(double radius) {
        this.radius = radius;
    }

    //this is an accessor (get) 
    public double getRadius() {
        return radius;
    }

    //this is a mutator (set)
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

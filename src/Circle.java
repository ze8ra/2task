public class Circle {
    private double radius;
    public Circle(){
        radius = 5;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public int square() {
        return (int) (Math.PI*radius*radius);
    }
    public static void main(String[] args) {
        System.out.println(new Circle().square());
    }
}

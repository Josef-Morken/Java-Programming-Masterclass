public class Circle {

    private double radius; //the field (instance variable)

    public Circle(double radius) { //constructor with one parameter to initialize the field
        if (radius < 0 ){
            radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

}


public class Cuboid extends Rectangle{

    private double height;

    //single constructor adding the height parameter to the two parameters called
    //from the parent constructor
    public Cuboid(double width, double length, double height) {

        super(width, length); //super for the inherited parameters
        if (height < 0 ){
            height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}

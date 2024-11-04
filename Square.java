public class Square extends Rectangle {

    public Square() {

    }
    public Square(String color, boolean filled, double length, double width) {
        super(color, filled, length, width);
    }


public void setSide(double side) {
    super.setLength(side);

}

public double getArea() {
        return getSide() * getSide();
}

public double getSide() {
   return getLength();
}



}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Shape s1 = new Shape("Yallow", true);

    Circle c1 = new Circle("Yallow", true,90);
    Rectangle r1 = new Rectangle("Yallow", true,100,50);
    Square s2 = new Square("Yallow", true,4,4);

        System.out.println("-----------    Circle -----------");
        System.out.println("Radius: "+c1.getRadius());
        System.out.println("Area: "+c1.getArea());
        System.out.println("Perimeter: "+c1.getPerimeter());
        System.out.println();

        System.out.println("-----------    Rectangle -----------");
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());
        System.out.println();

        System.out.println("-----------    Square -----------");
        System.out.println("Area: "+s2.getArea());
        System.out.println("Perimeter: "+s2.getPerimeter());
         s2.setSide(5);
        System.out.println("Side: "+s2.getSide());
        System.out.println();




    }
}
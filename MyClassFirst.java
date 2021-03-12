package homeCompany;

public class MyClassFirst {

    public static void main(String[] args){
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(3, 3);

        System.out.println(circle.getArea());
        System.out.println(cylinder.getVolume());
        System.out.println(circle.toString());
    }
}

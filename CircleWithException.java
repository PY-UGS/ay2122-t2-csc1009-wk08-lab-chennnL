import java.util.Scanner;

public class CircleWithException {
    private double radius;

    public double getArea() throws Exception {
        if (Math.PI * Math.pow(radius,2) > 1000){
            throw new Exception("Area is abnormally large");
        }
        return Math.PI * Math.pow(radius,2);
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius <= 0){
            throw new IllegalArgumentException("Radius cannot be less than or equal to 0");
        }
        else if (String.valueOf(radius).isEmpty()){
            throw new IllegalArgumentException("Radius cannot be empty");
        }
        else {
            this.radius = radius;
        }
    }

    public static void main(String [] args) throws Exception, IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        CircleWithException cwe = new CircleWithException();
        try {
            System.out.println("Enter the radius: ");
            double radius = sc.nextDouble();
            cwe.setRadius(radius);
            System.out.println("Radius is: " + cwe.getRadius());
            System.out.println("Diameter is: " + cwe.getDiameter());
            System.out.println("Area is: " + cwe.getArea());
        } catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
public static void main(String[] args) {
	Circle circle1 = new Circle(5, "red", true);
	Circle circle2 = new Circle(5, "green", false);
	Circle circle3 = new Circle(4, "green", false);
	System.out.println("The first Circle's radius: " + circle1.getRadius());
	System.out.println("The second Circle's radius: " + circle2.getRadius());
	System.out.println("The third Circle's radius: " + circle3.getRadius());
    System.out.println("The first Circle is " + (circle1.equals(circle2) ? "" : "not ") + "equal to the second circle");
    System.out.println("The first Circle is " + (circle1.equals(circle3) ? "" : "not ") + "equal to the third circle");
	}
}
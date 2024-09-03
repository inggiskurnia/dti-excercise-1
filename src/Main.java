public class Main {
    public static void main(String[] args) {

        // First question
        int rectangleArea = Rectangle.findArea(5,3);
        System.out.println("The area of rectangle is " + rectangleArea);

        // Second question
        int circleDiameter = Circle.findDiameter(5);
        System.out.println("The diameter of the circle is " + circleDiameter);

        double circleCircumference = Circle.findCircumferance(5);
        System.out.println("The circumference of the circle is " + circleCircumference);

        double circleArea = Circle.findArea(5);
        System.out.println("The area of the circle is " + circleArea);

        // Third question
        int triangleAngle = Triangle.findAngle(80, 65);
        System.out.println("The angle of the triangle is " + triangleAngle);

        // Fourth question
        String difference = String.valueOf(Dates.findDifference("2024-03-19", "2024-03-21" ));
        System.out.println("Difference between two dates is " + difference);

        //Fifth question
        String name = Name.findInitials("John Doe");
        System.out.println(name);
    }
}
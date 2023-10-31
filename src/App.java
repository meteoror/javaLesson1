//import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        changeRadius(c1);
        //.. the program print out 10.0 both times! :)
        System.out.println(c1.getRadius());
    }
    // Because Circle is not a primitive value (i.e. a pointer), it still references c1.
    //This means that c1's radius is changed, which makes ...
    public static void changeRadius(Circle c) {
        //Scanner sc = new Scanner(System.in);
        c.setRadius(10.0);
        System.out.println(c.getRadius());
    }
}


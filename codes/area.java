import java.util.*;

class Square extends Thread {
    double side;
    double as;
    Square(double x) {
        side = x;
    }
    public void run() {
        try {
            as = side * side;
			System.out.println("Area of Square: " + as);
        }
		catch (Exception e){
			System.out.println("Exception Caught");
		}

    }

}

class Rectangle extends Thread {
    double length;
	double width;
    double ar;
    Rectangle(double x, double y) {
        length = x;
		width = y;
    }
    public void run() {
        try {
            ar = length * width;
			System.out.println("Area of Rectangle: " + ar);
        }
		catch (Exception e){
			System.out.println("Exception Caught");
		}

    }

}

class Circle extends Thread {
    double radius;
    double ac;
    Circle(double r) {
        radius = r;
    }
    public void run() {
        try {
            ac = 3.14 * radius * radius;
			System.out.println("Area of Circle: " + ac);
        }
		catch (Exception e){
			System.out.println("Exception Caught");
		}

    }

}

public class Main{
	public static void main(String[] args){
		Square s = new Square(2);
		Rectangle r = new Rectangle(6, 5);
		Circle c = new Circle(2);

		s.start();
		r.start();
		c.start();

		try{
			s.join();
			r.join();
			c.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		double n = (r.ar - c.ac - s.as);
		System.out.printf("%.1f", n);
	}
}

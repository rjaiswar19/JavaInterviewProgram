
class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
	
	void play()
	{
		System.out.println("my name is play");
	}
}

public class TestPolymorphism2 {

	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		s.draw();
		Shape s1 = new Circle();
		s1.draw();
		Shape s2 = new Triangle();
		s2.draw();
		s2.draw();
		Triangle t=new Triangle();
		t.draw();
		t.play();
	}

}

package animal;
public class AnimalTest {
	public static void main(String[] args) {
		Eagle e1 = new Eagle(); 
		Eagle e2 = new Eagle();

		Tiger t1 = new Tiger(); 
		Goldfish g1 = new Goldfish();
		e1.eat(); 
		e1.fly(); 
		t1.run(); 
		g1.swim();
	}
}
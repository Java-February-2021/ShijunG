public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("Gorilla is throwing stuff ");
		energyLevel -= 5;
	}
	public void eatBanana() {
		System.out.println("Gorilla is eating bananas");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("Gorilla is climbing");
		energyLevel -= 10;
	}
}
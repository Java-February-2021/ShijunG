
public class Bat extends Mammal{

	public Bat(int energyLevel) {
		super(300);
	}
	public void fly() {
		System.out.println("I am flying bat");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("I am eating humans");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("im attacking");
		energyLevel -= 100;
	}	

}
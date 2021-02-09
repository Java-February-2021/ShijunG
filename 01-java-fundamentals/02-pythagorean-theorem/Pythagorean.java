import java.lang.*;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double sumLegs = Math.pow(legA, 2) + Math.pow(legB, 2);
        double legC = Math.sqrt(sumLegs);
        return (legC);
    }
}
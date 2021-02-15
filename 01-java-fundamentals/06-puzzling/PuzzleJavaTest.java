public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava test = new PuzzleJava();
        int[] x= {3,5,1,2,7,9,8,13,25,32};
        test.printSum(x);
        test.greaterThanY(x, 10);

        String[] list = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        test.shuffleStrings(list);

        test.shuffleAlphabet();
        test.randomNumber();
        test.randomNumber2();
        test.randomString();
        test.randomStringOfStrings();
    
    }
}
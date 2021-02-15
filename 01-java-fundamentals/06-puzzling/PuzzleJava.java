import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {
           
        public void printSum(int[] x){
            int total = 0;
            for(int i = 0; i < x.length; i++){
                total += x[i];
                
            }
            System.out.println( "total: " + total);
        }

        public void greaterThanY(int[] x, int y){
            int num = 0;
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for(int i = 0; i < x.length; i++){
                if(x[i] > y){
                    newArr.add(x[i]);
                }
            }
            System.out.println(newArr);
        }

        public void shuffleStrings(String[] arr){
            ArrayList<String> newList = new ArrayList<String>();
            ArrayList<String> newListlongthan5 = new ArrayList<String>();
            for(int i = 0; i < arr.length; i++){
                if(arr[i].length() > 5){
                    newListlongthan5.add(arr[i]);
                }
                newList.add(arr[i]);
            }
            Collections.shuffle(newList);
            System.out.println(newList);
            System.out.println(newListlongthan5);
        }

        public void shuffleAlphabet(){
            ArrayList<String> letterArray = new ArrayList<String>();
            for(char letter = 'A'; letter <= 'Z'; ++letter){
                letterArray.add(Character.toString(letter));
            }
            System.out.println(letterArray);
            Collections.shuffle(letterArray);
            System.out.println(letterArray);
    
            System.out.println("The First letter is " + letterArray.get(0));
            System.out.println("The Last letter is " + letterArray.get(25));
            String sample = letterArray.get(0);
    
            if("AEIOU".indexOf(sample) > 0){
                System.out.println("The first letter is a vowel!");
            }else {
                System.out.println("The first letter is not a vowel!");
            } 
        } 

        public void randomNumber(){
            ArrayList<Integer> randomNumber = new ArrayList<Integer>();
            for(int i = 0; i < 10; i++){
                int num = ThreadLocalRandom.current().nextInt(55, 101);
                randomNumber.add(num);
            }
            System.out.println(randomNumber);
        }
        public void randomNumber2(){
            ArrayList<Integer> randomNumber2 = new ArrayList<Integer>();
            int min = 101;
            int max = 55;
            for(int i = 0; i < 10; i++){
                int num2 = ThreadLocalRandom.current().nextInt(55, 101);
                randomNumber2.add(num2);
                if(num2 < min){
                    min = num2;
                }
                if(num2 > max){
                    max= num2;
                }
            }
            Collections.sort(randomNumber2);
            System.out.println(randomNumber2);
            System.out.println("the smallest number is: " + min);
            System.out.println("the largest number is: " + max);
        }
    
        public void randomString(){
            Random rand = new Random();
            StringBuilder randString = new StringBuilder();
            String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            for(int i = 0; i < 5; i++){
                randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
            }
            String finalString = randString.toString();
            System.out.println(finalString);
        }
    
        public void randomStringOfStrings(){
            Random rand = new Random();
            StringBuilder randString = new StringBuilder();
            ArrayList<String> randList = new ArrayList<String>();
            String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            for(int i = 0; i <10; i++){
                for(int j = 0; j < 5; j++){
                    randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
                }
                String finalString = randString.toString();
                randList.add(finalString);
                randString.setLength(0);
            }
            System.out.println(randList);
        }
    }
    


    



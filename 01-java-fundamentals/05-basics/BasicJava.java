import java.util.ArrayList;
// Print 1-255
public class BasicJava {
    public static void basicJava(){
        for(int i=1; i<=255; i++){
            System.out.println(i);
        }
    }

// Print odd numbers between 1-255
    public static void oddNum(){
        for(int i=1; i<=255; i++){
            if(i%2==1){
            System.out.println(i);
        }
    }
    }

// pring sum
    public void printSum(){
        int total = 0;
        for(int i = 0; i < 256; i++){
            total += i;
            System.out.println("New number: " + i + " Sum: " + total);
        }
    }

// Iterating through an array

    public void iterateArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

// find max
    public void findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

// Get Average
    public void getAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }

// arrayOddNumbers    
    public void arrayOddNumbers(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i+=2){
            if(i%2==1){
                y.add(i);
            }
        }
        System.out.println(y);
    }

// greaterThanY   
    public void greaterThanY(int[] arr, int y){
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                num++;
            }
        }
        System.out.println(num);
    }

// squareTheValues
    public void squareTheValues(int[] x){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            x[i] = x[i]*x[i];
            y.add(x[i]);
        }
        System.out.println(y);
    }

// eliminateNegativeNumbers   
    public void eliminateNegativeNumbers(int[] x){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
            newArray.add(x[i]);
        }
        System.out.println(newArray);
    }

    // maxMinAvg
    public void maxMinAvg(int[] x){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int min = x[0];
        int max = x[0];
        int sum = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > max){
                max = x[i];
            }
            if(x[i] < min){
                min = x[i];
            }
            sum += x[i];
        }
        int[] result = {max, min, sum/x.length};
        System.out.println(result);
    }

    public void shiftingValues(int[] x){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            if(i == x.length - 1){
                newArray.add(0);
            }
            else{
                newArray.add(x[i+1]);
            }
        }
        System.out.println(newArray);
    }
}



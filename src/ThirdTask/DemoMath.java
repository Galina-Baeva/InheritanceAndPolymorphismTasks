package ThirdTask;

public class DemoMath {
    public static void main(String[] args) {
        int intNumber = 49;
        int powNumber = 3;
        double doubNumber = 3.2;
        int[] intArray = {30, 6, 56, 2, 12};
        double[] doubArray = {7.3, 8.1, 6.7, 23, 125};
        System.out.println("The lowest number in the array  = " + Math.min(intArray));
        System.out.println("the lowest number in the array = " + Math.min(doubArray));
        System.out.println("The biggest number in the array = " + Math.max(intArray));
        System.out.println("The biggest number in the array = " + Math.max(doubArray));
        System.out.println("The number from array that is greater than " + intNumber +  " is " + Math.nextAfter(intArray, intNumber));
        System.out.println("The number from array that is greater than " + doubNumber +  " is " + Math.nextAfter(doubArray, doubNumber));
        System.out.println(intNumber + " raised to the power of " + powNumber + " = " + Math.pow(intNumber, powNumber));
        System.out.println(doubNumber + " raised to the power of " + powNumber + " = " + Math.pow(doubNumber, powNumber));

    }

}

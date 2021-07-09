package ThirdTask;

public class Math {

    static int min(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    static double min(double[] array) {
        double minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    static int max(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    static double max(double[] array) {
        double maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    static int nextAfter(int[] array, int number) {
        for (int i = 0; i < array.length; i++){
            if (array[i] > number) {
                return array[i];
            }
        }
        return 0;
    }

    static double nextAfter(double[] array, double number) { ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                return array[i];
            }
        }
        return 0;
    }

    static int pow(int number, int powNumber) {
        int result = 1;
        for (int i = 0; i < powNumber; i++) {
            result = result * number;
        }
        return result;
    }

    static double pow(double number, int powNumber) {
        double result = 1;
        for (int i = 0; i < powNumber; i++) {
            result = result * number;
        }
        return result;
    }

}

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {544, 1, 12, 7, 449, 99, 66, 32, 43, 17, 19, 999};
        sort(numbers);
    }

    public static void sort(int[] numbers) {
        boolean sortAgain = false;

        int lastPosition = numbers.length - 1;
        for (int currentPosition = 0; currentPosition < lastPosition; currentPosition++) {
            int nextPosition = currentPosition + 1;

            int currentNumber = numbers[currentPosition];
            int nextNumber = numbers[nextPosition];

            boolean shouldSwapCurrentWithNext = currentNumber > nextNumber;
            if (shouldSwapCurrentWithNext) {
                sortAgain = true;
                swapCurrentWithNext(numbers, currentPosition);
                printNumbers(numbers, currentPosition, nextPosition);
            }
        }
        if (sortAgain) {
            sort(numbers);
        }
    }

    public static void swapCurrentWithNext(int[] numbers, int currentPosition) {
        int currentValue = numbers[currentPosition];
        numbers[currentPosition] = numbers[currentPosition + 1];
        numbers[currentPosition + 1] = currentValue;
    }

    public static void printNumbers(int[] numbers, int currentPosition, int nextPosition) {
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            if (i == currentPosition) {
                System.out.print("  [" + value + "] " );
            }
            else if (i == nextPosition) {
                System.out.print("<- [" + value + "]  " );
            }
            else  {
                System.out.print("   " + value + "   ");
            }
        }
        System.out.println();
    }

}

public class QuestionFour {
    public static int findMaximum(int[] numbs) {
        if (numbs == null || numbs.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = numbs[0];
        for (int i = 1; i < numbs.length; i++) {
           
            if (numbs[i] > max) {
                max = numbs[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbs = {16, 14, 34, 24, 15,39,85};
        int maxNumb = findMaximum(numbs);
        System.out.println("The maximum element in the array is: " + maxNumb);
    }
}

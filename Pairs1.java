public class Pairs1 {

    private static int[] pairSum(int[] array, int sum) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3, -6, 9, 11};
        System.out.println(Arrays.toString(pairSum(array, 4)));
    }
}

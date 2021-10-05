public class Pairs {

    private static int[] pairSum2(int[] array, int sum) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            int index = binSearch(array, i + 1, sum - array[i]);
            if (index != -1) {
                return new int[]{array[i], array[index]};
            }
        }
        return new int[]{};
    }

    private static int binSearch(int[] array, int startIndex, int num) {
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            if (array[midIndex] == num) {
                return midIndex;
            } else if (array[midIndex] < num) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3, -6, 9, 11};
        System.out.println(Arrays.toString(pairSum2(array, 4)));
    }
}

public class Pairs {

    private static int[] pairSum3(int[] array, int sum) {
        Arrays.sort(array);
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                return new int[]{array[i], array[j]};
            } else if (array[i] + array[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3, -6, 9, 11};
        System.out.println(Arrays.toString(pairSum3(array, 4)));
    }
}

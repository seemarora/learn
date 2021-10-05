public class Pairs4 {

    private static int[] pairSum4(int[] array, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(sum - array[i])) {
                return new int[]{array[i], sum - array[i]};
            }
            set.add(array[i]);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3, -6, 9, 11};
        System.out.println(Arrays.toString(pairSum4(array, 4)));
    }
}

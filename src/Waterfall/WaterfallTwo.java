package Waterfall;

public class WaterfallTwo {
    public static void main(String[] args) {
        int[][] input = new int[][] {
                { 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 1, 1, 1, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 0 },
        };

        System.out.println(input.length);

        pourWater(input, 2);

    }

    public static void pourWater(int array[][], int y) {

        int result[] = new int[7];
        util(array, 0, y, 100, result);

        for (int bucket : result) {
            System.out.print(bucket + ", ");
        }

    }

    public static void util(int array[][], int x, int y, int percentage, int result[]) {
        if (array.length - 1 == x) {
            result[y] = percentage;
            return;
        }

        if (array[x][y] == 0) {
            util(array, x + 1, y, percentage, result);
        }
        if (array[x][y] == 1) {
            if (y + 1 < array[x].length)
                util(array, x + 1, y + 1, percentage / 2, result);
            if (y - 1 > -1)
                util(array, x + 1, y - 1, percentage / 2, result);
        }

    }

}

import java.util.Scanner;

public class MinMaxComplete {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));

        int[] result = findMinMax(arr);

        System.out.println("Both from one method:");
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);

        scanner.close();
    }
}

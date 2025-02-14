import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        findNonRepeating(arr);
        scanner.close();
    }

    public static void findNonRepeating(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                System.out.print(arr[i] + " ");
                count++;
                if (count == 2) break;
            }
        }
    }
}

import java.util.Scanner;

public class ArrayMerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first array
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Read second array
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Read third array
        int n3 = scanner.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = scanner.nextInt();
        }

        // Merge arrays
        int[] mergedArray = new int[n1 + n2 + n3];
        int i = 0, j = 0, k = 0, m = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] <= arr2[j] && arr1[i] <= arr3[k]) {
                mergedArray[m++] = arr1[i++];
            } else if (arr2[j] <= arr1[i] && arr2[j] <= arr3[k]) {
                mergedArray[m++] = arr2[j++];
            } else {
                mergedArray[m++] = arr3[k++];
            }
        }

        while (i < n1 && j < n2) {
            mergedArray[m++] = (arr1[i] <= arr2[j]) ? arr1[i++] : arr2[j++];
        }

        while (j < n2 && k < n3) {
            mergedArray[m++] = (arr2[j] <= arr3[k]) ? arr2[j++] : arr3[k++];
        }

        while (i < n1 && k < n3) {
            mergedArray[m++] = (arr1[i] <= arr3[k]) ? arr1[i++] : arr3[k++];
        }

        while (i < n1) {
            mergedArray[m++] = arr1[i++];
        }

        while (j < n2) {
            mergedArray[m++] = arr2[j++];
        }

        while (k < n3) {
            mergedArray[m++] = arr3[k++];
        }

        // Print merged array
        for (int x = 0; x < mergedArray.length; x++) {
            System.out.print(mergedArray[x] + " ");
        }
        scanner.close();
    }
}

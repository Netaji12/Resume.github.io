import java.util.Scanner;

class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result = binarysearch(arr, n, k);
        System.out.println(result);
    }

    static int binarysearch(int arr[], int n, int k) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
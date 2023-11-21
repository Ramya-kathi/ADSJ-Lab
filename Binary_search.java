//the array must be in ascending order and time complexity os O(logn)
import java.util.*;

public class Main {

    static int Binary(int a[], int el, int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (a[mid] == el)
                return mid;

            if (a[mid] < el)
                low = mid + 1; 
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array")
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched:");
        int el = sc.nextInt();

        int x = Binary(a, el, n);

        if (x == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element " + el + " found at index " + x);
    }
}

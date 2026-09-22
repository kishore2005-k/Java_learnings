//third method to print array elements using Arrays.toString() method
import java.util.Arrays;

public class Arraydemo3{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print array
        System.out.println(Arrays.toString(arr));

        // Print length
        System.out.println(arr.length);

         // Compare arrays
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(arr, arr2));

        // Binary search
        System.out.println(Arrays.binarySearch(arr, 2));

        // Sort array (in place)
        Arrays.sort(arr);
        System.out.println("After sort: " + Arrays.toString(arr));

        // Fill array (in place)
        Arrays.fill(arr, 3);
        System.out.println("After fill: " + Arrays.toString(arr));

    
    }
}

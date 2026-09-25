public class LeftAlignedTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) {
            // Print stars for each row equal to the row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing stars in current row
            System.out.println();
        }
    }
}
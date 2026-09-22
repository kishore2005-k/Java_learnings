import java.util.*;

public class main {
    public static void main(String[] args) {
        String name;
        int age;
        double gpa;
        boolean isenrolled;
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter your age");
        age = sc.nextInt();

        System.out.println("Enter your gpa");
        gpa = sc.nextDouble();

        System.out.println("Are you enrolled? (true/false)");
        isenrolled = sc.nextBoolean();

        System.out.println("Enter your marks");
        // Read marks and calculate total
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            total += marks[i]; // accumulate total
        }
        // Calculate average
        double average = (double) total / marks.length;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Enrolled: " + isenrolled);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

         //grade calculation
        char grade;
        if (total <= 500) {
            System.out.println("Grade: A");
        } else if (total <= 450) {
            System.out.println("Grade: B");
        } else if (total <= 350) {
            System.out.println("Grade: C");
        } else if (total <= 300) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        

    }
}

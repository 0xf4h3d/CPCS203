
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String courseCode = "", courseNumber = "";
        int year, semester, srn;

        System.out.println("Course ID Generator:");
        System.out.println("----------------------------------");
        System.out.println("Please Enter Course Information");

        while (true) {
            System.out.print("Course Code (only capital letters with a length between 2 and 4):");
            courseCode = input.nextLine();
            if (courseCode.length() < 2 || courseCode.length() > 4) {
                System.out.println("Course Code length was not between 2 and 4 , Please try again");
            } else if (!courseCode.matches("[A-Z]+")) {
                System.out.println("Course Code must only have capital letters , Please try again");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Course Number (consist only of 3 digits):");
            courseNumber = input.nextLine();
            if (courseNumber.length() != 3) {
                System.out.println("Course Number length was not 3 , Please try again");
            } else if (!courseNumber.matches("\\d{3}")) {
                System.out.println("Course Number must only be digits , Please try again");
            } else {
                break;
            }
        }

        System.out.print("Year:");
        year = input.nextInt();

        while (true) {
            System.out.print("Semester (Fall=01, Sprint=02, Summer=03):");
            semester = input.nextInt();
            if (semester < 1 || semester > 3) {
                System.out.println("Please enter correct semester code, try again");
            } else {
                break;
            }
        }

        System.out.print("Course Reference Number:");
        srn = input.nextInt();

        StringBuilder courseID = new StringBuilder();
        courseID.append(courseCode);
        courseID.append(courseNumber);
        courseID.append("-");
        courseID.append(year);
        courseID.append(String.format("%02d", semester));
        courseID.append("-");
        courseID.append(srn);

        System.out.println("----------------------------------");
        System.out.println("Generated Course ID: " + courseID);
    }
}


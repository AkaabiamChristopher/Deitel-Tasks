import java.util.Scanner;

public class StudentGrade {
    private String courseName;
    private int[][] grades;

    public StudentGrade(String courseName, int students, int exams) {
        this.courseName = courseName;
        this.grades = new int[students][exams];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < exams; j++) {
                grades[i][j] = -1;
            }
        }
    }

    public void setGrade(int student, int exam, int grade) {
        if (student >= 0 && student < grades.length && exam >= 0 && exam < grades[0].length && grade >= 0 && grade <= 100) {
            grades[student][exam] = grade;
        } else {
            System.out.println("Invalid student, exam, or grade.");
        }
    }

    public void processGrades() {
        outputGrades();
        System.out.printf("The Lowest grade is %d%n", getMinimum());
        System.out.printf("The Highest grade is %d%n", getMaximum());
    }

    public int getMinimum() {
        int lowGrade = Integer.MAX_VALUE;
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade != -1 && grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade == Integer.MAX_VALUE ? -1 : lowGrade; 
    }

    public int getMaximum() {
        int highGrade = Integer.MIN_VALUE;
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade != -1 && grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade == Integer.MIN_VALUE ? -1 : highGrade; 
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;
        int count = 0;
        for (int grade : setOfGrades) {
            if (grade != -1) {
                total += grade;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return (double) total / count;
    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("            ");
        for (int exam = 0; exam < grades[0].length; exam++) {
            System.out.printf("Exam %d ", exam + 1);
        }
        System.out.println("Average");
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d ", student + 1);
            for (int exam = 0; exam < grades[student].length; exam++) {
                if (grades[student][exam] != -1) {
                    System.out.printf("%6d ", grades[student][exam]);
                }
                }
            
            double average = getAverage(grades[student]);
            System.out.printf("%6.2f%n", average);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String courseName = input.nextLine();
        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        System.out.print("Enter number of exams: ");
        int exams = input.nextInt();

        StudentGrade gradeBook = new StudentGrade(courseName, students, exams);

        
        for (int student = 0; student < students; student++) {
            System.out.printf("Enter Student Grade%d:%n", student + 1);
            for (int exam = 0; exam < exams; exam++) {
                System.out.printf("Enter Exam Score for Student %d: ", exam + 1);
                int grade = input.nextInt();
                gradeBook.setGrade(student, exam, grade);
            }
        }

        System.out.println("\nStudent Grade for " + courseName);
        gradeBook.processGrades();

       
    }
}
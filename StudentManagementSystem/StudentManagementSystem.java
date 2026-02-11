import java.util.Scanner;

public class StudentManagementSystem {

    static class Student {
        String name;
        int id;
        double grade;

        public Student(String name, int id, double grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }

        public void display() {
            System.out.println("Name  : " + name);
            System.out.println("ID    : " + id);
            System.out.println("Grade : " + grade);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            scanner.nextLine(); 

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();

            students[i] = new Student(name, id, grade);
        }

        Student topStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].grade > topStudent.grade) {
                topStudent = students[i];
            }
        }

        System.out.println("\n===== Highest Performing Student =====");
        topStudent.display();

        scanner.close();
    }
}

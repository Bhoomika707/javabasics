import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String code;
    String title;
    int capacity;

    public Course(String code, String title, int capacity) {
        this.code = code;
        this.title = title;
        this.capacity = capacity;
    }
}

public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Course> registeredCourses = new ArrayList<>();

        courses.add(new Course("CS101", "Java Programming", 2));
        courses.add(new Course("CS102", "Data Structures", 3));
        courses.add(new Course("CS103", "Database Management", 2));

        int choice;

        do {
            System.out.println("\n===== Course Registration System =====");
            System.out.println("1. View Courses");
            System.out.println("2. Register Course");
            System.out.println("3. Drop Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Courses:");
                    for (Course c : courses) {
                        System.out.println(c.code + " - " + c.title + " | Seats: " + c.capacity);
                    }
                    break;

                case 2:
                    System.out.print("Enter Course Code: ");
                    String code = sc.next();

                    boolean found = false;

                    for (Course c : courses) {
                        if (c.code.equalsIgnoreCase(code)) {

                            found = true;

                            if (c.capacity > 0) {
                                registeredCourses.add(c);
                                c.capacity--;
                                System.out.println("Course Registered Successfully.");
                            } else {
                                System.out.println("No seats available.");
                            }
                        }
                    }

                    if (!found)
                        System.out.println("Course not found.");

                    break;

                case 3:

                    System.out.print("Enter Course Code to Drop: ");
                    String drop = sc.next();

                    boolean removed = false;

                    for (int i = 0; i < registeredCourses.size(); i++) {

                        if (registeredCourses.get(i).code.equalsIgnoreCase(drop)) {

                            registeredCourses.get(i).capacity++;

                            registeredCourses.remove(i);

                            System.out.println("Course Dropped.");

                            removed = true;
                            break;
                        }
                    }

                    if (!removed)
                        System.out.println("You are not registered for this course.");

                    break;

                case 4:

                    System.out.println("\nRegistered Courses:");

                    if (registeredCourses.isEmpty()) {
                        System.out.println("No courses registered.");
                    } else {

                        for (Course c : registeredCourses) {
                            System.out.println(c.code + " - " + c.title);
                        }
                    }

                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);

        sc.close();
    }
}
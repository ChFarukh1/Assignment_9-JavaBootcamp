import java.util.ArrayList;
import java.util.Scanner;


class Course {
    String c_code;
    String name;

    public Course(String c_code, String name) {
        this.c_code = c_code;
        this.name = name;
    }
}
class Section {
    String name;
    String day;
    String room;

    public Section(String name, String day, String room) {
        this.name = name;
        this.day = day;
        this.room = room;
    }
}
class Student {
    String sid;
    String name;
    String ph_no;
    String email;
    String address;

    public Student(String sid, String name, String ph_no, String email, String address) {
        this.sid = sid;
        this.name = name;
        this.ph_no = ph_no;
        this.email = email;
        this.address = address;
    }
}
class Teacher {
    String emp_code;
    String name;
    double salary;
    String depart;
    String address;
    String ph_no;

    public Teacher(String emp_code, String name, double salary, String depart, String address, String ph_no) {
        this.emp_code = emp_code;
        this.name = name;
        this.salary = salary;
        this.depart = depart;
        this.address = address;
        this.ph_no = ph_no;
    }
}

class Attendance {
    String attendance_mark;
    String date;
    String time;

    public Attendance(String attendance_mark, String date, String time) {
        this.attendance_mark = attendance_mark;
        this.date = date;
        this.time = time;
    }
}

class CourseEnrollment {
    String c_code;
    String sid;
    String date;
    String time;
    String status;

    public CourseEnrollment(String c_code, String sid, String date, String time, String status) {
        this.c_code = c_code;
        this.sid = sid;
        this.date = date;
        this.time = time;
        this.status = status;
    }
}

class University {
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Section> sections = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Attendance> attendanceList = new ArrayList<>();
    static ArrayList<CourseEnrollment> enrollments = new ArrayList<>();

    // CRUD operations for Courses
    public static void addCourse(String c_code, String name) {
        courses.add(new Course(c_code, name));
        System.out.println("Course added successfully!");
    }

    public static void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course c : courses) {
                System.out.println("Code: " + c.c_code + ", Name: " + c.name);
            }
        }
    }

    public static void removeCourse(String c_code) {
        courses.removeIf(course -> course.c_code.equals(c_code));
        System.out.println("Course removed successfully!");
    }

    // CRUD operations for Students
    public static void addStudent(String sid, String name, String ph_no, String email, String address) {
        students.add(new Student(sid, name, ph_no, email, address));
        System.out.println("Student added successfully!");
    }

    public static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                System.out.println("ID: " + s.sid + ", Name: " + s.name);
            }
        }
    }

    public static void removeStudent(String sid) {
        students.removeIf(student -> student.sid.equals(sid));
        System.out.println("Student removed successfully!");
    }

    // CRUD operations for Teachers
    public static void addTeacher(String emp_code, String name, double salary, String depart, String address, String ph_no) {
        teachers.add(new Teacher(emp_code, name, salary, depart, address, ph_no));
        System.out.println("Teacher added successfully!");
    }

    public static void listTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers available.");
        } else {
            for (Teacher t : teachers) {
                System.out.println("Employee Code: " + t.emp_code + ", Name: " + t.name);
            }
        }
    }

    public static void removeTeacher(String emp_code) {
        teachers.removeIf(teacher -> teacher.emp_code.equals(emp_code));
        System.out.println("Teacher removed successfully!");
    }

    // CRUD operations for Sections
    public static void addSection(String name, String day, String room) {
        sections.add(new Section(name, day, room));
        System.out.println("Section added successfully!");
    }

    public static void listSections() {
        if (sections.isEmpty()) {
            System.out.println("No sections available.");
        } else {
            for (Section s : sections) {
                System.out.println("Section: " + s.name + ", Day: " + s.day + ", Room: " + s.room);
            }
        }
    }

    public static void removeSection(String name) {
        sections.removeIf(section -> section.name.equals(name));
        System.out.println("Section removed successfully!");
    }
}

public class AttendanceManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Attendance Management System ---");
            System.out.println("1. Add Course");
            System.out.println("2. List Courses");
            System.out.println("3. Remove Course");
            System.out.println("4. Add Student");
            System.out.println("5. List Students");
            System.out.println("6. Remove Student");
            System.out.println("7. Add Teacher");
            System.out.println("8. List Teachers");
            System.out.println("9. Remove Teacher");
            System.out.println("10. Add Section");
            System.out.println("11. List Sections");
            System.out.println("12. Remove Section");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter course code: ");
                    String c_code = sc.next();
                    System.out.print("Enter course name: ");
                    String name = sc.next();
                    University.addCourse(c_code, name);
                    break;

                case 2:
                    University.listCourses();
                    break;

                case 3:
                    System.out.print("Enter course code to remove: ");
                    String c_code_remove = sc.next();
                    University.removeCourse(c_code_remove);
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    String sid = sc.next();
                    System.out.print("Enter student name: ");
                    String studentName = sc.next();
                    System.out.print("Enter phone number: ");
                    String ph_no = sc.next();
                    System.out.print("Enter email: ");
                    String email = sc.next();
                    System.out.print("Enter address: ");
                    String address = sc.next();
                    University.addStudent(sid, studentName, ph_no, email, address);
                    break;

                case 5:
                    University.listStudents();
                    break;

                case 6:
                    System.out.print("Enter student ID to remove: ");
                    String sid_remove = sc.next();
                    University.removeStudent(sid_remove);
                    break;

                case 7:
                    System.out.print("Enter teacher employee code: ");
                    String emp_code = sc.next();
                    System.out.print("Enter teacher name: ");
                    String teacherName = sc.next();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    System.out.print("Enter department: ");
                    String depart = sc.next();
                    System.out.print("Enter address: ");
                    String teacherAddress = sc.next();
                    System.out.print("Enter phone number: ");
                    String teacherPh_no = sc.next();
                    University.addTeacher(emp_code, teacherName, salary, depart, teacherAddress, teacherPh_no);
                    break;

                case 8:
                    University.listTeachers();
                    break;

                case 9:
                    System.out.print("Enter teacher employee code to remove: ");
                    String emp_code_remove = sc.next();
                    University.removeTeacher(emp_code_remove);
                    break;

                case 10:
                    System.out.print("Enter section name: ");
                    String sectionName = sc.next();
                    System.out.print("Enter day: ");
                    String day = sc.next();
                    System.out.print("Enter room: ");
                    String room = sc.next();
                    University.addSection(sectionName, day, room);
                    break;

                case 11:
                    University.listSections();
                    break;

                case 12:
                    System.out.print("Enter section name to remove: ");
                    String sectionName_remove = sc.next();
                    University.removeSection(sectionName_remove);
                    break;

                case 0:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
        sc.close();
    }
}

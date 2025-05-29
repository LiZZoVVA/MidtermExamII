package oop.mid2.t2;

import java.util.ArrayList;
import java.util.List;

public class UMS {
    private List<Student> students;

    public UMS() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudentData(Student student) {
        System.out.println("=== Student Information ===");
        System.out.println(student);
        System.out.println("\n=== Enrolled Courses ===");

        // Special case for myself (replace with your actual name and courses from Argus)
        if (student.getName().equals("Your Name")) {
            List<LearningCourse> myCourses = getMyArgusCourses();
            for (LearningCourse course : myCourses) {
                System.out.println("\n" + course);
            }
        } else {
            for (LearningCourse course : student.getLearningCourses()) {
                System.out.println("\n" + course);
            }
        }
        System.out.println("\n--------------------------");
    }

    private List<LearningCourse> getMyArgusCourses() {
        List<LearningCourse> courses = new ArrayList<>();
        // Replace these with your actual courses from Argus
        courses.add(new LearningCourse("Object Oriented Programming",
                "Basic programming knowledge",
                "Inheritance, Polymorphism, Encapsulation"));
        courses.add(new LearningCourse("Data Structures",
                "Basic programming knowledge",
                "Arrays, Linked Lists, Trees, Graphs"));
        courses.add(new LearningCourse("Algorithms",
                "Data Structures knowledge",
                "Sorting, Searching, Dynamic Programming"));
        return courses;
    }

    public static void main(String[] args) {
        UMS ums = new UMS();

        // Create 5 students
        Student student1 = new Student("John Doe", "S001");
        student1.addLearningCourse(new LearningCourse("Mathematics", "None", "Algebra, Calculus"));
        student1.addLearningCourse(new LearningCourse("Physics", "Mathematics", "Mechanics, Thermodynamics"));

        Student student2 = new Student("Jane Smith", "S002");
        student2.addLearningCourse(new LearningCourse("Chemistry", "Basic Science", "Organic, Inorganic"));
        student2.addLearningCourse(new LearningCourse("Biology", "Basic Science", "Genetics, Ecology"));

        Student student3 = new Student("Bob Johnson", "S003");
        student3.addLearningCourse(new LearningCourse("Computer Science", "Math basics", "Programming, Databases"));
        student3.addLearningCourse(new LearningCourse("Statistics", "Mathematics", "Probability, Data Analysis"));

        Student student4 = new Student("Alice Williams", "S004");
        student4.addLearningCourse(new LearningCourse("Literature", "None", "Poetry, Prose"));
        student4.addLearningCourse(new LearningCourse("History", "None", "Ancient, Modern"));

        // This should be you - replace "Your Name" with your actual name
        Student student5 = new Student("Elizaveta Darsalia", "S005");
        student5.addLearningCourse(new LearningCourse("CalculusII", "CalculusI", "Antiderivatives, " +
                "Definite integrals, " +
                "Techniques and applications of integration, " +
                "Improper integrals, " +
                "Infinite series, "));
        student5.addLearningCourse(new LearningCourse("OOP", "CS50 Intro to programming", "Java syntax and data structures, Procedural programming, Classes, Encapsulation, polymorphism, inheritance, Packages, Working with the network, Work with files, Working with text data; Work with the terminal"));
        student5.addLearningCourse(new LearningCourse("Computer Organization", "CS50 Introduction to Programming", "Representing and manipulating information; Machine-level representations of programs; Optimizing program performance; The memory hierarchy"));
        student5.addLearningCourse(new LearningCourse("Mathematical Foundation of Computing", "MATH 150 Calculus I; CS50 Introduction to Programming", "Mathematical Logic; Elements of Discrete Mathematics; Elements of Sets Theory; Elements of Graph Theory; Elements of Combinatorics; Elements of Digital Systems "));
        student5.addLearningCourse(new LearningCourse("English C1-2", "English C1-2", "Culture, " +
                " Interpretation, " +
                " Persuasion, " +
                " Connection, " +
                " Technology, " +
                " Independence"));
        // Add students to UMS
        ums.addStudent(student1);
        ums.addStudent(student2);
        ums.addStudent(student3);
        ums.addStudent(student4);
        ums.addStudent(student5);

        // Print student data
        for (Student student : ums.students) {
            ums.printStudentData(student);
        }
    }
}
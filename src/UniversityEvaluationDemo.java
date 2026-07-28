// Task 1 - University Evaluation System
// Demonstrates Abstract Class, Abstract Methods and Runtime Polymorphism

// Abstract Class
abstract class StudentEvaluation {

    protected int studentId;
    protected String studentName;

    public StudentEvaluation(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Concrete Method
    public void displayStudentDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
    }

    // Abstract Methods
    public abstract int calculateTotalMarks();

    public abstract void displayGrade();
}

// UG Evaluation
class UGCourseEvaluation extends StudentEvaluation {

    private int internalMarks;
    private int assignmentMarks;
    private int externalMarks;

    public UGCourseEvaluation(int studentId, String studentName,
                              int internalMarks, int assignmentMarks, int externalMarks) {

        super(studentId, studentName);

        this.internalMarks = internalMarks;
        this.assignmentMarks = assignmentMarks;
        this.externalMarks = externalMarks;
    }

    @Override
    public int calculateTotalMarks() {
        return internalMarks + assignmentMarks + externalMarks;
    }

    @Override
    public void displayGrade() {

        int total = calculateTotalMarks();

        System.out.println("Course        : UG");
        System.out.println("Total Marks   : " + total);

        if (total >= 90)
            System.out.println("Grade         : A+");
        else if (total >= 80)
            System.out.println("Grade         : A");
        else if (total >= 70)
            System.out.println("Grade         : B");
        else if (total >= 60)
            System.out.println("Grade         : C");
        else
            System.out.println("Grade         : Fail");
    }
}

// PG Evaluation
class PGCourseEvaluation extends StudentEvaluation {

    private int seminarMarks;
    private int projectMarks;
    private int theoryMarks;

    public PGCourseEvaluation(int studentId, String studentName,
                              int seminarMarks, int projectMarks, int theoryMarks) {

        super(studentId, studentName);

        this.seminarMarks = seminarMarks;
        this.projectMarks = projectMarks;
        this.theoryMarks = theoryMarks;
    }

    @Override
    public int calculateTotalMarks() {
        return seminarMarks + projectMarks + theoryMarks;
    }

    @Override
    public void displayGrade() {

        int total = calculateTotalMarks();

        System.out.println("Course        : PG");
        System.out.println("Total Marks   : " + total);

        if (total >= 85)
            System.out.println("Grade         : Distinction");
        else if (total >= 75)
            System.out.println("Grade         : First Class");
        else if (total >= 60)
            System.out.println("Grade         : Second Class");
        else
            System.out.println("Grade         : Fail");
    }
}

// Certificate Evaluation
class CertificateCourseEvaluation extends StudentEvaluation {

    private int practicalMarks;
    private int testMarks;

    public CertificateCourseEvaluation(int studentId, String studentName,
                                       int practicalMarks, int testMarks) {

        super(studentId, studentName);

        this.practicalMarks = practicalMarks;
        this.testMarks = testMarks;
    }

    @Override
    public int calculateTotalMarks() {
        return practicalMarks + testMarks;
    }

    @Override
    public void displayGrade() {

        int total = calculateTotalMarks();

        System.out.println("Course        : Certificate");
        System.out.println("Total Marks   : " + total);

        if (total >= 90)
            System.out.println("Grade         : Excellent");
        else if (total >= 75)
            System.out.println("Grade         : Very Good");
        else if (total >= 60)
            System.out.println("Grade         : Good");
        else
            System.out.println("Grade         : Fail");
    }
}

// New Course Type (Added without modifying StudentEvaluation)
class DiplomaCourseEvaluation extends StudentEvaluation {

    private int labMarks;
    private int vivaMarks;
    private int theoryMarks;

    public DiplomaCourseEvaluation(int studentId, String studentName,
                                   int labMarks, int vivaMarks, int theoryMarks) {

        super(studentId, studentName);

        this.labMarks = labMarks;
        this.vivaMarks = vivaMarks;
        this.theoryMarks = theoryMarks;
    }

    @Override
    public int calculateTotalMarks() {
        return labMarks + vivaMarks + theoryMarks;
    }

    @Override
    public void displayGrade() {

        int total = calculateTotalMarks();

        System.out.println("Course        : Diploma");
        System.out.println("Total Marks   : " + total);

        if (total >= 90)
            System.out.println("Grade         : Outstanding");
        else if (total >= 75)
            System.out.println("Grade         : Excellent");
        else if (total >= 60)
            System.out.println("Grade         : Good");
        else
            System.out.println("Grade         : Fail");
    }
}

// Driver Class
public class UniversityEvaluationDemo {

    public static void main(String[] args) {

        StudentEvaluation[] students = {

                new UGCourseEvaluation(101, "Arjun", 25, 20, 45),
                new PGCourseEvaluation(102, "Meera", 25, 30, 35),
                new CertificateCourseEvaluation(103, "Rahul", 48, 45),
                new UGCourseEvaluation(104, "Sneha", 28, 18, 42),
                new DiplomaCourseEvaluation(105, "David", 30, 28, 35)

        };

        System.out.println("===== UNIVERSITY EVALUATION SYSTEM =====\n");

        for (StudentEvaluation student : students) {

            student.displayStudentDetails();
            student.displayGrade();
            System.out.println();

        }
    }
}
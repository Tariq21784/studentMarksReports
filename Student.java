//Design a program using a console application in java NetBeans named studentMarksReport 
//that will print the final result obtained by a student with the weighting of each module. 
//Make use of a class named Student that contains variables to store the student number, test result, assignment
//result and exam. 
//Create a constructor that accepts the student number, test result, assignment result 
//and the exam result as parameters and create get methods for the variables
//(UseJOptionePane to get variable from the user). 
//Create a subclass called Student_Report that extends the Student class. 
//The Student_Report overrides all getter methods and the constructor from Students. 
//Write code for the print_report method which calculates each assessment
//weighting as follows:

package studentMarksReport;
import javax.swing.JOptionPane;


public abstract class Student {

    private int studentNumber;
    private int test;
    private int assignment;
    private int examResults;
    
    //Create a constructor that accepts the student number, test result, assignment result 
    //and the exam result as parameters and create get methods for the variables
    public Student(int studentNumber, int test, int assignment, int examResults) {
        this.studentNumber = studentNumber;
        this.test = test;
        this.assignment = assignment;
        this.examResults = examResults;
    }

    //Write code for the print_report method which calculates each assessment
    //weighting as follows:
    public void print_report() {
        
        System.out.println("Student number: " + studentNumber);
        System.out.println("Test weight: " + (test * 0.25));
        System.out.println("Assignment weight: " + (assignment * 0.25));
        System.out.println("Exam weight: " + (examResults * 0.5));
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public int getTest() {
        return test;
    }
    public void setTest(int test) {
        this.test = test;
    }
    public int getAssignment() {
        return assignment;
    }
    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }
    public int getExamResults() {
        return examResults;
    }
    public void setExamResults(int examResults) {
        this.examResults = examResults;
    }
}

// Create a subclass called Student_Report that extends the Student class.
public class Student_Report extends Student{
    private String studentNumber;
    private String testResult;
    private String assignmentResult;
    private String examResult;

    @Override
    public String getStudentNumber(){
        return studentNumber;
    }

    @Override
    public void setStudentNumber(String number){
        studentNumber = number;
    }

    @Override
    public String getTestResult() {
        return testResult;
    }

    @Override
    public void setTestResult(String number) {
        testResult = number;
    }

    @Override
    public String getAssignmentResult() {
        return assignmentResult;
    }

    @Override
    public void setAssignmentResult(String number) {
        assignmentResult = number;
    }

    @Override
    public String getExamResult() {
        return examResult;
    }

    @Override
    public void setExamResult(String number) {
        examResult = number;
    }

}

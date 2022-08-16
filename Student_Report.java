/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentMarksReport;

/**
 *
 * @author arnol
 */
public class Student_Report extends Student{
    //JD521 Likhaya A. Faku 9885
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
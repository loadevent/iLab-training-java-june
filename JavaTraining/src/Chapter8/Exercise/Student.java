package Chapter8.Exercise;

public class Student implements IStudent {
    private String stName;
    private int testMark;
    //                    Kabelo
    public Student(String stName, int testMark) {
        setStName(stName);//Kabelo
        this.testMark = testMark;
    }

    public String getStName() {
        return stName;
    }
                        //La
    public void setStName(String stName) {
        if (stName.length() < 3){
            throw new IllegalArgumentException("Student name should be 3 characters or more");
        }
        this.stName = stName;//Kabelo
    }

    public int getTestMark() {
        return testMark;
    }

    public void setTestMark(int testMark) {
        this.testMark = testMark;
    }

    private String determineResults(String grade) {
        String result = "Fail";

        switch (grade){
            case "A" : result = "Outstanding";
                break;
            case "B" : result = "Excellent";
                break;
            case "C" : result = "Pass";
                break;
            case "D" : result = "Need some work";
                break;
            case "F" : result = "Fail";
        }

        return result;//Pass
    }

    private String determineSymbol(int testMark) throws Exception {
        String grade = "F";

        if (testMark >= 0 && testMark <= 100){
            if (testMark >= 80){ //80+
                grade = "A";
            }else if(testMark >= 60){ //79
                grade = "B";
            } else if (testMark >= 50) {//59
                grade = "C";
            } else if (testMark >= 40) {//49
                grade = "D";
            }else{
                grade = "F";//39-
            }
        }else{
            throw new Exception("Test mark should be from 0 to 100");

        }
        return grade;//C
    }
    @Override
    public String getGrade() throws Exception {

        return determineSymbol(this.testMark);
    }
    @Override
    public String geResults() throws Exception {
        return determineResults(getGrade());
    }

    @Override
    public String toString()  {

        String output = null;
        try {
            output = "\nDetails for [" + this.stName + "] \n" +
                    "Student Name: " + this.stName + "\n" +
                    "Test Mark: " + this.testMark + "\n" +
                    "Grade: " + this.getGrade() + "\n" +
                    "Results: " + this.geResults() + "\n" +
                    "---------------------------------------";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return output;
    }
}

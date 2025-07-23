public class Student {
    private int StudentId;
    private String StudentName;
    private double Score;

    public Student(int StudentId, String StudentName, double Score){
        this.StudentId = StudentId;
        this.StudentName = StudentName; 
        this.Score = Score;
    }

    public void display(){
        System.out.println("Student ID: " + StudentId);
        System.out.println("Student Name: " + StudentName);
        System.out.println("Score: " + Score);
    }

    public boolean isPassed(){
        return Score>=50;
    }
}

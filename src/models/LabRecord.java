package model;

public class LabRecord {
    private int studentId;
    private String experiment;
    private String result;

    public LabRecord(int studentId, String experiment, String result) {
        this.studentId = studentId;
        this.experiment = experiment;
        this.result = result;
    }

    public int getStudentId() { return studentId; }
    public String getExperiment() { return experiment; }
    public String getResult() { return result; }
}
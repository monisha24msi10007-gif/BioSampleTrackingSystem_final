package model;

public class HealthRecord {
    private int studentId;
    private double temperature;
    private String symptoms;

    public HealthRecord(int studentId, double temperature, String symptoms) {
        this.studentId = studentId;
        this.temperature = temperature;
        this.symptoms = symptoms;
    }

    public int getStudentId() { return studentId; }
    public double getTemperature() { return temperature; }
    public String getSymptoms() { return symptoms; }
}
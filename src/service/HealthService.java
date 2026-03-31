package service;

import database.DBConnection;
import model.HealthRecord;
import java.sql.*;

public class HealthService {

    public void addHealthRecord(HealthRecord r) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO health_records VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, r.getStudentId());
            ps.setDouble(2, r.getTemperature());
            ps.setString(3, r.getSymptoms());

            ps.executeUpdate();
            System.out.println("Health Record Added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
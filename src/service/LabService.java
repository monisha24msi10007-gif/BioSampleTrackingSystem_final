package service;

import database.DBConnection;
import model.LabRecord;
import java.sql.*;

public class LabService {

    public void addRecord(LabRecord r) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO lab_records VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, r.getStudentId());
            ps.setString(2, r.getExperiment());
            ps.setString(3, r.getResult());

            ps.executeUpdate();
            System.out.println("Lab Record Added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
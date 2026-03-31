package service;

import database.DBConnection;
import model.Student;
import java.sql.*;

public class StudentService {

    public void addStudent(Student s) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getDepartment());

            ps.executeUpdate();
            System.out.println("Student Added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        try {
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
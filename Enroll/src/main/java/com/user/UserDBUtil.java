package com.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDBUtil {

    private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    // Validate user login with username and password
    public static List<User> validate(String username, String nic) {
        ArrayList<User> cus = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT * FROM enroll WHERE username='" + username + "' AND nic='" + nic + "'";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                int examId = rs.getInt(2);
                String examTitle = rs.getString(3);
                String subject = rs.getString(4);
                String examDate = rs.getString(5);
                String startTime = rs.getString(6);
                String endTime = rs.getString(7);
                String duration = rs.getString(8);
                String examType = rs.getString(9);
                String specialInstructions = rs.getString(10);
                String invigilator = rs.getString(11);
                String email = rs.getString(12);
                String username1 = rs.getString(13);
                String nic2 = rs.getString(14);

                User c = new User(id, examId, examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator, email, username1, nic2);
                cus.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cus;
    }


    // Insert new customer/exam enrollment with examId as an input
    public static boolean insertCustomer(int examId, String examTitle, String subject, String examDate, String startTime, String endTime, String duration, String examType, String specialInstructions, String invigilator, String email, String username, String nic) {

        boolean isSuccess = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "insert into enroll values (0, '" + examId + "', '" + examTitle + "', '" + subject + "', '" + examDate + "', '" + startTime + "', '" + endTime + "', '" + duration + "', '" + examType + "', '" + specialInstructions + "', '" + invigilator + "', '" + email + "', '" + username + "', '" + nic + "')";
            int rs = stmt.executeUpdate(sql);

            if (rs > 0) {
                isSuccess = true;
            } else {
                isSuccess = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

    // Update customer/exam enrollment details
    public static boolean updateCustomer(String id, String examId, String examTitle, String subject, String examDate, String startTime, String endTime, String duration, String examType, String specialInstructions, String invigilator, String email, String username, String nic) {

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "update enroll set examId='" + examId + "', examTitle='" + examTitle + "', subject='" + subject + "', examDate='" + examDate + "', startTime='" + startTime + "', endTime='" + endTime + "', duration='" + duration + "', examType='" + examType + "', specialInstructions='" + specialInstructions + "', invigilator='" + invigilator + "', email='" + email + "', username='" + username + "', nic='" + nic + "' where id='" + id + "'";
            int rs = stmt.executeUpdate(sql);

            if (rs > 0) {
                isSuccess = true;
            } else {
                isSuccess = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

    // Get customer/exam enrollment details by ID
    public static List<User> getCustomerDetails(String Id) {

        int convertedID = Integer.parseInt(Id);

        ArrayList<User> cus = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from enroll where id='" + convertedID + "'";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                int examId = rs.getInt(2);
                String examTitle = rs.getString(3);
                String subject = rs.getString(4);
                String examDate = rs.getString(5);
                String startTime = rs.getString(6);
                String endTime = rs.getString(7);
                String duration = rs.getString(8);
                String examType = rs.getString(9);
                String specialInstructions = rs.getString(10);
                String invigilator = rs.getString(11);
                String email = rs.getString(12);
                String username = rs.getString(13);
                String nic = rs.getString(14);

                User c = new User(id, examId, examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator, email, username, nic);
                cus.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cus;
    }

    // Delete customer/exam enrollment by ID
    public static boolean deleteCustomer(String id) {

        int convId = Integer.parseInt(id);

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "delete from enroll where id='" + convId + "'";
            int r = stmt.executeUpdate(sql);

            if (r > 0) {
                isSuccess = true;
            } else {
                isSuccess = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }
}

package com.schedule;

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

    // Validate exam schedule based on exam title and exam date
    public static List<User> validate(String examTitle, String examDate) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT * FROM schedule WHERE examTitle='" + examTitle + "' AND examDate='" + examDate + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String subject = rs.getString(3);
                String date = rs.getString(4);
                String startTime = rs.getString(5);
                String endTime = rs.getString(6);
                String duration = rs.getString(7);
                String examType = rs.getString(8);
                String specialInstructions = rs.getString(9);
                String invigilator = rs.getString(10);

                User user = new User(id, title, subject, date, startTime, endTime, duration, examType, specialInstructions, invigilator);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    // Insert new exam schedule
    public static boolean insertExamSchedule(String examTitle, String subject, String examDate, String startTime, String endTime, String duration, String examType, String specialInstructions, String invigilator) {
        boolean isSuccess = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "INSERT INTO schedule VALUES (0, '" + examTitle + "', '" + subject + "', '" + examDate + "', '" + startTime + "', '" + endTime + "', " + duration + ", '" + examType + "', '" + specialInstructions + "', '" + invigilator + "')";
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

    // Get details of a specific exam schedule by ID
    public static List<User> getExamDetails(int id) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT * FROM schedule WHERE id=" + id;
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int examId = rs.getInt(1);
                String examTitle = rs.getString(2);
                String subject = rs.getString(3);
                String examDate = rs.getString(4);
                String startTime = rs.getString(5);
                String endTime = rs.getString(6);
                String duration = rs.getString(7);
                String examType = rs.getString(8);
                String specialInstructions = rs.getString(9);
                String invigilator = rs.getString(10);

                User user = new User(examId, examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    // Get all exam schedules
    public static List<User> getAllSchedules() {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT * FROM schedule";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String examTitle = rs.getString(2);
                String subject = rs.getString(3);
                String examDate = rs.getString(4);
                String startTime = rs.getString(5);
                String endTime = rs.getString(6);
                String duration = rs.getString(7);
                String examType = rs.getString(8);
                String specialInstructions = rs.getString(9);
                String invigilator = rs.getString(10);

                User user = new User(id, examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator);
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    // Update exam schedule
    public static boolean updateExamSchedule(int id, String examTitle, String subject, String examDate, String startTime, String endTime, String duration, String examType, String specialInstructions, String invigilator) {
        boolean isSuccess = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "UPDATE schedule SET examTitle='" + examTitle + "', subject='" + subject + "', examDate='" + examDate + "', startTime='" + startTime + "', endTime='" + endTime + "', duration='" + duration + "', examType='" + examType + "', specialInstructions='" + specialInstructions + "', invigilator='" + invigilator + "' WHERE id=" + id;
            int rs = stmt.executeUpdate(sql);

            isSuccess = (rs > 0);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

 // UserDBUtil.java

 // Delete exam schedule by ID
 public static boolean deleteExamSchedule(int id) {
     boolean isSuccess = false;

     try {
         con = DBConnect.getConnection();
         stmt = con.createStatement();
         String sql = "DELETE FROM schedule WHERE id=" + id;
         int rs = stmt.executeUpdate(sql);

         if (rs > 0) {
             isSuccess = true;
         }

     } catch (Exception e) {
         e.printStackTrace();
     }

     return isSuccess;
 }

}

package com.queries;

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
    
    // Method to validate user by username and email
    public static List<User> validateByUsernameAndEmail(String username, String email) {
        ArrayList<User> users = new ArrayList<>();
        
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            // Query to check if both username and email exist in the database
            String sql = "SELECT * FROM queries WHERE username='" + username + "' AND email='" + email + "'";
            rs = stmt.executeQuery(sql);

            // If a matching record is found, retrieve the details
            while (rs.next()) {
                int id = rs.getInt(1);
                String userUsername = rs.getString(2);
                String userEmail = rs.getString(3);
                String queryCategory = rs.getString(4);
                String queryText = rs.getString(5);
                String submittedAt = rs.getString(6);
                String respondedAt = rs.getString(7);
                String responseText = rs.getString(8);

                // Create a User object with the retrieved details
                User user = new User(id, userUsername, userEmail, queryCategory, queryText, submittedAt, respondedAt, responseText);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources if necessary
        }

        return users;
    }
    
    
    public static boolean emailExists(String email) {
        boolean exists = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT * FROM queries WHERE email='" + email + "'";
            rs = stmt.executeQuery(sql);

            // If a record with this email is found, set exists to true
            if (rs.next()) {
                exists = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the resources (you can add your resource closing logic here)
        }

        return exists;
    }

    public static List<User> validate(String name, String nic) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from queries where nic='" + nic + "' and name='" + name + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString(2);  // New field
                String email = rs.getString(3);     // New field
                String queryCategory = rs.getString(4);
                String queryText = rs.getString(5);
                String submittedAt = rs.getString(6);
                String respondedAt = rs.getString(7);
                String responseText = rs.getString(8);

                User user = new User(id, username, email, queryCategory, queryText, submittedAt, respondedAt, responseText);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return users;
    }

    public static boolean insertCustomer(String username, String email, String queryCategory, String queryText, String submittedAt, String respondedAt, String responseText) {
        boolean isSuccess = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "insert into queries values (0, '" + username + "', '" + email + "', '" + queryCategory + "', '" + queryText + "', '" + submittedAt + "', '" + respondedAt + "', '" + responseText + "')";
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

    public static boolean updateCustomer(int id, String username, String email, String queryCategory, String queryText, String submittedAt, String respondedAt, String responseText) {
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "update queries set username='" + username + "', email='" + email + "', queryCategory='" + queryCategory + "', queryText='" + queryText + "', submittedAt='" + submittedAt + "', respondedAt='" + respondedAt + "', responseText='" + responseText + "' where id=" + id;
            int rs = stmt.executeUpdate(sql);

            isSuccess = rs > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

    public static List<User> getCustomerDetails(int id) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from queries where id=" + id;
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int userId = rs.getInt(1);
                String username = rs.getString(2);  // New field
                String email = rs.getString(3);     // New field
                String queryCategory = rs.getString(4);
                String queryText = rs.getString(5);
                String submittedAt = rs.getString(6);
                String respondedAt = rs.getString(7);
                String responseText = rs.getString(8);

                User user = new User(userId, username, email, queryCategory, queryText, submittedAt, respondedAt, responseText);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public static List<User> getAllAdmins() {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from queries";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString(2);  // New field
                String email = rs.getString(3);     // New field
                String queryCategory = rs.getString(4);
                String queryText = rs.getString(5);
                String submittedAt = rs.getString(6);
                String respondedAt = rs.getString(7);
                String responseText = rs.getString(8);

                User user = new User(id, username, email, queryCategory, queryText, submittedAt, respondedAt, responseText);
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public static boolean deleteUser(int id) {
        boolean isSuccess = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "DELETE FROM queries WHERE id=" + id;
            int result = stmt.executeUpdate(sql);

            if (result > 0) {
                isSuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources (you can add your resource closing logic here)
        }

        return isSuccess;
    }

}

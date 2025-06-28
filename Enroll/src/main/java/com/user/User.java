package com.user;

public class User {
    private int id;                      // User ID
    private int examId;                  // Exam ID
    private String examTitle;            // Title of the exam
    private String subject;              // Subject of the exam
    private String examDate;             // Scheduled date of the exam
    private String startTime;            // Exam start time
    private String endTime;              // Exam end time
    private String duration;             // Duration of the exam in minutes
    private String examType;             // Type of exam (e.g., multiple-choice, essay)
    private String specialInstructions;  // Any special instructions for the exam
    private String invigilator;          // Invigilator's name
    private String email;                // User's email
    private String username;             // User's username
    private String nic;                  // User's National Identity Card (NIC)

    // Constructor
    public User(int id, int examId, String examTitle, String subject, String examDate, String startTime, 
                String endTime, String duration, String examType, String specialInstructions, String invigilator, 
                String email, String username, String nic) {
        
        this.id = id;
        this.examId = examId;
        this.examTitle = examTitle;
        this.subject = subject;
        this.examDate = examDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.examType = examType;
        this.specialInstructions = specialInstructions;
        this.invigilator = invigilator;
        this.email = email;
        this.username = username;
        this.nic = nic;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getExamId() {
        return examId;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public String getSubject() {
        return subject;
    }

    public String getExamDate() {
        return examDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getDuration() {
        return duration;
    }

    public String getExamType() {
        return examType;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getNic() {
        return nic;
    }
}

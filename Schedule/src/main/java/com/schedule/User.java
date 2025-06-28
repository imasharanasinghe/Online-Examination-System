package com.schedule;

public class User {
    private int id;
    private String examTitle;             // Title of the exam
    private String subject;               // Subject of the exam
    private String examDate;              // Scheduled date of the exam
    private String startTime;             // Exam start time
    private String endTime;               // Exam end time
    private String duration;                 // Duration of the exam in minutes
    private String examType;              // Type of exam (e.g., multiple-choice, essay)
    private String specialInstructions;   // Any special instructions for the exam
    private String invigilator;           // Assigned invigilator name
	public User(int id, String examTitle, String subject, String examDate, String startTime, String endTime,
			String duration, String examType, String specialInstructions, String invigilator) {
		super();
		this.id = id;
		this.examTitle = examTitle;
		this.subject = subject;
		this.examDate = examDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.examType = examType;
		this.specialInstructions = specialInstructions;
		this.invigilator = invigilator;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExamTitle() {
		return examTitle;
	}
	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public String getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	public String getInvigilator() {
		return invigilator;
	}
	public void setInvigilator(String invigilator) {
		this.invigilator = invigilator;
	}

   
}

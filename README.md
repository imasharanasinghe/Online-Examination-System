# Online Examination System (OES)

A comprehensive web-based examination management system built with Java JSP and MySQL.

## 🎯 Features

- **User Management**: Student registration, login, and profile management
- **Exam Scheduling**: Admin can schedule exams with detailed information
- **Exam Enrollment**: Students can enroll for available exams
- **Query Management**: Students can submit inquiries and track responses
- **Admin Dashboard**: Complete administrative control over the system

## 🏗️ Project Structure

```
OES/
├── Main/                 # Main application module
├── User/                 # User management module
├── Schedule/             # Exam scheduling module
├── Enroll/               # Exam enrollment module
├── Inqueries/            # Query management module
├── Examination.sql       # Database schema
└── README.md            # This file
```

## 🛠️ Technology Stack

- **Backend**: Java JSP, Servlets
- **Database**: MySQL
- **Frontend**: HTML, CSS, JavaScript
- **Server**: Apache Tomcat
- **Build Tool**: Maven (recommended)

## 📋 Prerequisites

- Java JDK 8 or higher
- Apache Tomcat 8.5 or higher
- MySQL 8.0 or higher
- Eclipse/IntelliJ IDEA (for development)

## 🚀 Installation & Setup

### 1. Database Setup
```sql
-- Import the database schema
mysql -u your_username -p < Examination.sql
```

### 2. Project Setup
1. Clone this repository
2. Import the project into your IDE as a Java Web Project
3. Configure your database connection in the servlet configuration
4. Deploy to Tomcat server

### 3. Configuration
- Update database connection settings in your servlet configuration
- Ensure Tomcat is running on port 8090 (as referenced in JSP files)

## 🎮 Usage

### For Students:
1. Register/Login at `http://localhost:8090/User/Login.jsp`
2. Browse available exams
3. Enroll for exams
4. Submit queries if needed

### For Administrators:
1. Login at `http://localhost:8090/Main/AdminLogin.jsp`
   - Username: `admin`
   - Password: `123`
2. Schedule new exams
3. Manage student enrollments
4. Respond to student queries

## 📊 Database Schema

### Tables:
- **user**: User registration and authentication
- **schedule**: Exam scheduling information
- **enroll**: Student exam enrollments
- **queries**: Student inquiries and responses

## 🔧 Development

### Adding New Features:
1. Create new JSP files in appropriate modules
2. Add corresponding servlets for backend logic
3. Update database schema if needed
4. Test thoroughly before deployment

### Code Structure:
- Each module has its own webapp directory
- Follow MVC pattern for clean code organization
- Use consistent naming conventions

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the ISC License - see the LICENSE file for details.

## 👥 Authors

- **Your Name** - *Initial work* - [YourGitHub](https://github.com/yourusername)

## 🙏 Acknowledgments

- Java EE community
- MySQL documentation
- Apache Tomcat team

## 📞 Support

If you encounter any issues or have questions, please:
1. Check the existing issues
2. Create a new issue with detailed description
3. Contact the maintainers

---

**Note**: This is a Java web application. Do not use `npm start` as this is not a Node.js project. 
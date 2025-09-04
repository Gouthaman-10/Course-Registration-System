# 📘 Students Course Registration Management (Backend)

## 📌 Project Overview  
**Students Course Registration Management** is a backend-driven application developed with **Spring Boot (Java)** and **MySQL**.  
It provides RESTful APIs to manage **students, courses, and registrations**, tested with **Postman**.  
The frontend is kept minimal (HTML + TailwindCSS + JS) only to consume APIs, while the core functionality resides in the backend.  

---

## ⚡ Tech Stack  

### 🔹 Backend  
- Java (Spring Boot)  
- MySQL Database  
- Spring Data JPA / Hibernate  
- RESTful APIs  

### 🔹 Tools  
- IntelliJ IDEA (Backend Development)  
- Postman (API Testing)  
- Git & GitHub (Version Control)  

---

## 🚀 Features  
✔️ REST APIs for Student CRUD Operations  
✔️ REST APIs for Course Management  
✔️ Student-Course Registration Endpoint  
✔️ Database Integration with MySQL  
✔️ API Testing using Postman  

---

## 🏗️ Project Structure 

restaurant-management/
- ├── controller
- │ └── Course_Controller.java
- ├── model
- │ ├── Course.java
- │ └── Course_reg.java
- ├── repository
- │ ├── Course_Repository.java
- │ └── Course_Register.java
- ├── service
- │ └── Course_Service.java
- └── RestaurantManagementApplication.java

---

## 📬 API Endpoints  

| Method | Endpoint              | Description                 |
| ------ | --------------------- | --------------------------- |
| GET    | `/courses/students`   | Get all students            | 
| GET    | `/courses`            | Get all courses             | 
| POST   | `/courses/entroll`    | Add new course              | 
| POST   | `/courses/register`   | Register student to course  | 

---

## 🧪 Testing with Postman  

- CRUD APIs tested successfully  
- Verified student registration and course mapping  
- Postman collection available in `/postman/collection.json`  

📷 *Sample Screenshot*  

<img width="1887" height="935" alt="Screenshot 2025-09-03 001606" src="https://github.com/user-attachments/assets/fbd098f6-1713-4bc4-8456-ec060a32416a" />
<img width="1887" height="948" alt="Screenshot 2025-09-03 001638" src="https://github.com/user-attachments/assets/e938dc64-994c-4228-97bd-7720a437d015" />
<img width="1920" height="960" alt="Screenshot 2025-09-03 001922" src="https://github.com/user-attachments/assets/cb9b7453-1e04-4a72-9586-3676f1d8d9eb" />

---

## 💻 Development Screenshots  

<img width="1915" height="900" alt="Screenshot 2025-09-03 000110" src="https://github.com/user-attachments/assets/1d1dc8e2-ace2-4efd-aed9-e4f4c997fde3" />
<img width="1897" height="901" alt="Screenshot 2025-09-03 000123" src="https://github.com/user-attachments/assets/11715a0a-c8af-4425-b4c1-74fe8159759a" />
<img width="1886" height="897" alt="Screenshot 2025-09-03 000135" src="https://github.com/user-attachments/assets/5f992af0-badf-4261-a378-695b42bd95f5" />
<img width="1885" height="907" alt="Screenshot 2025-09-03 001324" src="https://github.com/user-attachments/assets/f6e4fcee-ff21-4b78-b08b-193fb0f02fe0" />

---

## 🔮 Future Updates  

🚀 Planned enhancements for upcoming versions:  
- 🔑 Authentication & Authorization with **Spring Security + JWT**  
- 📊 Admin dashboard for managing students & courses  
- 📧 Email / SMS notification service for enrollment updates  
- ☁️ Cloud deployment (AWS / Heroku)  
- 🖥️ Extended frontend with React or Angular  

---

## 👨‍💻 Author  

**Gouthaman M**  
🎓 BE Biomedical Engineering | 🚀 Full Stack Java Developer Learner  

---

# 📂 Spring Boot LOB File Upload & Retrieval Demo

This project demonstrates how to use **Spring Boot** with JPA/Hibernate `@Lob` annotation to upload and store **images** and **text files** directly into a SQL database, and then retrieve them for display or download.

---

## 🚀 Features
- Upload **images (JPEG/PNG)** and **text files** via REST API or web form.
- Store files in SQL database using `@Lob` (Large Object).
- Retrieve and display/download stored files.
- Simple demo UI for testing file upload & retrieval.
- Maven-based Spring Boot project.

---

## 🛠️ Tech Stack
- **Spring Boot** (MVC + Data JPA)
- **Hibernate/JPA** (`@Lob` for large object storage)
- **Maven**
- **SQL Database** (MySQL/PostgreSQL/any JDBC-supported DB)
- **Thymeleaf** (optional demo UI)

---

## 📑 How It Works
1. **Upload File**
   - User uploads an image or text file.
   - File is converted into a byte array and stored in DB using `@Lob`.

2. **Retrieve File**
   - Application fetches the stored file from DB.
   - Images are displayed in the browser.
   - Text files are downloaded or shown as plain text.

---

## ⚙️ Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/BootMVCProj14-LOB-uploadingPicsNDdocs.git
   cd BootMVCProj14-LOB-uploadingPicsNDdocs

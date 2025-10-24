# 📘 Book Management API

A simple **Spring Boot REST API** that lets you manage books (add, update, view, and delete) using in-memory storage.

---

## 🚀 How to Run

1. Open the project in **IntelliJ IDEA** or any IDE.  
2. Run the main class:  BookManagementApiApplication.java
3. The server will start at: http://localhost:8080

---

## 🧩 Endpoints

➕ Add Book
**POST** `/book`  
**Body:**
```json
{
"id": 1,
"title": "Spring Boot Basics",
"author": "Ruturaj",
"price": 499.99
}

📚 Get All Books

GET /book

🔍 Get Book by ID

GET /book/{id}

✏️ Update Book

PUT /book/{id}
Body:

{
  "id": 1,
  "title": "Spring Boot Advanced",
  "author": "Ruturaj",
  "price": 599.99
}

❌ Delete Book

DELETE /book/{id}

🛠 Notes

Uses in-memory HashMap, so data resets after restart.

All requests must have header:
Example URL:  http://localhost:8080/book

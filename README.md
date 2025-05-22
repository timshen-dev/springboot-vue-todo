# 📝 Todo List App (Spring Boot + Vue.js)

This is a task management system with a front-end and back-end separation. The back-end is powered by **Spring Boot**, providing a RESTful API, and the front-end is built with **Vue 3 + Vite** to create a single-page application. This project is simple but comprehensive, making it an ideal choice for full-stack beginners.

---

## 🚀 Technology Stack

### 🔧 Back-End (Spring Boot)
- Spring Boot 3.x
- Spring Web (REST API)
- Spring Data JPA (H2 In-Memory Database)
- Lombok
- Maven for Build

### 🎨 Front-End (Vue 3)
- Vue 3 + Composition API
- Vite for Fast Build
- Axios (for API Communication)
- Bootstrap 5 (UI Styling)

---

## 📁 Project Structure

my-project/
├── backend/ # Spring Boot Project
└── frontend/ # Vue Project

yaml
Copy
Edit

---

## ▶️ Quick Start

### Back-End Setup (Spring Boot)

1. Open your IDE and import the `backend` project.
2. Run the `TodoAppApplication.java` class.
3. The default API will be available at `http://localhost:8080/api/tasks`.

> The back-end uses H2 as an in-memory database, so no additional database setup is required.

---

### Front-End Setup (Vue)

1. Open a terminal and navigate to the `frontend` directory:
    ```bash
    cd frontend
    ```

2. Install the required dependencies:
    ```bash
    npm install
    ```

3. Run the Vue development server:
    ```bash
    npm run dev
    ```

---

## 🔧 Core Features

- ✅ Add tasks
- ✅ View task list
- ✅ Delete tasks
- ✅ Toggle task completion status
- ✅ Full front-end and back-end separation
- ✅ RESTful API endpoints

---

## 🧪 API Endpoints (Brief Overview)

| Method | Path                        | Description                      |
|--------|-----------------------------|----------------------------------|
| GET    | `/api/tasks`                | Get all tasks                    |
| POST   | `/api/tasks`                | Add a new task                   |
| DELETE | `/api/tasks/{id}`           | Delete a task                    |
| PUT    | `/api/tasks/{id}/toggle`    | Toggle task completion status    |

---

## 📦 TODO / Future Enhancements

- User authentication (Spring Security / JWT)
- Use PostgreSQL + Flyway for database migration
- Dockerize the application
- Implement pagination and modular routing with Vue Router
- Add task deadlines, notes, priority, etc.

---

## 📜 License

This project is licensed under the MIT License.

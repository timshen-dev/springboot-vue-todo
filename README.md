# 📝 Todo List App (Spring Boot + Vue.js)

这是一个前后端分离的任务管理系统，使用 **Spring Boot** 提供 RESTful 接口，前端采用 **Vue 3 + Vite** 实现单页应用界面。功能简单、技术全面，适合作为全栈入门项目练习。

---

## 🚀 技术栈

### 🔧 后端（Spring Boot）
- Spring Boot 3.x
- Spring Web (REST API)
- Spring Data JPA (H2 内存数据库)
- Lombok
- Maven 构建

### 🎨 前端（Vue 3）
- Vue 3 + Composition API
- Vite 快速构建工具
- Axios（API 通信）
- Bootstrap 5（UI 样式）

---

## 📁 项目结构
my-project/
├── backend/    # Spring Boot 项目
└── frontend/   # Vue 项目

---

## ▶️ 快速开始

### 后端启动（Spring Boot）

1. 打开 IDE，导入 `backend` 项目
2. 启动 `TodoAppApplication.java`
3. 默认接口运行在 `http://localhost:8080/api/tasks`

> 后端无需数据库配置，使用 H2 内存数据库

---

### 前端启动（Vue）

```bash
cd frontend
npm install
npm run dev

🔧 主要功能
	•	✅ 添加任务
	•	✅ 查看任务列表
	•	✅ 删除任务
	•	✅ 切换任务完成状态
	•	✅ 前后端完全分离
	•	✅ RESTful API 接口

🧪 API 接口列表（简要）
方法
路径
功能描述
GET
/api/tasks
获取全部任务
POST
/api/tasks
添加新任务
DELETE
/api/tasks/{id}
删除任务
PUT
/api/tasks/{id}/toggle
切换任务完成状态

📦 TODO / 可扩展功能
	•	登录/注册功能（Spring Security / JWT）
	•	使用 PostgreSQL + Flyway 管理数据库
	•	Docker 化部署
	•	使用 Vue Router 分页 & 路由模块化
	•	加入任务截止时间、备注、优先级等字段

📜 License

本项目基于 MIT License 开源。

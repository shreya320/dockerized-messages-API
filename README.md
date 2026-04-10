# 📝 Notes API (Dockerized)

A simple backend application built using Spring Boot and PostgreSQL, fully containerized using Docker.

---

## 🚀 Features

* Create a note
* Get all notes
* Persistent storage using PostgreSQL
* Dockerized backend + database

---

## 🛠️ Tech Stack

* Java (Spring Boot)
* PostgreSQL
* Docker & Docker Compose

---

## ⚙️ How to Run

### 1. Build the project

```bash
mvn clean package
```

### 2. Run using Docker

```bash
docker-compose up --build
```

---

## 📡 API Endpoints

### Create Note

POST `/notes`

### Get Notes

GET `/notes`

---

## 💾 Persistence

Data is stored using Docker volumes.
Even after restarting containers, data remains intact.

---

## 📌 Learning Outcome

* Dockerizing a Spring Boot application
* Running multi-container apps using Docker Compose
* Connecting backend with PostgreSQL in Docker
* Handling data persistence using volumes

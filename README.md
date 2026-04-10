# 📝 Dockerized Notes API

A backend application built using Spring Boot and PostgreSQL, containerized using Docker and Docker Compose.

---

## 🚀 Features

* Create and retrieve notes
* REST API using Spring Boot
* PostgreSQL database integration
* Fully Dockerized (multi-container setup)
* Persistent storage using Docker volumes

---

## 🛠️ Tech Stack

* Java (Spring Boot)
* PostgreSQL
* Docker & Docker Compose

---

## 🏗️ Architecture

* `messages-app` → Spring Boot backend
* `postgres` → Database
* Docker Compose connects both services

---

## ⚙️ How to Run

### 1. Build the application

mvn clean package

### 2. Run using Docker

docker-compose up --build

---

## 📡 API Endpoints

* POST `/notes` → Create note
* GET `/notes` → Get all notes

---

## 💾 Persistence

Data is stored using Docker volumes.
Restarting containers does NOT delete data.

---

## 🎯 What I Learned

* Dockerizing a backend application
* Running multi-container systems using Docker Compose
* Connecting services using Docker networking
* Handling database persistence

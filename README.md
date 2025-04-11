# ✈️ Trip Planner API

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
<p align="center">
  ☕ <strong>Java 23</strong> | 
  🌿 <strong>Spring Boot 3.4.4</strong> | 
  💾 <strong>H2 2.2.224</strong>
</p>

A RESTful API for managing trips, participants, activities, and related resources.

## Features

### Trip Management:
- Create, read, update, and manage trips
- Each trip has unique details (destination, dates, owner)
- Confirm trip status

### Participant Management:
- Invite participants to trips
- Confirm participant attendance
- Track participant details

### Activity Management:
- Create activities for trips
- Manage activity schedules
- View all trip activities

### Link Management:
- Share relevant links for trips
- Organize trip resources

## Technologies
- Java 23
- Spring Boot 3.4.4
- Spring Data JPA
- H2 Database (or MySQL/PostgreSQL)
- Maven

## API Endpoints

### ✈️ Trips

| Method | Endpoint | Description | Request Example |
|--------|----------|-------------|------------------|
| POST | `/trips` | Create trip | `{"destination":"Paris","starts_at":"2023-12-01T00:00:00","ends_at":"2023-12-10T00:00:00","emails_to_invite":["email@test.com"],"owner_email":"owner@test.com","owner_name":"John Doe"}` |
| GET | `/trips/{id}` | Get trip | - |
| PUT | `/trips/{id}` | Update trip | `{"destination":"London"}` |
| GET | `/trips/{id}/confirm` | Confirm trip | - |

### 👥 Participants

| Method | Endpoint | Description | Request Example |
|--------|----------|-------------|------------------|
| GET | `/trips/{id}/participants` | List participants | - |
| POST | `/trips/{id}/invite` | Invite participant | `{"name":"Mary","email":"mary@test.com"}` |
| POST | `/participants/{id}/confirm` | Confirm participant | `{"name":"Mary","email":"mary@test.com"}` |

### 🎡 Activities

| Method | Endpoint | Description | Request Example |
|--------|----------|-------------|------------------|
| POST | `/trips/{id}/activities` | Create activity | `{"title":"City Tour","occurs_at":"2023-12-05T09:00:00"}` |
| GET | `/trips/{id}/activities` | List activities | - |

### 🔗 Links

| Method | Endpoint | Description | Request Example |
|--------|----------|-------------|------------------|
| POST | `/trips/{id}/links` | Add link | `{"title":"Travel Guide","url":"https://example.com/guide"}` |
| GET | `/trips/{id}/links` | List links | - |

## How to Run

### Prerequisites
- Java 21+
- Maven 3.8+

### Steps
1. Clone repository:
```bash
git clone https://github.com/Zenx007/Planner.git
cd trip-planner

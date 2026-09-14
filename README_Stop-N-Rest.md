# Stop-N-Rest

A Spring Boot REST API for managing hotel rooms and reservations. The
project focuses on clean backend API design, booking validation, and
prevention of overlapping reservations.

## Features

- Create and list hotel rooms
- Create and list reservations
- Validate booking dates
- Prevent overlapping bookings for the same room
- Cancel existing bookings
- RESTful API endpoints
- JPA-based persistence
- H2 database for lightweight local development

## Tech Stack

- Java 17
- Spring Boot 3.3.5
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

``` text
stop-n-rest/
├── src/
│   └── main/
│       ├── java/com/stopnrest/
│       │   ├── controller/
│       │   │   ├── BookingController.java
│       │   │   └── RoomController.java
│       │   ├── model/
│       │   │   ├── Booking.java
│       │   │   └── Room.java
│       │   ├── repository/
│       │   │   ├── BookingRepository.java
│       │   │   └── RoomRepository.java
│       │   ├── service/
│       │   │   └── BookingService.java
│       │   └── StopNRestApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.8+
- Git

### Run Locally

``` bash
git clone https://github.com/2025kpad1001/stop-n-rest.git
cd stop-n-rest
mvn spring-boot:run
```

The API runs at `http://localhost:8080`.

## API Endpoints

### Rooms

| Method | Endpoint     | Description    |
|--------|--------------|----------------|
| GET    | `/api/rooms` | Get all rooms  |
| POST   | `/api/rooms` | Add a new room |

Example:

``` json
{
  "number": "101",
  "type": "Deluxe",
  "price": 2499
}
```

### Bookings

| Method | Endpoint             | Description      |
|--------|----------------------|------------------|
| GET    | `/api/bookings`      | Get all bookings |
| POST   | `/api/bookings`      | Create a booking |
| DELETE | `/api/bookings/{id}` | Cancel a booking |

Example:

``` json
{
  "guestName": "Aman",
  "roomId": 1,
  "checkIn": "2026-10-01",
  "checkOut": "2026-10-03"
}
```

## Booking Validation

The booking service checks that the room exists, check-in is before
check-out, and the room has no overlapping reservation for the requested
dates.

## Database

The project uses an in-memory H2 database, so no external database setup
is required for local development.

## Testing

Use Postman or another REST client to:

1.  Create a room.
2.  Use the returned room ID to create a booking.
3.  Try an overlapping booking to verify conflict validation.
4.  List bookings.
5.  Cancel a booking.

## Future Improvements

- Authentication and authorization
- PostgreSQL/MySQL support
- Docker and Docker Compose
- Swagger/OpenAPI documentation
- Global exception handling
- Unit and integration tests
- Payment integration

## License

This project is intended for educational and portfolio purposes.

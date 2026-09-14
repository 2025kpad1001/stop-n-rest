# Stop-N-Rest

A Spring Boot REST API for hotel room management and booking.

## Features
- Room creation and listing
- Booking creation with date validation
- Prevents overlapping room bookings
- Booking listing and cancellation
- H2 database for easy local development

## Tech Stack
Java 17, Spring Boot, Spring Data JPA, REST API, H2, Maven.

## Run
```bash
mvn spring-boot:run
```

API:
- `GET /api/rooms`
- `POST /api/rooms`
- `GET /api/bookings`
- `POST /api/bookings`
- `DELETE /api/bookings/{id}`

Example room:
```json
{"number":"101","type":"Deluxe","price":2499}
```

Example booking:
```json
{"guestName":"Aman","roomId":1,"checkIn":"2026-10-01","checkOut":"2026-10-03"}
```

## Note
This is a fresh implementation based on the project description in the resume, not recovered original source code.

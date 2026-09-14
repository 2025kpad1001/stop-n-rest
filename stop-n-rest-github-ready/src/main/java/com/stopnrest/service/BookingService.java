package com.stopnrest.service;
import com.stopnrest.model.*; import com.stopnrest.repository.*; import org.springframework.stereotype.Service;
import java.time.LocalDate;
@Service
public class BookingService {
 private final BookingRepository bookings; private final RoomRepository rooms;
 public BookingService(BookingRepository b, RoomRepository r){bookings=b;rooms=r;}
 public Booking create(Booking b){
   if(!rooms.existsById(b.getRoomId())) throw new IllegalArgumentException("Room not found");
   if(!b.getCheckIn().isBefore(b.getCheckOut())) throw new IllegalArgumentException("Invalid dates");
   if(bookings.existsByRoomIdAndCheckInLessThanAndCheckOutGreaterThan(b.getRoomId(),b.getCheckOut(),b.getCheckIn()))
     throw new IllegalStateException("Room is already booked for these dates");
   return bookings.save(b);
 }
}
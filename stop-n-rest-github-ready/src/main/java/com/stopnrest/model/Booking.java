package com.stopnrest.model;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity
public class Booking {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private String guestName; private Long roomId; private LocalDate checkIn; private LocalDate checkOut;
  public Long getId(){return id;} public String getGuestName(){return guestName;} public void setGuestName(String v){guestName=v;}
  public Long getRoomId(){return roomId;} public void setRoomId(Long v){roomId=v;} public LocalDate getCheckIn(){return checkIn;}
  public void setCheckIn(LocalDate v){checkIn=v;} public LocalDate getCheckOut(){return checkOut;} public void setCheckOut(LocalDate v){checkOut=v;}
}
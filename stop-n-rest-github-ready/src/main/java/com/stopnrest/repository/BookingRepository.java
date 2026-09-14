package com.stopnrest.repository;
import com.stopnrest.model.Booking; import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
public interface BookingRepository extends JpaRepository<Booking,Long> {
 boolean existsByRoomIdAndCheckInLessThanAndCheckOutGreaterThan(Long roomId, LocalDate out, LocalDate in);
}
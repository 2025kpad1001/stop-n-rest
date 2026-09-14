package com.stopnrest.controller;
import com.stopnrest.model.Booking; import com.stopnrest.repository.BookingRepository; import com.stopnrest.service.BookingService;
import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/bookings")
public class BookingController {
 private final BookingRepository repo; private final BookingService service;
 public BookingController(BookingRepository r, BookingService s){repo=r;service=s;}
 @GetMapping public List<Booking> all(){return repo.findAll();}
 @PostMapping public Booking create(@RequestBody Booking b){return service.create(b);}
 @DeleteMapping("/{id}") public void cancel(@PathVariable Long id){repo.deleteById(id);}
}